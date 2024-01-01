package calculatrice;

public class Exp extends OperationUnaire {

	public Exp(double x1) {
		super(x1);
	}

	@Override
	public double calcul() {
		return Math.exp(x1);
	}

}
