package programator.katowice.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NewPalindromeTest {

	@Test
	void testCreateInstance() {
		NewPalindrome newPalindrome = new NewPalindrome();
	}

	@Test
	void testMethod() {
		NewPalindrome newPalindrome = new NewPalindrome();
		newPalindrome.check(null);
	}

	@Test
	void testEmpty() {
		// given
		NewPalindrome newPalindrome = new NewPalindrome();

		// when
		boolean result = newPalindrome.check("");

		// then
		assertThat(result).isTrue();
	}

	@Test
	void testSingleChar() {
		// given
		NewPalindrome newPalindrome = new NewPalindrome();

		// when
		boolean result = newPalindrome.check("a");

		// then
		assertThat(result).isTrue();
	}

	@Test
	void testDoubleChar() {
		// given
		NewPalindrome newPalindrome = new NewPalindrome();

		// when
		boolean result = newPalindrome.check("aa");

		// then
		assertThat(result).isTrue();
	}

	@Test
	void testTwoDifferentChars() {
		// given
		NewPalindrome newPalindrome = new NewPalindrome();

		// when
		boolean result = newPalindrome.check("ab");

		// then
		assertThat(result).isFalse();
	}

	@Test
	void test3DifferentChars() {
		// given
		NewPalindrome newPalindrome = new NewPalindrome();

		// when
		boolean result = newPalindrome.check("abc");

		// then
		assertThat(result).isFalse();
	}

	@Test
	void test3aDifferentChars() {
		// given
		NewPalindrome newPalindrome = new NewPalindrome();

		// when
		boolean result = newPalindrome.check("aba");

		// then
		assertThat(result).isTrue();
	}
	@Test
	void test4DifferentChars() {
		// given
		NewPalindrome newPalindrome = new NewPalindrome();

		// when
		boolean result = newPalindrome.check("abab");

		// then
		assertThat(result).isFalse();
	}
}
