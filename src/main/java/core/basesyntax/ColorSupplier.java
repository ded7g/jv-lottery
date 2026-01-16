package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int rand = new Random().nextInt(Colors.values().length);
        Colors color = Colors.values()[rand];

        return color.toString();
    }
}
