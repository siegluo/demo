package nowcoder.advanced_class_06;

public class Code_03_RegularExpressionMatch {

	public static boolean isValid(char[] s, char[] e) {
		for (int i = 0; i < s.length; i++) {
			if (s[i] == '*' || s[i] == '.') {
				return false;
			}
		}
		for (int i = 0; i < e.length; i++) {
			if (e[i] == '*' && (i == 0 || e[i - 1] == '*')) {
				return false;
			}
		}
		return true;
	}

	public static boolean isMatch(String str, String exp) {
		if (str == null || exp == null) {
			return false;
		}
		char[] s = str.toCharArray();
		char[] e = exp.toCharArray();
		return isValid(s, e) ? process(s, e, 0, 0) : false;
	}

	public static boolean process(char[] s, char[] e, int si, int ei) {
		if (ei == e.length) {
			return si == s.length;
		}
		if (ei + 1 == e.length || e[ei + 1] != '*') {
			return si != s.length && (e[ei] == s[si] || e[ei] == '.')
					&& process(s, e, si + 1, ei + 1);
		}
		while (si != s.length && (e[ei] == s[si] || e[ei] == '.')) {
			if (process(s, e, si, ei + 2)) {
				return true;
			}
			si++;
		}
		return process(s, e, si, ei + 2);
	}

	public static boolean isMatchDP(String str, String exp) {
		if (str == null || exp == null) {
			return false;
		}
		char[] s = str.toCharArray();
		char[] e = exp.toCharArray();
		if (!isValid(s, e)) {
			return false;
		}
		boolean[][] dp = initDPMap(s, e);
		for (int i = s.length - 1; i > -1; i--) {
			for (int j = e.length - 2; j > -1; j--) {
				if (e[j + 1] != '*') {
					dp[i][j] = (s[i] == e[j] || e[j] == '.')
							&& dp[i + 1][j + 1];
				} else {
					int si = i;
					while (si != s.length && (s[si] == e[j] || e[j] == '.')) {
						if (dp[si][j + 2]) {
							dp[i][j] = true;
							break;
						}
						si++;
					}
					if (dp[i][j] != true) {
						dp[i][j] = dp[si][j + 2];
					}
				}
			}
		}
		return dp[0][0];
	}

	public static boolean[][] initDPMap(char[] s, char[] e) {
		int slen = s.length;
		int elen = e.length;
		boolean[][] dp = new boolean[slen + 1][elen + 1];
		dp[slen][elen] = true;
		for (int j = elen - 2; j > -1; j = j - 2) {
			if (e[j] != '*' && e[j + 1] == '*') {
				dp[slen][j] = true;
			} else {
				break;
			}
		}
		if (slen > 0 && elen > 0) {
			if ((e[elen - 1] == '.' || s[slen - 1] == e[elen - 1])) {
				dp[slen - 1][elen - 1] = true;
			}
		}
		return dp;
	}

	public static void main(String[] args) {
		String str = "abcccdefg";
		String exp = "ab.*d.*e.*";
		System.out.println(isMatch(str, exp));
		System.out.println(isMatchDP(str, exp));

	}

}
