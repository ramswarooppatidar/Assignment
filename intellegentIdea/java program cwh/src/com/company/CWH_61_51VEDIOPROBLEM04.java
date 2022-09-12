package com.company;
class library{
    String[] books;
    int noofbook;
    library(){
        books=new String[100];
        this.noofbook=0;
    }
    void addBook(String book){
        books[noofbook]=book;
        noofbook++;
        System.out.println(book+"has been added");
    }
    void showavailablebook(){
        System.out.println("available books are "+noofbook);
      //  System.out.println("you can add only "+(100-noofbook  ) + " books");
        for(String book:books){
            if(book==null){
               // break;   available book are 4 and show only up to null, so use continue
                continue;
            }
            System.out.println("* " +book);
        }
    }
    void issuebook(String book){
        for(int i=0;i<books.length;i++){
            if(books[i].equals(book)){
                System.out.println("the book has been issued ");
                books[i]=null;
                return;
            }
        }
        System.out.println("this bbo does not exist");
    }
    void returnbook(String book){
        addBook(book);

    }
}

public class CWH_61_51VEDIOPROBLEM04 {
    public static void main(String[] args) {
        /*
you have to impement a class using java class library
method addbook issue bookreturn book, showavailablebook
properties : arry to store the available book
arry to store issue book

        */
        library centrallibrary =new library();
        centrallibrary.addBook("think and grow rich");
        centrallibrary.addBook("electromagnetisum");
        centrallibrary.addBook("signal and system");
        centrallibrary.addBook("communication system");
       // centrallibrary.showavailablebook();
        centrallibrary.issuebook("electromagnetisum");
        centrallibrary.showavailablebook();
        centrallibrary.returnbook("electromagnetisum");
        centrallibrary.showavailablebook();
    }
}

