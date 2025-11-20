package h3;

public class H3_main {

	public static void main(String[] args) {
		int [][] einheiten = {{50000,20000,10000,5000,2000,1000,500,200,100,50,20,10,5,2,1},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
		int input = 6279;
		
		for (int i=0; i<einheiten[0].length; i++) {
			while( input >= einheiten[0][i]) {
				einheiten[1][i]++;
				input -= einheiten[0][i];
			}
		}
		
		for (int l=0; l<einheiten[1].length; l++) {
				System.out.print(einheiten[1][l] + " "); 
			}
		
		// TODO Auto-generated method stub

	}

}
