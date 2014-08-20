package com.javaexample;

import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class MACAddress 
{

	public static void main(String[] args) throws UnknownHostException, SocketException 
	{
		System.out.println(InetAddress.getLocalHost());
		
		//NetworkInterface mac=NetworkInterface.getByInetAddress(InetAddress.getLocalHost());
		/*System.out.println("Mac Address:");
		byte[] net=mac.getHardwareAddress();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < net.length; i++) {
			sb.append(String.format("%02X%s", net[i], (i < net.length - 1) ? "-" : ""));		
		}
		System.out.println(sb.toString());*/
	}

}
