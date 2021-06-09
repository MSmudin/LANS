
public class UsingIfStatements {
	public static void main(String[] args) {
		
		boolean flag = (5 <= 6) | (4 > 7);
		
		if(!flag) {
			
			System.out.println("A");
			
		}
		int x = 100;
		if(x % 2 == 0) {
			System.out.println("A:Even.");
		}else if (x % 5 == 0) {
			System.out.println("B: Multiple of five.");
		}
		else {
			System.out.println("C: Not even");
		}
		
		//Ternary operator
		System.out.println((x > 4) ? "It's true": false);
		
		String exampleValueForSwitch = "B";
		
		switch(exampleValueForSwitch) {
		case "A":
			System.out.println("A");
			break;
		case "B":
			System.out.println("B");
		default:
			System.out.println("Default");
		}//break will cause it come out of the switch and resume here
	}
}
