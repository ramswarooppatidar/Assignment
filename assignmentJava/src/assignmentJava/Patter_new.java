package assignmentJava;
class pattern234{
	public void pattern_fabinocci(int row) {
		int nextTerm;
		for(int i=0;i<row;i++) {
			int firstTerm =0;
			int secondTerm =1;
			for(int j=0;j<=i;j++) {
				if(j==0) {
					System.out.print(firstTerm+" ");
					}
				else if(j==1) {
					System.out.print(secondTerm+" ");
				}
				else {
					
					nextTerm = firstTerm+secondTerm;
					firstTerm = secondTerm;
					secondTerm = nextTerm;
					System.out.print(nextTerm+" ");
				}
				}
			System.out.println('\n');
		}
	}
}

public class Patter_new {
	public static void main(String []args) {
		pattern234 obj = new  pattern234();
		obj.pattern_fabinocci(10);
	}

}
