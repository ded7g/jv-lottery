package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        Ball a = lottery.getRandomBall();
        Ball b = lottery.getRandomBall();
        Ball c = lottery.getRandomBall();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
