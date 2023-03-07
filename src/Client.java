import java.io.IOException;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try {
			System.out.println("Client started");
			Socket soc = new Socket("localhost", 9806);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
