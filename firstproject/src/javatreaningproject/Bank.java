package javatreaningproject;
import java.util.Scanner;
public class Bank {
	public static void main(String[] args) {
		/* int accountNumber,deposit,withdraw,left2,left5,left1,left50,depositLeft2,
		 depositLeft5,depositLeft1,depositLeft50;
		 
		 int wLeft2,wLeft5,wLeft1,wLeft50,recieve2,recieve5,recieve1,recieve50,recieveTotal;
		 int totalNotes,totalNotesD;
		 int value;
		 
		 
		 System.out.println("press 0 for deposite and 1 for withdraw ");
		 Scanner Sc=new Scanner(System.in);
		 value=Sc.nextInt();
		 
		 
		 if(value==0) {
		 System.out.println("program to find out how much number of notes you doposite ");
		 System.out.println("please enter your bank account number");
		 
		 accountNumber = Sc.nextInt();
		 System.out.println("how much amount you want to deposite in your account");
		 deposit= Sc.nextInt();
		 System.out.println("number of notes you deposit in your account are respectively :-- ");
		 left2=deposit/2000;
		 depositLeft2=deposit-2000*left2;
		 
		 left5=depositLeft2/500;
		 depositLeft5=depositLeft2-500*left5;
		 
		 left1=depositLeft5/100;
		 depositLeft1=depositLeft5-left1*100;
		 
		 left50=depositLeft1/50;
		 depositLeft50=depositLeft1-left50*50;
		 
		 System.out.println("you deposit 2000 notes are : "+left2);
		 System.out.println("you deposit 500 notes ARE : "+left5);
		 System.out.println("you deposit 100 notes is : "+left1);
		 System.out.println("you deposit 50 rupee notes is : "+left50);
		 System.out.println("you not get remaing amount   : "+ depositLeft50+"  Rs only");
		 }
		 else if(value==1) {
			 System.out.println("program to find out how much number of notes you withdraw ");
			 System.out.println("please enter your bank account number");
			 
			 accountNumber = Sc.nextInt();
			 System.out.println("how much amount you want to withdraw in your account");
			 withdraw = Sc.nextInt();
			 System.out.println("number of notes you withraw by your bank are respectively :-- ");
			 wLeft2=withdraw/2000;
			 recieve2=withdraw-wLeft2*2000;
			 
			 wLeft5= recieve2/500;
			 recieve5 = recieve2-wLeft5*500;
			 
			 wLeft1= recieve5/100;
			 recieve1= recieve5-wLeft1*100;
			 
			 wLeft50=recieve1/50;
			 recieve50 = recieve1-wLeft50*50;
			 
			 recieveTotal=wLeft2*2000+wLeft5*500+wLeft1*100+wLeft50*50;
			 totalNotes=wLeft2+wLeft5+wLeft1+wLeft50;
			 
			 System.out.println("you RECIEVE 2000 rupee notes are : "+wLeft2);
			 System.out.println("you RECIEVE 500 rupee notes ARE : "+wLeft5);
			 System.out.println("you RECIEVE 100 rupee notes is : "+wLeft1);
			 System.out.println("you RECIEVE 50 rupee rupee notes is : "+wLeft50);
			 System.out.println("you not get remaing amount   : "+ recieve50 +"  Rs only");
			 System.out.println("you recieve total amounte is:"+recieveTotal);
			 System.out.println("you recieve totalnumber of notes are:"+totalNotes);
			 
		 }
		 else {
			 System.out.println("please select correct output:"+0+" & "+1); 
		 }*/
       
		int amount,accountNumber,left;
        int value;
		 
		 
		 System.out.println("press 0 for deposite and 1 for withdraw ");
		 Scanner Sc=new Scanner(System.in);
		 value=Sc.nextInt();
		
		 System.out.println("please enter your bank account number");
		 
		 accountNumber = Sc.nextInt();
		 
		 if(value==0) {
			
		 System.out.println("how much amount you want to withdraw in your account");
		 amount = Sc.nextInt();
		 System.out.println("number of notes you withraw by your bank are respectively :-- ");
			 
		 
         left=amount/2000;
         amount=amount%2000;
         System.out.println("you RECIEVE 2000 rupee notes are : "+left);
    	 
    	 left=amount/500;
         amount=amount%500;
         System.out.println("you RECIEVE 500 rupee notes are : "+left);
         
         left=amount/200;
         amount=amount%200;
         
    	 System.out.println("you RECIEVE 200 rupee notes are : "+left);
    	 
    	 left=amount/100;
         amount=amount%100;
         
    	 System.out.println("you RECIEVE 100 rupee notes are : "+left);
    	 
    	 left=amount/50;
         amount=amount%50;
         
    	 System.out.println("you RECIEVE 50 rupee notes are : "+left);
		 
		 
		 }
    	 
    	 
         
	}

}
