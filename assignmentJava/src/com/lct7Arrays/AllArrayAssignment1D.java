package com.lct7Arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
class arraysProblems{
	//1  MAXIMUM VALUE OF ARRYS ELEMENT USING SHORTING
	public void maximumValue(int arr[]) {
	    int min = arr[0];
		for (int i = 0;i<arr.length;i++) {
			for (int j=0;j<arr.length-i-1;j++) {
				if(arr[j+1]<arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}
		for (int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nsecond maximum elemnt of arrys is "+arr[arr.length-2]);
		System.out.println("\nsecond minimum elemnt of arrys is "+arr[1]);

	}
	//2 palindrome problem
	public void palindrome(int arr[])
	{  
		int copy[] = new int[arr.length];
	    boolean flag=true;
	    for ( int i =0;i<arr.length;i++) {
		    copy[i] = arr[i];
	    }
		
		for ( int i =0;i<arr.length/2;i++) {
			copy[i] = copy[copy.length-i-1];
		}
		for (int i = 0;i<arr.length;i++) {
			if(copy[i]!=arr[i]) {
				flag= false;
				break;
			}
			}
		if(flag==true) {
			System.out.println("number series is palindrome");}
		else
			{
			System.out.println("not palindome");
			
			}
	}

	//3 MARGE ARRY AND ACCENDING ORDER;
				
    		
	public void addArrays(int arr[],int arr1[])
	{
		int c[]=new int[arr.length +arr1.length];
		for(int i=0;i<arr.length;i++) {
			c[i]= arr[i];
		}
		for(int i=0;i<arr1.length;i++) {
			c[arr.length+i]= arr1[i];
		}
		System.out.println("marge two arrya arrys1 and array2\n");

		System.out.println(Arrays.toString(c));
		accendingOrder(c);
	}
	// 4 ARRANGE ACCENDING ORDER;
	public void accendingOrder(int arr[]) 
	{
	  for(int i=0;i<arr.length;i++) 
	  {
		  for(int j=0;j<arr.length-i-1;j++)
		  {
			  if(arr[j+1]<arr[j])
			  {
				  int temp = arr[j+1];
				  arr[j+1]=arr[j];
				  arr[j]=temp;
			  }
		  }
	  }
	}
	//5 ELEMENT OCCURANCE HOW MUCH TIMES
	public void frequencyOfElemnt(int arr[]) 
	{
		int fr[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			fr[i]=1;
		}
		for(int i=0;i<arr.length;i++) {
			int cnt=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					cnt++;
					fr[j] = 0;
					fr[i] = cnt;
				}
				
			}
			if(fr[i]!=0) {
				System.out.println(arr[i]+" occource "+fr[i]+" times");
			}
			
		}
		System.out.println(Arrays.toString(fr));
		
	}
	// 6 MAXIMUM AND MINIMUM
	public void maximumMinimum(int arr[]) {
		int min = arr[0];
		int max = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("minimum element of arry is"+max);
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("maximum element of arry is: "+min);

	}
	// 7 SEPRATE ARRAY OF EVEN AND ODD
    public void evenOddArrays(int arr[] )
    {
    	int even = 0;
    	for (int i = 0;i<arr.length;i++) {
    		if(arr[i]%2==0) {
    			even++;
    		}
    	}
    	int Even[] = new int[even];
    	int Odd[] = new int[arr.length-even];
    	int k=0;
    	int j=0;
    	for (int i = 0;i<arr.length;i++)
    	{
    		if(arr[i]%2==0) {
    			Even[j]=arr[i];
    			j++;
    			continue;
    		}
    
    			Odd[k] = arr[i];
    			k++;
    	}
    	/* 	if(arr[i]%2==0) {
			Even[j]=arr[i];
			j++;
    	     }
    	     else
    	       Odd[k]=arr[i];
    	*/


    	System.out.println(Arrays.toString(Even));
    	System.out.println(Arrays.toString(Odd));
    }
    // 8 INSERT ELEMENTS IN SHORTING ARRYS
    public void insertElement(int arr[],int num) {
    	int p=0;
    	int b[] = new int[arr.length+1];
    	 for(int i=0;i<arr.length;i++) 
   	    {
   		     for(int j=0;j<arr.length-i-1;j++)
   		     {
   			     if(arr[j+1]<arr[j])
   			     {
   				    int temp = arr[j+1];
   				    arr[j+1]=arr[j];
   				    arr[j]=temp;
   			  }
   		  }
   		  
   	  }
    	 for(int i=0;i<arr.length;i++) {
    		 b[i]=arr[i];
    	 }
    	 //find out position where you insert data
    	 for(int i=0;i<arr.length;i++) {
    		 if(num<arr[i]) {
    			 p = i;
    			 break;
    		 }
    		 else
    			 p = i+1;
    	 }
    	 // move right side arrays elements
    	/* for(int i=arr.length;i>=p;i--) {
    		 arr[i] = arr[i-1]; }*/
    	 for(int i=arr.length;i>=p;i--) {
    		 b[i] = b[i-1]; }
    	 
    	 b[p]=num;
    	 System.out.println(Arrays.toString(b));
 

    }
    // 9 SECOND LARGEST ELEMENT IN ARRAY WITHOUT SHORTING;
    
    public void secondLargest(int arr[]) {
    	int larg=arr[0],j=0;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]>larg) {
    			larg=arr[i];
    			j=i;
    		}
    	}
    	int secLarg=arr[0];
    	for(int i=0;i<arr.length;i++) {
    		if(j==i) {
    			i++;
    		}
    		else if(arr[i]>secLarg) {
    			secLarg=arr[i];
    		}
    	}
    	System.out.println("second largest element of arrys is "+secLarg);
    	
    }
    //10 second minimum element without shorting
    
    public void secondMinimum(int arr[])
    {
    	int i=0,min=arr[0],secMin=arr[0];int j=0;
    	while(i<arr.length) {
    		if(arr[i]<min) {
    			min=arr[i]; 
    			 j=i;
    			}
    		i++;
    	}
    	System.out.println(" minimum element is "+min);
    	System.out.println("position of  minimum element is "+(j+1));
    	int k =0;
    	//j=i;
    	while(k<arr.length) {
    		if(k!=j)
    		{ 
    			if(arr[k]<secMin) {
    		
    				secMin=arr[k];
    		    	System.out.println("second minimum(inside) element is "+ secMin);

    			}
    	    }
    		else
    			System.out.println("else print "+arr[k]);
    		k++;
    	}
    	System.out.println("second minimum element is "+ secMin);
    }
    	
    //11 DELETE ELEMENT FROM GIVE PLACE
    		
    public void deleteArrayElements(int arr[],int pos) {
    	int n= arr.length;
    	for( int i=pos-1;i<arr.length-1;i++) {
    		arr[i]= arr[i+1];
    	}
    	n--;
    	System.out.println(n);
        for(int i=0;i<n;i++) {
        	System.out.print(arr[i]+" ");
        }
        // confusion ? why last element is not deleted  
    	System.out.println(Arrays.toString(arr));
    	
    	
    }
    // 12 cheack prime or not
    
    public void primeOrNot(int a[]) {
    	for(int i =0;i<a.length;i++) {
    		boolean flag = true;
    		if(a[i]==1) {
    			System.out.println("not a prime number");
    		}
    		for(int j=2;j<Math.sqrt(a[i]);j++) {
    			if(a[i]%j==0) {
    				flag=false;
    				break;
    			}
    		}
    		if(flag==false) {
    			System.out.println(a[i]+" is not a prime number");
    		}
    		else
    			System.out.println(a[i]+" is a prime number");
    		}
    	}
    	
    //13 average of odd position
    
    	public void average(int a[]) {
    		int sum=0;
    		float avg =0.0f;
    	    int cnt=0;
    		for(int i=0;i<a.length;i+=2) {
    			sum += a[i];
    			cnt++;
    		}
    		avg = sum/cnt;
    		System.out.println("AVERAGE OF ODD POSITION IS "+avg);
    	}
    	
    // 14 WAJP find pair with given sum in array
    	
    	public void pairSum(int a[],int sum) {
    		for(int i=0;i<a.length-1;i++) {
    			for(int j=i+1;j<a.length;j++) {
    				if(a[i]+a[j]==sum) {
    					System.out.println("paire is ( "+a[i]+","+a[j]+") with position "
    							+i+" and "+j+ " and sum is"+sum);
    				}
    			}
    		}
    	}
    	
    // 15 WAJP find majority elements, appears n/2 times or more
    	
    	public void majorityElement(int a[] ){
            int cnt=1,i;
    		for( i=0;i<a.length-1;i++) {
    		    cnt=1;
    			for(int j=i+1;j<a.length;j++) {
    				if(a[i]==a[j]) {
    					cnt++;
    					if(cnt>=a.length/2) {
    						break;
    					}
    			
    					}
    				}
    			}
			System.out.println( cnt+" times");

    		if(cnt>=a.length/2) {
    			System.out.println("majority element is "+a[i]+" and appears "+cnt+" times");
    		}
    		else
    			System.out.println("no such majority elements is available");
    	}
    	
    //16 second method two check majority of element
    	
    	void findMajElem(int arr1[], int n) 
    	{
    	 int i,IndexOfMajElem = 0, ctr = 1;
    	    for(i = 1; i < n; i++) 
    		{
    	        if(arr1[IndexOfMajElem] == arr1[i])
    	            ctr++;
    	        else
    	            ctr--;
    	         
    	        if(ctr == 0) {
    	            IndexOfMajElem = i;
    	            ctr = 1;
    	        }
    	    }
    	    ctr = 0;
    	    for (i = 0; i < n; i++) 
    		{
    	        if(arr1[i] == arr1[IndexOfMajElem])
    	            ctr++; 
    	 }
    	    if(ctr > (n/2))
    	        System.out.println("Majority Element : "+ arr1[IndexOfMajElem]);
    	    else
    	        System.out.println("There are no Majority Elements in the given array.\n");
    	}
    	
    //17 WAJP to find a missing elements
    	public void pickMissElements(int a[]) {
    		//missing elements find out we need (a.length+1)
    		int sum=0;
    		int miss_element;
    		int total_sum;
    		for(int i= 0;i<a.length;i++) {
    			sum += a[i];
    		}
    		//sum= {2*a+(n-1)d}*n/2;
    		total_sum = (2*a[0]+a.length)*(a.length+1)/2;
    		System.out.println("total sum of series  is "+total_sum);
    		System.out.println(" sum of input  is "+sum);
    		miss_element = total_sum - sum;
    		System.out.println("missing element is "+miss_element);
    	}
    	
    //18 WAJP to merge one sorted array into another sorted array.
    	
    	public void margeTwoSrtArray(int bigArray[],int bgIndex, 
    			                              int smallArray[],int smIndex)
    	{   	   int bigArrIndex = bgIndex;
    	   int smallArrIndex = smIndex;
           int margArrIndex = bigArrIndex + smallArrIndex+1;
           int margArray[] = new int[margArrIndex+1];
          
           
           if(bigArray==null || smallArray==null) {
        	   System.out.println("arrays are emepty");
           }
           
           while(bigArrIndex >= 0 && smallArrIndex>=0) {
        	   if(bigArray[bigArrIndex]>=smallArray[smallArrIndex]) 
        	   {
        		   margArray[margArrIndex] = bigArray[bigArrIndex];
        		   margArrIndex--;
        		   bigArrIndex--;
        	   }
        	   else
        	   {
        		   margArray[margArrIndex] = smallArray[smallArrIndex];
        		   margArrIndex--;
        		   smallArrIndex--;
   
        	   }
           if(bigArrIndex < 0) {
        	   
        	   while(smallArrIndex>=0) {
        		   margArray[margArrIndex] = bigArray[bigArrIndex];
        		   margArrIndex--;
        		   bigArrIndex--;

        		   
        	   }
           }
           else if(smallArrIndex <0){
        	   
        	   while(bigArrIndex>=0) {
        		   margArray[margArrIndex] = bigArray[bigArrIndex];
         		   margArrIndex--;
         		   bigArrIndex--;

        		   
        	   }
           }
           System.out.println(Arrays.toString(margArray));

   
        	   
           }
           System.out.println(Arrays.toString(bigArray));
           System.out.println(Arrays.toString(smallArray));


           System.out.println(Arrays.toString(margArray));

           
         /*  if(bigArrIndex >= 0 && smallArrIndex>=0)
           {
        	   
        	   if(bigArray[bigArrIndex]>=smallArray[smallArrIndex]) 
        	   {
        		   margArray[margArrIndex] = bigArray[bigArrIndex];
        		   margArrIndex--;
        		   bigArrIndex--;
        	   }
        	   else if(bigArray[bigArrIndex]<=smallArray[smallArrIndex])
        	   {
        		   margArray[margArrIndex] = smallArray[smallArrIndex];
        		   margArrIndex--;
        		   smallArrIndex--;
   
        	   }
        	}
            else if(bigArrIndex >= 0 && smallArrIndex<0)
               {
            	 margArray[margArrIndex] = bigArray[bigArrIndex];
      		     margArrIndex--;
      		     bigArrIndex--;

               }
            else if(bigArrIndex < 0 && smallArrIndex>=0)
            {
         	 margArray[margArrIndex] = bigArray[bigArrIndex];
   		     margArrIndex--;
   		     bigArrIndex--;

            }

           
           for(int i=0;i<margArray.length;i++) {
        	   System.out.print(margArray[i]+" ");
           }*/
          
      

            	
        }
    //19 WAJP to rotate an array by N positions.
    	public void rotateArray(int a[],int position) {
    		for(int i=0;i<position;i++) {
    			shiftOnePosition(a);
    		}
    	}
    			
    	public void shiftOnePosition(int arr[]) {
    		int temp =arr[0],i;
    		for( i=0;i<arr.length-1;i++) {
    			arr[i]=arr[i+1];
    		}
    		arr[i]=temp;
    		System.out.println(Arrays.toString(arr));
    		
    	}
    // at fix number of arry left it smaallest and heighest find
    	public void findMinMaxToGivenNumber(int a[],int num) {
    		int j=0;
    		for(int i=0;i<a.length;i++) {
    			if(a[i]==num) {
    				j=i;
    				break;     
    			}
    		}
    		int i=0;
    		int min = a[0];
    		int max = a[0];
    		while(i<j) {
    			if(a[i]<min) {
    				min = a[i];
    			}
    			if(a[i]>max) {
    				max=a[i];
    			}
    			i++;
    		}
    		System.out.println(Arrays.toString(a));
    		System.out.println("minimum number left of "+num+" is "+min);
    		System.out.println("maximum number left of "+num+" is "+max);
    		 
    	}
    	//largest sum of continue sub arryays
    	public void sumOfcontinueSubArry(int a[]) {
    		int i,j,k;
    		int sum,maxSum = 0;
    		for( i=0;i<a.length;i++) 
    		{
    			
    			for(j=i;j<a.length;j++)
    			{
    				sum =0;
    				for(k=i;k<j;k++)
    				{
    					sum += a[k];
    				}
    				if(sum>maxSum) {
    					maxSum = sum;
    				}
    			}
    		}
    		System.out.println(maxSum);
    	}
    	
    	public void maxMultiplicationOfConitueSubArray(int a[]) {
    		int MaxPro=0;
    		for(int i=0;i<a.length;i++)
    		{   int product=1;
    			for(int j=i;j<a.length;j++)
    			{
    			  for(int k=0;k<j;k++) {
    				  product *= a[k];
    			  }
    			  if(product>MaxPro) {
    				  MaxPro = product;
    			  }
    			}
    			}
    		System.out.println(MaxPro);
    	}
    	public void GivenDifference(int a[],int num) {
    		int no=a[3];    //for any position
    		//System.out.println(no);
    		for(int i=0;i<a.length-1;i++) {
    			 
    				if(no==a[i]) { 
    					System.out.println(no);
    					no +=num;
    				}
    			
    		}
    	}
    	public void palindromeTwoPointer(int a[]) {
    		int j=a.length-1;
    		boolean flag = true;
    		for(int i=0;i<a.length/2;i++) {
    			if(a[i]==a[j]) {
    			  j--;
    			}
    			else
    				flag = false;
    		}
    		if(flag) {
    			System.out.println("yes is palindrome");
    		}
    		else
    			System.out.println("no");
    	}
    	
    	public void zeroAtLast(int arr[]) {
    		for(int i=0;i<arr.length-1;i++) {
    			if(arr[i]==0) {
    			sweap(arr,i);
    			}
    		}
    		
    		System.out.println(Arrays.toString(arr));
    	}
    	public void sweap(int a[],int num) {
    		int i;
			for( i=num;i<a.length-1;i++) {
				a[i]=a[i+1];
			}
			a[i]=0;
		}
    	
    	
    	public void zeroAtLastCount(int a[]) {
    		int cnt=0;
    		int k=0;
    		int b[]=new int[a.length];
    	/*	for(int i=0;i<a.length;i++) {
    			if(a[i]==0) {
    				cnt++;
    			}
    		}*/
    		for(int i=0;i<a.length;i++) {
    			if(a[i]==0) {
    				//b[a.length-cnt]=a[i];
    				//cnt--;
    				continue;
    			}
    			else {
    				b[k]=a[i];
    			    k++;
    			    }
    		}
    		
    		System.out.println(Arrays.toString(b));
    	}
    	 
    public void putZeroAtLast(int a[]) {
    	int cnt=0;
    	for(int i=0;i<a.length;i++) {
    		if(a[i]!=0) {
    			a[cnt]=a[i];
    			cnt++;
    		}
    	}
    	for(int i=cnt;i<a.length;i++) {
    		a[i]=0;
    	}
		System.out.println(Arrays.toString(a));

    }
    
   /* public void sorte012021(int a[]) {
    	int cnt=1;
    	int cnt0=0;
    	int k=0;
    	int j=0;
    	for(int i=0;i<a.length;i++) {
    		if(a[i]==0) {
    			cnt0++;
    		}
    	}
    	for(int p=0;p<a.length;p++) {
    		if(a[p]!=0)
    		{
    			if(a[p]==2) {
    				a[a.length-cnt]=a[p];
    				cnt++;
    			}
    			else {
    				a[cnt0+k]=a[p];
    			    k++;}
    		}
    		else {
    			a[j]=a[p];
    		    j++;
    		}
    	}
    }*/
    public void sort0121Patter(int a[],int end) {
    	int str =0 ; int run=0 ;
    	int chk=1;
    	while(run<=end) {
    		if(a[run]<chk) {
    			sweap2(a,run,str);
    			run++;
    			str++;
    		}
    		else if(a[run]>chk) {
    			sweap2(a,run,end);
    			end--;
    		}
    		else {
    			run++;
    		}
    	}
    	System.out.println(Arrays.toString(a));
    }
    public void sweap2(int arr[],int i,int j) {
    	int temp = arr[i];
    	arr[i]=arr[j];
    	arr[j]=temp;
    }
    
    public void Patter010101(int a[],int end) {
    	int run=0;
    	int start =0;
    	while(run<=end) {
    		if(a[run]<1) {
    			sweap2(a,run,start);
    			run++;start++;
    		}
    		else
    			run++;
    	}
    	System.out.println(Arrays.toString(a));
    }
    public void revercePatter010101(int a[],int end) {
    	int start=0;
    	while(end<=start) {
    		if(a[end]==0) {
    			end--;
    		}
    		else {
    			sweap2(a,start,end);
    			start++;end--;
    		}
    	}
    	System.out.println(Arrays.toString(a));
    }
    public void maxDifference(int a[]) {
    /*	Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[]= new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }*/
         int maxDiff=Integer.MIN_VALUE;
         int maxDiff1=Integer.MIN_VALUE;
         if(a.length==0){
             System.out.println(0);
         }
         else {
        	 
        	 for(int i=0;i<a.length-1;i++){
        		 for(int j=i+1;j<a.length;j++){
        			 if((a[i]-a[j])>maxDiff){
        				 maxDiff = (a[i]-a[j]);
        			 }
        			 if((a[j]-a[i])>maxDiff1){
        				 maxDiff1 = (a[j]-a[i]);
        			 }
        		 }
        	 }
        	 if(maxDiff>maxDiff1) {
        		 
        		 System.out.println(maxDiff);
        	 }
        	 else
        		 System.out.println(maxDiff1);
         }
         }
    public void mexDiffMathAbs(int a[]) {
    	  int maxDiff=0;
         
          if(a.length==0){
              System.out.println(0);
          }
         for(int i=0;i<a.length-1;i++){
             for(int j=i+1;j<a.length;j++){
                 if(Math.abs(a[i]-a[j])>maxDiff){
                     maxDiff = Math.abs(a[i]-a[j]);
                 }
                 
             }
         }
         System.out.println(maxDiff);
        
    }
}

