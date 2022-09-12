package com.inhertance;
class Laptop{
	int noOfUSBPort;
	int processorSpeed;
	public Laptop() {};
	public Laptop(int a,int b) {
		noOfUSBPort = a;
		processorSpeed = b;
		System.out.println("no. of port is "+a);
		System.out.println("processor speed is "+b+"n/s");
		
	}
	public void setNoOfUSBPort(int b) {
		noOfUSBPort=b;
	}
	public void setProcessorSpeed(int b) {
		processorSpeed = b;
	}
	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}
	public int getProcessorSpeed() {
		return processorSpeed;
	}
}
public class ComputerApplication {
	public static void main(String[]args) {
		
		Laptop lp = new Laptop();
		System.out.println("\nusing getter/setter______________");
		lp.setNoOfUSBPort(7);
		System.out.println("no. of port is "+lp.getNoOfUSBPort());
		
		lp.setProcessorSpeed(108);
		System.out.println("processor speed is "+lp.getProcessorSpeed()+"n/s");
		System.out.println("\n\nusing constructor______________");
		
		Laptop lp1 = new Laptop(20,950);
		
		
	}

}
