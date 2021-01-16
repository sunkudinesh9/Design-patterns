package singletonpattren;

public class SingleTonPattren {
	private static SingleTonPattren singleTonPattren = new SingleTonPattren();

	private SingleTonPattren() {
	}

	public static SingleTonPattren getSingleTonPattrenInstance() {
		return singleTonPattren;
	}

	public String getMessage() {
		return "Hello singleton pattren";
	}
}
