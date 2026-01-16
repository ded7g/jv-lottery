package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier{
    public Ball getRandomBall(){
        int rand = new Random().nextInt(100);

        Ball ball = new Ball(rand, getRandomColor());
        return ball;
    }
}
