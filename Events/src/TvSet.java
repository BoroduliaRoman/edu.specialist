
public class TvSet implements ElectricityListener{

	@Override
	public void electricity(Object source) {
		System.out.println("Телевизор включён");
	}

}
