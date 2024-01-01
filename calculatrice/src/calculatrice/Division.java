package calculatrice;

public class Division extends OperationBinaire {
	public Division(double x1,double x2) {
    	super(x1,x2);
    }

	@Override
	public double calcul() {
	try {
		if(x2 !=0)return x1/x2;
		else throw new ArithmeticException("Division par Zero");
	}
	catch (ArithmeticException  e) {
		System.out.println("Erreur"+e.getMessage());
		return Double.NaN;
	}
	}

	
}
