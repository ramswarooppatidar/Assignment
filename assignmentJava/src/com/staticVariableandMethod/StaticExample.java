package com.staticVariableandMethod;
class Method{
	static int square(int a) {
		return(a*a);
	}
}

public class StaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(Method.square(5));
	}

}
