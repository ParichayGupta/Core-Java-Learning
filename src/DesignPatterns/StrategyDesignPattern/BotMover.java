package DesignPatterns.StrategyDesignPattern;

public class BotMover {

    private final BotMovingStrategy botMovingStrategy;

    public BotMover(BotMovingStrategy botMovingStrategy){
        this.botMovingStrategy = botMovingStrategy;
    }

    public void move(){
        botMovingStrategy.moveCommand();
    }
}
