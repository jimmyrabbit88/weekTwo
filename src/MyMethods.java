import javax.swing.*;
import java.awt.*;

public class MyMethods {
    public static int cube(int num) {
        return num * num * num;

    }

    public static void displayCubeNumbers(int num) {
        JTextArea box = createArea();
        for (int i = 1; i <= num; i++) {
            box.append(String.format("%-10s%-10s\n", i, cube(i)));
        }
        JOptionPane.showMessageDialog(null, box);
    }

    public static JTextArea createArea() {
        JTextArea box1 = new JTextArea();
        box1.setFont(new Font("monospaced", Font.PLAIN, 12));
        return box1;
    }
}
