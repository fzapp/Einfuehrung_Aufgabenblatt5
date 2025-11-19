package p2;

public class P2_main {

	public static void main(String[] args) {
		int [] numbers = {12,4,99,-3};
		int max = 41, minIndex = 0;
		
		
		max = numbers[0];
		for(int i=1; i <= numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		for(int i = 0; i <= numbers.length; i++) {
			if(numbers[i] == max) {
				minIndex = i;
				break;
			}
		}
		// TODO Auto-generated method stub

	}

}
