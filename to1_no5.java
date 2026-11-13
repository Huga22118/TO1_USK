import java.util.Scanner;
import javax.swing.JOptionPane;

public class to1_no5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = 5;
        for (int i=0;i<=N;i++){
            for (int j=0;j<=N-i;j++) System.out.print(j);
            System.out.println("");
        }
    }
}
