package calculatrice;

public class Addition extends OperationBinaire{

	public Addition(double x1,double x2) {
    	super(x1,x2);
    }

	@Override
	public double calcul() {
		return x1+x2;
	}
    
}
