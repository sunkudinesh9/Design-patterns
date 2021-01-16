package singletonpattren;

public class SingletonPattrenDemo {
	public static void main(String[] args) {
		SingleTonPattren singleTonPattren = SingleTonPattren.getSingleTonPattrenInstance();
		System.out.println(singleTonPattren);
		SingleTonPattren singleTonPattren2 = SingleTonPattren.getSingleTonPattrenInstance();
		System.out.println(singleTonPattren2);
		System.out.println(singleTonPattren2.getMessage());
	}
}
