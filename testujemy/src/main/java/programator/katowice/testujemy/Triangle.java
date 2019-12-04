package programator.katowice.testujemy;

public class Triangle {
	int a, b, c;

	public Triangle(int a, int b, int c) throws TriangleException {
		if (a <=0) {
			throw new NotPositiveLenghtInTriangleException("a <= 0");
		}
		if (b<=0) {
			throw new NotPositiveLenghtInTriangleException("b <= 0");
		}
		if (c<=0) {
			throw new NotPositiveLenghtInTriangleException("c <= 0");
		}
		boolean aValid = (a < b + c);
		boolean bValid = (b < a + c);
		boolean cValid = (c < b + a);
		if (!aValid || !bValid || !cValid) {
			throw new TriangleConditionException("a or b or c");
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		return a + ", " + b + ", " + c;
	}
}

class TriangleException extends /*Runtime*/Exception {

	public TriangleException(String s) {
		super(s);
	}
}

class TriangleConditionException extends TriangleException {

	public TriangleConditionException(String s) {
		super(s);
	}
}

class NotPositiveLenghtInTriangleException extends TriangleException {

	public NotPositiveLenghtInTriangleException(String s) {
		super(s);
	}
}