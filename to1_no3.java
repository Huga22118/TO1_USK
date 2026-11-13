import java.util.Scanner;
import javax.swing.JOptionPane;

public class to1_no3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String d1 = JOptionPane.showInputDialog("Nilai 1: ");
        String d2 = JOptionPane.showInputDialog("Nilai 2: ");
        String d3 = JOptionPane.showInputDialog("Nilai 3: ");
        double n1,n2,n3;
        n1 = Double.parseDouble(d1);
        n2 = Double.parseDouble(d2);
        n3 = Double.parseDouble(d3);
        System.out.println("Nilai 1: " + n1);
        System.out.println("Nilai 2: " + n2);
        System.out.println("Nilai 3: " + n3);
        double avg = (n1+n2+n3)/3;
        String ef = Double.toString(avg);
        if (avg%3 == 0) ef+='0';
        else{
            int decpoint = 0;
            for (int i=0;i<ef.length();i++){
                if (ef.charAt(i) == '.'){
                    decpoint = i;
                    break;
                }
            }
            ef = ef.substring(0, decpoint+3);
        }
        JOptionPane.showMessageDialog(null, 
            ("Rata: " + String.format("%.2f", avg) + '\n' + "Hasil: " + (avg>59 ? "LULUS" : "GAGAL")));
        System.out.print("Rata: ");
        System.out.printf("%.2f", avg);
        System.out.println("");
        System.out.println("Hasil: " + (avg>59 ? "LULUS" : "GAGAL"));
    }
}
