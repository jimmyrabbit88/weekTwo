import javax.swing.*;

public class Arrays {
    public static void main(String[] args) {
        int[] userArray = new int[10];

        for(int i=0; i<10; i++){
            userArray[i] = MyMethods.inputInt("Please enter an integer:");
        }
        JOptionPane.showMessageDialog(null, "The first value in the array is " + userArray[0] +
                                                                    "\nThe 5th number in the array is " + userArray[4]);
    }
}
