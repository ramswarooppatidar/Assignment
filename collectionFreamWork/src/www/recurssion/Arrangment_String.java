package www.recurssion;

import java.util.Scanner;

public class Arrangment_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String str = sc.next();
		//(String left boundary,right boundary)
		findPermnutation(str,0,str.length()-1);

	}

	private static void findPermnutation(String str, int left, int right) {
		// TODO Auto-generated method stub
		if(left==right) {
			System.out.println(str);
		}
		else {
			for(int i=left;i<=right;i++) {
				//do
				str = swap(str,left,i);
				
				//recure
				findPermnutation(str,left+1,right);
				//undo
				str = swap(str,left,i);
			}
		}
	}

	private static String swap(String str, int left, int i) {
		// TODO Auto-generated method stub
		char t;
		char []charA = str.toCharArray();
		t = charA[left];
		charA[left] = charA[i];
		charA[i]=t;
		return String.valueOf(charA);
	}

}
