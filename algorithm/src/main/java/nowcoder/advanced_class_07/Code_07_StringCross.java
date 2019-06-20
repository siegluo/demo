package nowcoder.advanced_class_07;

public class Code_07_StringCross {

	public static boolean isCross1(String str1, String str2, String aim) {
		if (str1 == null || str2 == null || aim == null) {
			return false;
		}
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		char[] chaim = aim.toCharArray();
		if (chaim.length != ch1.length + ch2.length) {
			return false;
		}
		boolean[][] dp = new boolean[ch1.length + 1][ch2.length + 1];
		dp[0][0] = true;
		for (int i = 1; i <= ch1.length; i++) {
			if (ch1[i - 1] != chaim[i - 1]) {
				break;
			}
			dp[i][0] = true;
		}
		for (int j = 1; j <= ch2.length; j++) {
			if (ch2[j - 1] != chaim[j - 1]) {
				break;
			}
			dp[0][j] = true;
		}
		for (int i = 1; i <= ch1.length; i++) {
			for (int j = 1; j <= ch2.length; j++) {
				if ((ch1[i - 1] == chaim[i + j - 1] && dp[i - 1][j])
						|| (ch2[j - 1] == chaim[i + j - 1] && dp[i][j - 1])) {
					dp[i][j] = true;
				}
			}
		}
		return dp[ch1.length][ch2.length];
	}

	public static boolean isCross2(String str1, String str2, String aim) {
		if (str1 == null || str2 == null || aim == null) {
			return false;
		}
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		char[] chaim = aim.toCharArray();
		if (chaim.length != ch1.length + ch2.length) {
			return false;
		}
		char[] longs = ch1.length >= ch2.length ? ch1 : ch2;
		char[] shorts = ch1.length < ch2.length ? ch1 : ch2;
		boolean[] dp = new boolean[shorts.length + 1];
		dp[0] = true;
		for (int i = 1; i <= shorts.length; i++) {
			if (shorts[i - 1] != chaim[i - 1]) {
				break;
			}
			dp[i] = true;
		}
		for (int i = 1; i <= longs.length; i++) {
			dp[0] = dp[0] && longs[i - 1] == chaim[i - 1];
			for (int j = 1; j <= shorts.length; j++) {
				if ((longs[i - 1] == chaim[i + j - 1] && dp[j])
						|| (shorts[j - 1] == chaim[i + j - 1] && dp[j - 1])) {
					dp[j] = true;
				} else {
					dp[j] = false;
				}
			}
		}
		return dp[shorts.length];
	}

	public static void main(String[] args) {
		String str1 = "1234";
		String str2 = "abcd";
		String aim = "1a23bcd4";
		System.out.println(isCross1(str1, str2, aim));
		System.out.println(isCross2(str1, str2, aim));

	}

}
