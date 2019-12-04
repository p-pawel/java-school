package programator.katowice.testujemy;

public class NumberTranslator {

	private final static String[] translations = {"zero", "jeden", "dwa", "trzy", "cztery", "pięć", "szść", "siedem", "osiem", "dziewięć", "dzisięć"};

	public String translate(int x) {
		return translations[x];
	}
}
