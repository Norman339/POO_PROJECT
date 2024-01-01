package calculatrice;

public class OperationUnaire implements CalculMath {
	protected double x1; 
	public OperationUnaire (double x1) {
	 this.x1=x1;}
	@Override
	public double calcul() {
		return 0;
	}
	
}
