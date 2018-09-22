import javax.swing.*;

public class ArratAlgs {
    static JTextArea box = MyMethods.createArea();
    public static void main(String[] args) {

        double[] weights = new double[] {234.2,123.0,248.6,322.2,265.1,199.9,301,222.22,401.2,255.2};

        listWeights(weights);
        under(MyMethods.inputInt("Show the number of cattle under this weight"), weights);

        JOptionPane.showMessageDialog(null, box);
    }

    public static void listWeights(double[] weights){
        box.append("Weights: ");
        for(int i=0; i<weights.length; i++){
            box.append(weights[i] +",");
        }

    }

    public static void under(int num, double[] weights){
        int counter=0;
        for(int i=0; i<weights.length; i++){
            if (weights[i] < num){
                counter++;
            }
        }
        box.append(("\nNumber under " + num + " kg: " + counter));

    }
}