public class AllArrayAssignment1D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter sie of arry1");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("please enter element of arrys");
		for (int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		//System.out.println("588line...select one number of arry");
		//int number = sc.nextInt();  */
		
		/*System.out.println("pls enter sie of arry2");
		int size2 = sc.nextInt();
		int b[] = new int[size2];
		System.out.println("please enter element of arrys");
		for (int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}*/
		
	/*	int d[] = {10,12,14,16,18,20,22};
		int d1[] = {10,17,21,32,39,47,56};
		int d2[] = {11,19,24,45,76,83};

	
		int e[] = {11,13,15,17,19,21}; */
		arraysProblems obj = new arraysProblems();
		//obj.maximumValue(a);
		//obj.palindrome(a);
		//obj.addArrays(a,a);
		//obj.maximumMinimum(a);
		//obj.accendingOrder(a);
		//obj.frequencyOfElemnt(a);
		//obj.maximumMinimum(a);
		//obj.evenOddArrays(a);
		//obj.insertElement(a,15);     //***
		//obj.secondLargest(a);        //***without Shorting
		//obj.secondMinimum(a);
		//obj.deleteArrayElements(a,4);
		//obj.secondMinimum(a);
		//obj.primeOrNot(a);
		//obj.average(a);
		//obj.pairSum(a,12);             
		//obj.majorityElement(a);
		//obj.findMajElem(a,size);
		//obj. pickMissElements(a);
		//obj.margeTwoSrtArray(d,6,e,5);
		//obj.margeTwoSrtArray(d1,6,d2,5);            //21
       // obj.rotateArray(a,4);
		//obj.findMinMaxToGivenNumber(a, number);
		//obj.sumOfcontinueSubArry(a);
		//obj.maxMultiplicationOfConitueSubArray(a);
		//obj.GivenDifference(a, 5);
		//obj.palindromeTwoPointer(a);
		
		/*int arrrr[]= {11,23,0,8,87,00,7,8,0,9,0,6,5,0,8,0};
		int arr1[]= {0,1,2,2,1,0,0,2,0,1,1,0};
		int arr2[]= {0,1,1,0,1,0,0,1,0,1,1,0};
		obj.zeroAtLast(arrrr);
		obj.zeroAtLastCount(arrrr);
		obj.putZeroAtLast(arrrr);
		obj.sort0121Patter(arr1,arr1.length-1);
		obj.Patter010101(arr2, arr2.length-1);
		obj.revercePatter010101(arr2, arr2.length-1);*/
		
		
		obj.maxDifference(a);
		//obj.mexDiffMathAbs(a);
		int ab[]=new int[0];
		


    	
    			
    	
		
		
	
		
	}
	
}

	
		
