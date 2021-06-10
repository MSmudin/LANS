
public class FB {
	public static void main(String[] args) {
		for(int i = 0; i <= 100; i++) {
			if((i % 3) == 0 && (i % 5) == 0) {
				System.out.print("value of i is: " + i);
				System.out.print("   ");
				System.out.println("FooBar");
			}
			else if((i % 5) == 0) {
				System.out.print("value of i is: " + i);
				System.out.print("   ");
				System.out.println("Foo");
			}
			else if((i % 3) == 0) {
				System.out.print("value of i is: " + i);
				System.out.print("   ");
				System.out.println("Bar");
			}
			
		
		}

	}
}
