package step01_strategy_pattern.result;

import step01_strategy_pattern.result.duck.Duck;
import step01_strategy_pattern.result.duck.MallardDuck;
import step01_strategy_pattern.result.duck.ModelDuck;
import step01_strategy_pattern.result.fly.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        System.out.println("----- 물오리 -----");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        System.out.println();

        System.out.println("----- 모형 오리 -----");
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        System.out.println();
    }
}
