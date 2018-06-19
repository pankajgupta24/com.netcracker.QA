
public class reverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input= 4567;
		
		int reversedNum= 0;
		while (input != 0) {
		    reversedNum = reversedNum * 10 + input % 10;
		    input = input / 10;   
		
		}
		System.out.println(reversedNum);
	}

	
	
	
}
