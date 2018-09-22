import javax.swing.*;

public class EvenOrOdd {
    public static void main(String[] args) {
        String msg = "please enter an integer value: (terminate by entering -1)";
        int num = 0;

        while(true){
            num = MyMethods.inputInt(msg);
            if(num == -1){
                System.exit(0);
            }
            if (MyMethods.isEven(num) == true){
                JOptionPane.showMessageDialog(null, num + " is even");
            }
            else
                JOptionPane.showMessageDialog(null, num + " is odd");

        }
    }
}
