package step01_strategy_pattern.result.duck;

import step01_strategy_pattern.result.fly.FlyWithWings;
import step01_strategy_pattern.result.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리 입니다.");
    }
}
