package javaCourse;

public class Hiding {
	static int x = 42; // #1
	public static void main(String[] args) {
		testHiding(17);
		testHiding2();
	}
	public static void testHiding( int x) { // #2. Fine.
		int x = 6; // #3. No good. Local hiding parameter
		System.out.println(x);
	}
	public static void testHiding2() {
		int x = 6; // #4. Fine. Hiding field
		{
			int x = 28; // #5. No good.
			System.out.println(x);
		}
		System.out.println(x);
	}
}

