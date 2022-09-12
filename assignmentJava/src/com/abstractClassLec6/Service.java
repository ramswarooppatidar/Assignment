package com.abstractClassLec6;

public interface Service {
	void provideservice(String f);

}
class TransportSer implements Service{
	public void provideservice(String s) {
		System.out.println("service is  good"+s);
	}
}
class Courier implements Service{
	public void provideservice(String s) {
		System.out.println("service is  good and in courier class"+s);
	}
	
}
