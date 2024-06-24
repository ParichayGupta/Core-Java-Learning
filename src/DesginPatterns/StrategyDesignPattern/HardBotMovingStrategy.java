package DesginPatterns.StrategyDesignPattern;

public class HardBotMovingStrategy implements BotMovingStrategy{
    @Override
    public void moveCommand() {
        System.out.println("Hard Bot is moving");
    }
}
