package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier{
    public Ball getRandomBall(){
        int rand = new Random().nextInt(101);
        return new Ball(rand, getRandomColor());
    }
}
