package assignmentJava;
class patter
{
	public void patter_fabinocci(int row) {
		int k;
		int nextTerm ;
		for(int i=0;i<row;i++) {
			int firsTerm=0;
			int secTerm =1;
		
		   for(int j=0;j<=i;j++) {
			  if(j==0) {
				  System.out.print(firsTerm+" ");
			  }
			  else if(j==1) {
				  System.out.print(secTerm+" ");
			  }
			  else {
				  
				  nextTerm =firsTerm+secTerm;
				  firsTerm = secTerm;
				  secTerm = nextTerm;
				  System.out.print(nextTerm+" ");
				  
			  }
		  }	
			  System.out.println('\n');
		 
		}
	}		
}
public class patter_fibonacci_concept {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patter obj = new patter();
		obj.patter_fabinocci(6);
	}
				
		


}
