package nowcoder.class_08;

public class FaceBook {

	public static int number(char[] chs, int i) {
		if (i == chs.length) {
			return 1;
		}
		if (chs[i] == '0') {
			return 0;
		}
		if (chs[i] == '1') {
			int res = number(chs, i + 1);
			if(i + 1 < chs.length) {
				res += number(chs, i + 2);
			}
			return res;
		}
		if (chs[i] == '2') {
			int res = number(chs, i + 1);
			if (i + 1 < chs.length 
					&& (chs[i + 1]  >= '0' && chs[i + 1]  <= '6')) {
				res += number(chs, i + 2);
			}
			return res;
		}
		return number(chs, i+1);
	}

}
