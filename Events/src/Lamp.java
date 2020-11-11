
public class Lamp implements ElectricityListener {

	@Override
	public void electricity(Object source) {
		System.out.println("Лампа зажглась");
	}

}
