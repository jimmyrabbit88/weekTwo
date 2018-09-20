import javax.swing.*;

public class currencyConverter {

    static float rate = 0f;
    public static void main(String[] args) {
        float pounds = 0f;
        getExchangeRate();

        do {
            pounds = getValue();
            if (pounds != 0) {
                displayResults(pounds);
            }
        }while(pounds != 0);

    }

    private static void getExchangeRate(){
        rate = Float.parseFloat(JOptionPane.showInputDialog(null, "Please enter the exchange rate for GB£ to Euro"));
    }

    public static float getValue(){
        float pounds = Float.parseFloat(JOptionPane.showInputDialog(null, "enter the value in Pounds you would like to convert"));
        return pounds;
    }

    public static void displayResults(float pds){
        JOptionPane.showMessageDialog(null, "GB£ : "+ pds + "\nEuro : " + pds*rate,
                "Pounds to Euro using Rate of " + rate, 1 );

    }


}
