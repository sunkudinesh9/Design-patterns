package decoraterpattren;

public class DecoraterPattrenDemo {
	public static void main(String[] args) {
		Court court = new GrassCourt();
		Court court1 = new Rocket(court);
		Court court2 = new Balls(court1);
		Court court3 = new Coach(court2);
		System.out.println(court3.coast());
	}
}
