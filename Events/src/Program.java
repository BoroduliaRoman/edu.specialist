
public class Program {
	
	public static void fireFighters(Object source) {
		System.out.println("Пожарные приехали");
	}

	public static void main(String[] args) {
		Switcher sw = new Switcher();
		
		Lamp lamp = new Lamp();
		TvSet tv = new TvSet();
		AirCondition ac = new AirCondition();
		
		sw.addElectricityListener(lamp); // event subscribe
		sw.addElectricityListener(tv);	
		
//		sw.addElectricityListener(e -> ac.on(e));
		sw.addElectricityListener( ac :: on);
//		sw.addElectricityListener(e -> Program.fireFighters(e));
		sw.addElectricityListener(Program :: fireFighters);
		
		
		final String message = "Пожар!";
		
//		mesaage += "!";
		
		sw.addElectricityListener(new ElectricityListener() {			
			@Override
			public void electricity(Object e) {
				System.out.println(message);
			}
		});
		
		sw.addElectricityListener(e -> System.out.println(message));
		
		sw.switchOn();
	}
}