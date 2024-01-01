package calculatrice;

public class Log extends OperationUnaire {

	public Log(double x1) {
		super(x1);
	}

	@Override
	public double calcul() {
	try { if (x1>0)	return Math.log(x1);
	else throw new ArithmeticException("Division par Zero");
}
catch (ArithmeticException  e) {
	System.out.println("Erreur"+e.getMessage());
	return Double.NaN;
}
	}
	}

