package Task_4;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        ColoredPrinter coloredPrinter = new ColoredPrinter();

        coloredPrinter.print("Hello, I am printed in the default color (black).");
        coloredPrinter.printColored("This text is printed in custom color (blue).", Color.BLUE);
        coloredPrinter.printColored("This text is printed in custom color (red).", Color.RED);
        coloredPrinter.printColored("This text is printed in custom color (green).", Color.GREEN);
    }
}


