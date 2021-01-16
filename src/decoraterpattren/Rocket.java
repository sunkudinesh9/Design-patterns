package decoraterpattren;

public class Rocket extends CourtDecorater {
	Court court;

	public Rocket(Court court) {
		this.court = court;
	}

	@Override
	public int coast() {
		// TODO Auto-generated method stub
		return court.coast() + 100;
	}
}
