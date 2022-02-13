package pattern.strategy.duck;

import pattern.strategy.behavior.fly.FlyWithWings;
import pattern.strategy.behavior.quack.Quack;

public class MallardDuck extends Duck{
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("���� �������Դϴ�.");
	}
}
