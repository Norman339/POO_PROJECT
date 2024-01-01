package calculatrice;

public class OperationBinaire implements CalculMath {
	protected double x1,x2;
	public OperationBinaire(double x1,double x2) {
		this.x1=x1;
		this.x2=x2;
	}
	@Override
	public double calcul() {
		return 0;
	}
 
}
