package com.company;
import java.util.Scanner;
public class cwh_19_PART04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String website=sc.next();
        if(website.endsWith(".org")){
            System.out.println("this is organizational site");
        }
        else if(website.endsWith(".com")) {
            System.out.println("this is commercial site");
        }
        else if(website.endsWith(".in")) {
            System.out.println("this is indian site");
        }


    }
}
