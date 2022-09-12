package com.inhertance;
class circle {
    public int radius;

    circle() {
        System.out.println("i am non parm constructor");
    }

    circle(int r) {
        System.out.println("i am circle constructor");
        this.radius = r;
    }

    public double area() {
        return 3.141592653589793D * (double)this.radius * (double)this.radius;
    }
}
class circle1 {
    private int radius;
    private float area;
    private float perimeter;

    circle1() {
    }

    public void radius(int r) {
        this.radius = r;
    }

    public float setarea(float a) {
        this.area = 3.314F * (float)this.radius * (float)this.radius;
        if (a == this.area) {
            this.area = a;
        } else {
            System.out.println("wrong value of area");
        }

        return this.area;
    }

    public void setperimeter(float a) {
        this.perimeter = 6.628F * (float)this.radius;
        if (a == this.perimeter) {
            this.perimeter = a;
        } else {
            System.out.println("perimeter is wrong");
        }

    }
}

public class CircleExamples {
	public static void main(String[]args) {
		
	}

}
