package calculatrice;

public class Multiplication extends OperationBinaire {
		public Multiplication(double x1,double x2) {
	    	super(x1,x2);
	    }

		@Override
		public double calcul() {
			return x1*x2;
		}
	}

