import javax.swing.*;

public class ArratAlgs {
    static JTextArea box = MyMethods.createArea();
    public static void main(String[] args) {

        double[] weights = new double[] {234.2,123.0,248.6,322.2,265.1,199.9,301,222.22,401.2,255.2};

        listWeights(weights);
        under(MyMethods.inputInt("Show the number of cattle under this weight"), weights);
        percentageOver(MyMethods.inputInt("Show the percentage of cattle over this weight"), weights);
        lightestAnimal(weights);
        avgWeight(weights);

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
        box.append("\nNumber under " + num + " kg: " + counter);

    }

    public static void percentageOver(int num, double[] weights){
        int counter=0;
        float percent=0f;
        for(int i=0; i<weights.length; i++){
            if (weights[i] >= num){
                counter++;
            }
        }
        percent = (100f/weights.length)*counter;
        box.append("\nPercentage of cattle weighing at least " + num + " kg: " + percent + "%");

    }

    public static void lightestAnimal(double[] weights){
        double lightestAnimal = 0;

        for(int i=0;i<weights.length; i++){
            if (i==0){
                lightestAnimal = weights[i];
            }
            if (weights[i] < lightestAnimal){
                lightestAnimal = weights[i];
            }
        }
        box.append("\nLightest Animal: " + lightestAnimal + " kg");
    }

    public static void avgWeight (double[] weights){
        double adder = 0;
        for (int i=0; i<weights.length; i++){
            adder += weights[i];
        }
        box.append("\nAverage weight: " + String.format("%.1f",(adder/weights.length)) + " kg");
    }




}
