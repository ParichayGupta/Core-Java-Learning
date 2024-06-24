package DesginPatterns.StrategyDesignPattern;

public class EasyBotMovingStrategy implements BotMovingStrategy{
    @Override
    public void moveCommand() {
        System.out.println("Easy Bot is moving");
    }
}
