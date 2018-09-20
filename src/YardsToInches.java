import javax.swing.*;
import java.awt.*;

public class YardsToInches {

    public static void main(String[] args) {


        JTextArea box1 = createArea();
        box1 = appendConversionTable(box1);
        JOptionPane.showMessageDialog(null, box1, "Table of Yards to Inches", 1);
    }


    public static JTextArea createArea() {
        JTextArea box1 = new JTextArea();
        Font font = new Font("monospaced", Font.PLAIN, 12);
        box1.setFont(font);
        box1.setText(String.format("%-20s%-20s\n", "Yards", "Inches"));
        box1.append(String.format("%-20s%-20s\n", "--------", "--------"));
        return box1;
    }

    public static JTextArea appendConversionTable(JTextArea box1){
        int yrd2In = 36;
        int numberOfConverions = 10;
        for (int i = 1; i <= numberOfConverions; i++) {
            box1.append(String.format("%-20s%-20s\n", i, i * yrd2In));
        }
        return box1;
    }
}
