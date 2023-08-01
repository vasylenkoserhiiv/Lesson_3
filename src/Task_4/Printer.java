package Task_4;
import java.awt.*;
public class Printer {
    public void print(String value){
        System.out.println(value);
    }
}
class ColoredPrinter extends Printer {
    @Override
    public void print(String value) {
        printColored(value, Color.BLACK); // Default color is black
    }

    public void printColored(String value, Color color) {
        // Convert the color to ANSI escape code
        String colorCode = getANSIColorCode(color);
        // Print the colored text
        System.out.println(colorCode + value + "\u001B[0m"); // Reset color after printing
    }

    private String getANSIColorCode(Color color) {
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();

        return String.format("\u001B[38;2;%d;%d;%dm", r, g, b);
    }
}
