package h1;

public class H1_main {

	public static void main(String[] args) {
		int[] myArray = {2,23,3,3,7,-1};
		
		int[] hilfsArray = new int [myArray.length];
		for (int i=0; i<myArray.length; i++) {
			hilfsArray[i] = myArray[myArray.length-i-1]; 
		}
		
		//myArray = hilfsArray;
		//for (int i=0; i<myArray.length; i++) {
		//	System.out.println(myArray[i]); 
		//}
		// TODO Auto-generated method stub

	}

}
