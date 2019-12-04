package programator.katowice.testujemy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class PalindromeTest {

	@ParameterizedTest
	@ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
//	@ValueSource(ints = { 0 , 2, 3 })
	void palindromes(String xxx) {
		assertTrue(Palindrome.isPalindrome(xxx));
	}

	@ParameterizedTest
	@MethodSource("methodSource")
	void testByMethodSource(String value) {
		assertTrue(Palindrome.isPalindrome(value));
	}

	static Stream<String> methodSource() {
		return IntStream.range(0, 3)
				.mapToObj(Integer::toString)
				.map(e -> e + "kayak" + e);
	}

}
