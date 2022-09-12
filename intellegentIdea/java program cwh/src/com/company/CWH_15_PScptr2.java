package com.company;



public class CWH_15_PScptr2 {
    public static void main(String[] args) {
        //problem 1  convert to lowe case
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        // space with undescore
        String text = "ram katariya";
        text = text.replace(" ", "_");
        System.out.println(text);
        //write a java programm to fill in a later template which looks like below
        //letter  = "desr <|name|>,thanks a lot "
        String letter = "dear <|name|>,thanks a lot ";
        letter.replace("<|name|>", "harry"); //****amazing concept , without assigned
        // you can not change the string , string remAINS AME
       // System.out.println(letter);
        letter=letter.replace("<|name|>", "harry");
        System.out.println(letter);


    }

}













