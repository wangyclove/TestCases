package javaCourse;

class DoubleOnly {
	public static void foo( double d) {
		System.out.println("Double: " + d);
	}
}
class DoubleAndInt {
	public static void foo( double d) {
		System.out.println("Double: " + d);
	}
	public static void foo( int d) {
		System.out.println("Int: " + d);
	}
}
public class OverLoadingTest {
	public static void main(String[] args) {
		System.out.print("DoubleOnly.foo(42): ");
		DoubleOnly.foo(42);
		System.out.print("DoubleAndInt.foo(42): ");
		DoubleAndInt.foo(42);
	}
}

