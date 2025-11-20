package h2;

public class H2_main {

	public static void main(String[] args) {
		int n = 299, digits = 3;
		int[] a = new int [9];
		
		digits = 0;
		int i=1;
		do {
			digits++;
			i = i*10;
		}while(i<= n);
		
		
		for(int j = digits; j>0; j--) {	
			int comparisonNumber = 1;
			for (int k=1; k < j; k++) {
				comparisonNumber = comparisonNumber * 10;
			}
			while(n > comparisonNumber) {
				n = n - comparisonNumber;
				a[9-j] = a[9-j]+1;
			}
			
		}
		if(n == 1) {
			a[8] = a[8] +1;
		}
		
		
		System.out.println(digits);
		for (int l=0; l<a.length; l++) {
			System.out.print(a[l] + " "); 
		}
		// TODO Auto-generated method stub

	}

}
