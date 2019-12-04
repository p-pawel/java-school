package programator.katowice.tdd;

public class NewPalindrome {
	public boolean check(String s) {
		if (s == null) {
			return true;
		}
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
