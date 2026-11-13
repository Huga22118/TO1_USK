import java.util.Scanner;
import javax.swing.JOptionPane;

public class to1_no4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String d1 = JOptionPane.showInputDialog("Nilai 1: ");
        String d2 = JOptionPane.showInputDialog("Nilai 2: ");
        String d3 = JOptionPane.showInputDialog("Nilai 3: ");
        double n1,n2,n3;
        n1 = Double.parseDouble(d1);
        n2 = Double.parseDouble(d2);
        n3 = Double.parseDouble(d3);
        double count = n1*n2;
        double count1 = n3/n2;
        System.out.println("Nilai 1: " + n1);
        System.out.println("Nilai 2: " + n2);
        System.out.println("Nilai 3: " + n3);
        System.out.println("Hasil X: " + count);
        System.out.println("Hasil /: " + count1);
        JOptionPane.showMessageDialog(null,
             ("Nilai 1: " + n1 + "\n" + "Nilai 2: " + n2 +"\n" + "Nilai 3: " + n3 + '\n' + "Hasil X: " + count +  "Hasil /:" + count1));
    }
}
