package step01_strategy_pattern.result.duck;

import step01_strategy_pattern.result.fly.FlyNoWay;
import step01_strategy_pattern.result.quack.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
