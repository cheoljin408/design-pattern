package step01_strategy_pattern.result.quack;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("꽥!");
    }
}
