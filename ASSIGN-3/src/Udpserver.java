
 import java.io.*;
 import java.net.*;

 public class Udpserver 
{
	public static void main(String args[]) throws IOException 
	{
	DatagramSocket ss=new DatagramSocket(5006);
	byte[] rd =new byte[2025];
	DatagramPacket rp=new DatagramPacket(rd, rd.length);
	ss.receive(rp);
	InetAddress ip=rp.getAddress();
	String msg=new String(rd,0,rp.getLength());
	System.out.println("client :"+msg);
	System.out.println("client ip :"+ip);
	}
     }

