package calculatrice;

public class Cos extends OperationUnaire {
	    public 	Cos(double x1) {
		super(x1);
	}


		@Override
		public double calcul() {
			return Math.cos(x1);
		}

}
