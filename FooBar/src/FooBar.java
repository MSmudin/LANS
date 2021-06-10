
public class FooBar {
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			if(i % 5 == 0 && i % 3 == 0 ) {
				System.out.println("FooBar");
			}else if(i % 3 == 0) {
				System.out.println("Bar");
			}else if(i % 5 == 0 ){
				System.out.println("Foo");
			}else {
				System.out.println(i);
			}
		}
	}
}
