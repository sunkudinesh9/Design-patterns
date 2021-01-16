package decoraterpattren;

public class Coach extends CourtDecorater {
	Court court;

	public Coach(Court court) {
		this.court = court;
	}

	@Override
	public int coast() {
		// TODO Auto-generated method stub
		return court.coast() + 500;
	}
}
