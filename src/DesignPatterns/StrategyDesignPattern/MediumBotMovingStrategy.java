package DesignPatterns.StrategyDesignPattern;

public class MediumBotMovingStrategy implements BotMovingStrategy{
    @Override
    public void moveCommand() {
        System.out.println("Medium Bot is moving");
    }
}
