import com.fazecast.jSerialComm.*;
import java.util.Scanner;
public class Main {
	SerialPort ports[]=SerialPort.getCommPorts();
	SerialPort port;
	public Main() {
		
		port=ports[1];
		if(port.openPort()) {
	       	 System.out.println("Open");
	        }else {
	       	 System.out.println("Closed");
	       	 return;
	        }
	}
	

	public String details() {
		String s="";
		port.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 0, 0);
        Scanner data=new Scanner(port.getInputStream());
        if(data.hasNextLine()) {
        	
        	s=data.nextLine();
        }
        return s;
        }
		
	}


