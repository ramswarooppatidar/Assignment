
public class Mock_test_4 {
	public void findInex(int a[],int num) {
		boolean flag = true;
		for
		(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				System.out.println("index ix "+i);
				flag = false;
			}
			
			    
			    
		}
		if(flag) {
		System.out.println("not available "+num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12,45,13,33,45};
		
		Mock_test_4 obj = new Mock_test_4();
		obj.findInex(a, 45);
		obj.findInex(a, 46);
		
	}

}
