import java.io.IOException;

import com.pi4j.io.gpio.RaspiPin;


public class Main {

	public static void main(String[] args) {
<<<<<<< HEAD
		WebServer server = new WebServer();
=======
		System.out.println("test");
		RPi pi = new RPi();
		pi.setLedPin(RaspiPin.GPIO_07);
		WebServer server = new WebServer(pi);
>>>>>>> af57558f18ded340174584f27d76e96c47c16b7d
		try {
			server.listen(8080);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
