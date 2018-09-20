import javax.swing.*;

public class RoomQuote {
    static JTextArea quoteBox = YardsToInches.createArea();
    public static void main(String[] args) {
        String name="";
        float len = 0f;
        float wid = 0f;
        float area = 0f;
        float cPSM = 0f;
        float totalCost = 0f;

        getName();
        setTitle();

    }

    public static void setTitle(String name){
        quoteBox.setText(String.format("%-40s", "Quotation for "+name));
    }

    public static String getName(){
        String name = 
    }
}
