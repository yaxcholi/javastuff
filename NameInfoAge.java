import javax.swing.JOptionPane;

public class NameInfoAge {
    public static void main(String[] args) {
     
        String name = JOptionPane.showInputDialog("Enter your name:");

        
        String ageStr = JOptionPane.showInputDialog("Enter your age:");
     
        int age = Integer.parseInt(ageStr);


        JOptionPane.showMessageDialog(null, "My name is " + name + " and I am " + age + " years old");
    }
}
