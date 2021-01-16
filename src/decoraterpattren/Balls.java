package decoraterpattren;

public class Balls extends CourtDecorater {
	Court court;

	public Balls(Court court) {
		this.court = court;
	}

	@Override
	public int coast() {
		// TODO Auto-generated method stub
		return court.coast()+50;
	}
}
