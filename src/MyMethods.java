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

    public static int inputInt(String str){
        int val;
        val = Integer.parseInt(JOptionPane.showInputDialog(null, str));
        return val;
    }

    public static int getCubeOf(int num){
        num = num*num*num;
        return num;
    }

    public static boolean isEven(int num){
        if(num%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
