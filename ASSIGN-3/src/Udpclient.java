

import java.io.*;
import java.net.*;

public class Udpclient {
	public static void main(String args[]) throws IOException 
	{
		DatagramSocket ds= new DatagramSocket();
		InetAddress ip=InetAddress.getByName("localhost");
		byte[] sd=new byte[2025];
		String msg="hello server";
		sd=msg.getBytes();
		DatagramPacket pkt=new DatagramPacket(sd, sd.length, ip, 5006);
		ds.send(pkt);
		ds.close();
	

}
}