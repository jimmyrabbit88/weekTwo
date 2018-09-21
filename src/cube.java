import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class cube {
    static JTextArea box = YardsToInches.createArea();
    public static void main(String[] args) {
        String message = "Please enter the length of the side of your container";
        int sizeOfContainer;
        int volumeOfContainer;

        sizeOfContainer = MyMethods.inputInt(message);
        volumeOfContainer =MyMethods.getCubeOf(sizeOfContainer);
        if (volumeOfContainer>100){
            JOptionPane.showMessageDialog(null, "You cant take this on board, put it in your check in luggage");
        }
        else
            JOptionPane.showMessageDialog(null, "This is allowed to be carried on board");

    }



}
