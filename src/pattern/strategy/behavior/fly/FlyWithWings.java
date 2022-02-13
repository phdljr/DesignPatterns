package pattern.strategy.behavior.fly;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("날고있다.");
	}

}
