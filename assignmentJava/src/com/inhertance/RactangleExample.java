package com.inhertance;
/*class Ractangle {
    private int length;
    private int breadth;

    public int getLength() {
        return this.length;
    }

    public int getBreadth() {
        return this.breadth;
    }

    public Ractangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Ractangle() {
        this.length = 4;
        this.breadth = 5;
    }
}*/
class Rectangle1 {
    public int length;
    public int breadth;
    
    Rectangle1(){};

    Rectangle1(int l, int b) {
        System.out.println("i am a rectangle1 constructor set length and breadth ");
        this.length = l;
        this.breadth = b;
    }

    public void setLength(int length) {
    	this.length = length;
    }
    
    public int getLength() {
        return this.length;
    }

    public void setBreadth(int breadth) {
    	this.breadth = breadth;
    }

    public int getBreadth() {
        return this.breadth;
    }


    public double areaOfGeometry() {
        int var10001 = this.length * this.breadth;
        System.out.println("area of rectagle is " + var10001);
        return (double)(this.length * this.breadth);
    }

    public int perimeterofrectangle() {
        int var10002 = this.length + this.breadth;
        System.out.println(" perimeter of rectangle is " + 2 * var10002);
        return 2 * (this.length + this.breadth);
    }
}

class cuboide extends Rectangle1 {

    public int height;
    

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    cuboide(){};
    cuboide(int l, int b, int h) {
        super(l, b);
        System.out.println("i am cuboide constructor set height");
        this.height = h;
    }

    public double  areaOfGeometry() {
    	super.areaOfGeometry();
    
        int var10002 = this.length * this.breadth + this.length * this.height;
        int var10003 = this.breadth * this.height;
        System.out.println("area of cuboide is " + 2 * (var10002 + var10003));
        return 2 * (this.length * this.breadth + this.length * this.height + 
        		this.breadth * this.height);
    }
}
class Cube extends cuboide{
	Cube(){}
	public Cube(int l,int b,int h) {
		super(l,b,h);
	}
	public double areaOfGeometry() {
		super.areaOfGeometry();
		int area=6*(length*breadth);
		System.out.println("area of cube is "+area);
		volumeOfcube();
		return area;
	}
	public void volumeOfcube() {
		int volume = length*breadth*height;
		System.out.println("volume of cube is "+volume);
	}
	
}


public class RactangleExample {
	public static void main(String[]args) {
		Rectangle1 gem = new Cube(8,8,8);
		gem.areaOfGeometry();
		
	    System.out.println("\n\n");
	    
		gem = new cuboide(20,40,60);
		gem.areaOfGeometry();
		
	 }

}
