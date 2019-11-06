package cn.test.designpatterns.strategy.code;

public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        strategy.doSomething();
    }

    public Context setStrategy(IStrategy strategy) {
        this.strategy = strategy;
        return this;
    }
}
