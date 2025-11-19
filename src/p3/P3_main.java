package p3;

public class P3_main {

	public static void main(String[] args) {
		int [][] matrix = {{1,3,2},{4,6,5},{7,9,8}};
		
		
		int [][] tempMatrix = new int [3][3];
		for(int i=0; i < matrix.length; i++) {
			for (int j=0; j < matrix[i].length; j++) {
				tempMatrix[i][j] = matrix[i][j] + 1;
			}
		}
		
		for(int i=0; i < matrix.length; i++) {
			System.out.println(tempMatrix[i][0] + " " + tempMatrix[i][1] + " " + tempMatrix[i][2]);
		}
		
		
		//b
		
		int summe = 0;
		for(int i=0; i < matrix.length; i++) {
			for (int j=0; j < matrix[i].length; j++) {
				summe = summe + matrix[i][j];
			}
		}
		System.out.println("Die Summe aller Zahlen der Matrix ist:" + summe);
		
		//c
		int [][]tempMatrix2 = new int [3][3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				tempMatrix2[i][j]= matrix[matrix.length-(j+1)][i];
			}
		}
		for(int i=0; i < matrix.length; i++) {
			System.out.println(tempMatrix2[i][0] + " " + tempMatrix2[i][1] + " " + tempMatrix2[i][2]);
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
