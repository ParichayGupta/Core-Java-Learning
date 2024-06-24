package DesignPatterns.StrategyDesignPattern;

public class Main {
    public static void main(String[] args) {
        BotMover botMover = new BotMover(new MediumBotMovingStrategy());
        botMover.move(); // Medium bot is moving
        botMover = new BotMover(new HardBotMovingStrategy());
        botMover.move(); // Hard bot is moving
        botMover = new BotMover(new EasyBotMovingStrategy());
        botMover.move(); // Easy bot is moving
    }
}
