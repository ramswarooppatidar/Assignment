package com.company;

public class CWH_14_STRINGMETODS {
    public static void main(String[] args) {

     String name="HArry";
        System.out.println(name);
      //  int value=name.length();
     //   System.out.println(value);


     //   String lstring=name.toLowerCase();
     //   System.out.println(lstring);


     //   String ustring=name.toUpperCase();
     //   System.out.println(ustring);
    //    String nonTrimmedString="   harry   ";
    //    System.out.println(nonTrimmedString);


    //    String trimmedString = nonTrimmedString.trim();
    //    System.out.println(trimmedString);
     //   System.out.println(name.substring(2));  //op  -- rry
     //   System.out.println(name.substring(3));  //op  -- ry
        //   System.out.println(name.substring(0));  //op  -- ry


     //     System.out.println(name.substring(0,4)); //op  --HArr   4 excluded
     //   System.out.println(name.replace('r' ,'p'));

     //   System.out.println(name.replace("rry","ier"));
     //   System.out.println(name.replace("r" ,"ier"));

        // name.startswith("ha")
   //     System.out.println(name.startsWith("har"));
//name.endsWith("")
    //    System.out.println(name.endsWith("rry"));


        //name.charAt()
        System.out.println(name.charAt(0));  //H

        //indexOf()
       // System.out.println(name.indexOf("r"));

        String modifiedName  = "harryrry";
        //System.out.println(modifiedName.indexOf("rry"));
       // System.out.println(modifiedName.indexOf("rry",4));

//lastIndexOf
    //    System.out.println(modifiedName.lastIndexOf("rry"));
    //    System.out.println(modifiedName.lastIndexOf("rry",4));//it is search from last and search upto
        // 4 index from string


//name.eqal
        System.out.println(name.equals("harry"));
        System.out.println(name.equals("HArry"));

 //name.equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("harry"));


//escape sequences
       // System.out.println("i am escape \" double quote"); // i am escape " double quote

        System.out.println("i am escape \\ double quote");  // i am escape / double quote








    }
}
