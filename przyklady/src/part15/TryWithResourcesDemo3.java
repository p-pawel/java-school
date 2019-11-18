package part15;

public class TryWithResourcesDemo3 {

	public static void main(String[] args) throws ClassNotFoundException {

		try (MyResource myResource = new MyResource()) {

			System.out.println("Jestem w try i używam zasobu: " + myResource);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


class MyResource implements AutoCloseable {
	public MyResource() {
		System.out.println("new MyAutoCloseable()");
	}

	@Override
	public void close() throws MyException {
		System.out.println("MyAutoCloseable.close()");
		throw new MyException();
	}
}

class MyException extends Exception {

}