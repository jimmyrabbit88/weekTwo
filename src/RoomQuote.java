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

        name = getName();
        len = Float.parseFloat(JOptionPane.showInputDialog(null, "Please enter the length of your room"));
        wid = Float.parseFloat(JOptionPane.showInputDialog(null, "Please enter the width of your room"));
        cPSM = Float.parseFloat(JOptionPane.showInputDialog(null, "Please enter the cost of carpet per sq meter"));
        area = len*wid;
        totalCost = doCalc(area, cPSM);
        setTitle(name);
        setValues(len, wid, area, cPSM, totalCost);
        JOptionPane.showMessageDialog(null, quoteBox);

    }

    public static void setTitle(String name){

        quoteBox.setText(String.format("%-40s\n", "Quotation for "+name));
    }

    public static String getName(){
        String name = JOptionPane.showInputDialog(null, "Please enter your full Name", "Enter Name", 1);
        return name;
    }
    public static float doCalc(float area, float cPSM){
        float total;
        total = area*cPSM;


        return total;
    }

    public static void setValues(float len, float wid, float area, float cPSM, float tot){
        quoteBox.append(String.format("%-40s%-15s\n%-40s%-15s\n%-40s%-15s\n%-40s%-15s\n%-40s%-15s\n", "Length of Room", len + "m", "Width of room", wid + "m",
                                            "Area of Room :",area+"Msq", "Cost Per Meter Squared:", "Eur "+cPSM, "Total Cost", "Eur " + tot));
    }
}
