package part15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo3a {

	public static void main(String[] args) throws ClassNotFoundException, InterruptedException, FileNotFoundException {


//		try (BufferedReader br = new BufferedReader(new FileReader("src/workshop/TryWithResourcesDemo3a.java"))) {
//			System.out.println(br.readLine());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		try (BufferedReader br = new BufferedReader(new FileReader("src/workshop/TryWithResourcesDemo3a.java"))) {
//			System.out.println(br.readLine());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		BufferedReader br = new BufferedReader(new FileReader("src/workshop/TryWithResourcesDemo3a.java"));


		for (int i=0; i<100; i++) {
			try {
				System.out.println(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		for (;;);

//		try (Socket socket = new Socket()) {
//
//			socket.connect(new InetSocketAddress("wp.pl", 80));
//
//			byte[] b = new byte[10];
//			useSocket(socket, b);
////			Reader reader =
////			BufferedReader bufferedReader = new BufferedReader(socket)
//
//
////			System.out.println("Jestem w try i używam zasobu: " + myResource);
//
//		} catch  (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	private static void useSocket(Socket socket, byte[] b) throws IOException {
//
////		int x = socket.getInputStream().read(b, 0, 10);
//
//		throw new IOException("Symulujemy błąd połączenia");
//
////		System.out.println(x);
	}
}


