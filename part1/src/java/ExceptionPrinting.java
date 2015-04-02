public class ExceptionPrinting {
	public static void main(String[] args) {
		try {
			hello();
		} catch (MyException me) {
			// will be printed: MyException: Ee(xception from foo()
			//System.out.println(me);

			// will be printed:
			// MyException: Exception from foo()
			//	at ExceptionPrinting.foo(ExceptionPrinting.java:18)
			//	at ExceptionPrinting.hello(ExceptionPrinting.java:14)
			//	at ExceptionPrinting.main(ExceptionPrinting.java:4)
			me.printStackTrace();
		}
	}

	static void hello() throws MyException {
		foo();
	}

	static void foo() throws MyException {
		throw new MyException("Exception from foo()");
	}
}

class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}
}