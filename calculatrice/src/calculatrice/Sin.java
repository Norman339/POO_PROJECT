package calculatrice;

public class Sin extends OperationUnaire {
    public Sin(double x1){
        super(x1);
    }

	@Override
	public double calcul() {
	
		return Math.sin(x1);
	}
	
}
