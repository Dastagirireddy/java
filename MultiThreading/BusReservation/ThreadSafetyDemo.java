package com.javaexample.MultiThreading.BusReservation;

public class ThreadSafetyDemo {

	public static void main(String[] args)
	{
		BusTicketsBookedSeats br = new BusTicketsBookedSeats();
		PassengerThread pt1 = new PassengerThread(2,br,"DASTA");
		PassengerThread pt2 = new PassengerThread(2, br, "RAM");
		pt1.start();
		pt2.start();
	}

}
