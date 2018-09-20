import javax.swing.*;

public class nameTests {
    static int nameLength = 0;
    static char firstInitial;
    static String nameInCaps;
    static String surname;


    public static void main(String[] args) {
        String name ="";


        name = JOptionPane.showInputDialog(null, "Please enter your full name");
        getLen(name);
        firstInitial(name);
        toCaps(name);
        justSurname(name);
        printDetails();


    }

    public static void getLen(String name){
        nameLength = name.length();
    }

    public static void firstInitial(String name){
        firstInitial = name.charAt(0);
    }

    public static void toCaps(String name){
        nameInCaps = name.toUpperCase();
    }

    public static void justSurname(String name){
        int lastSpace = 0;
        lastSpace = name.lastIndexOf(" ");
        surname = name.substring(lastSpace + 1, nameLength);
    }
    public static void printDetails(){
        JOptionPane.showMessageDialog(null, nameLength + "\n"+ firstInitial + "\n" +nameInCaps + "\n" + surname);
    }

}
