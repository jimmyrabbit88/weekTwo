import javax.swing.*;

public class MathMethods {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        String roots;

        a = Double.parseDouble(JOptionPane.showInputDialog(null, "enter a value for a"));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "enter a value for b"));
        c = Double.parseDouble(JOptionPane.showInputDialog(null, "enter a value for c"));

        getRoots(a, b, c);


    }


    public static void getRoots(double a, double b, double c) {
        String roots = "";
        double res = 0;
        res = ((-1*b)+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        if (res%1==0){
            roots += res +" ";
        }
        res = ((-1*b)-Math.sqrt((b*b)-(4*a*c)))/(2*a);
        if (res%1==0){
            roots += res;
        }
        JOptionPane.showMessageDialog(null, "Values are :"+roots);
    }
}
