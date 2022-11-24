package atelier08;

public class LancerDé extends Aleat{
	public LancerDé() {
		super(6);
		
	}
	
	public TroisDés lancer() {
		TroisDés tire = new TroisDés(super.get(), super.get(), super.get());
		return tire;
		
	}

}
