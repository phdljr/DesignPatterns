package pattern.strategy.duck;

import pattern.strategy.behavior.fly.FlyNoWay;
import pattern.strategy.behavior.quack.Quack;

public class ModelDuck extends Duck{
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("���� ���� �����Դϴ�.");
	}
}
