import java.io.IOException;

import com.pi4j.io.gpio.RaspiPin;


public class Main {

	public static void main(String[] args) {
		WebServer server = new WebServer();
		try {
			server.listen(8080);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
