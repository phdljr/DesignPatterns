package pattern.strategy.duck;

import pattern.strategy.behavior.fly.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		mallardDuck.display();
		mallardDuck.swim();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
