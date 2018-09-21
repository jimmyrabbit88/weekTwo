import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class cube {
    static JTextArea box = YardsToInches.createArea();
    public static void main(String[] args) {

        for (int i=0; i<15; i++){
           box.append(String.format("%-10s%-10s", i, cube(i)));
        }
        J
    }


    public static int cube(int num){
        return num*num*num;

    }
}
