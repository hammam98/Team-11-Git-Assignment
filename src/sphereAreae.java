
public class sphereAreae implements ISubscriber {

	@Override
	public void notifySubscriber(int r) {
		double area = Math.PI * 4 * r * r;
		System.out.println("Hello the area is : "+area);
		
	}

}
