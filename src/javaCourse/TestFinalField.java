package javaCourse;

class SomeClass { int a = 42; }
class TestFinalField {
	final int finalInt = 17;
	final double finalDouble;
	final SomeClass finalReference;
	TestFinalField() {
		finalInt = 42; // No, already initialized
		finalReference = new SomeClass(); // Ok
	}
	public static void main(String[] args) {
		TestFinalField fine = new TestFinalField();
		fine.finalInt = 6; // No
		fine.finalDouble = 3.14; // No, even though it
		// hasn't been initialized
		fine.finalReference = new SomeClass(); // No
		fine.finalReference.a = 28; // Ok!!!
	}
}