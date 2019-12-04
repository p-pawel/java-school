package programator.katowice;

import org.apache.commons.text.similarity.LevenshteinDistance;

public class App {
	public static void main(String[] args) {
		Integer distance = new LevenshteinDistance().apply("pies", "kot");
		System.out.println(distance);
	}
}
