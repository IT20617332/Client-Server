import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		try {
			System.out.println("Waiting for client's requests");
			ServerSocket ss = new ServerSocket(9806);
			
			//blocking call for making server wait until the client's requests are coming
			//when request has come, it is sent to the socket
			Socket soc = ss.accept();
			
			System.out.println("Connection is established");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
