import java.util.Scanner;
import java.util.Vector;

public class to1_no1 {
    public static void main(String args[]){
        Vector name = new Vector();
        Scanner sc = new Scanner(System.in);
        String Nim = sc.nextLine();
        String Nama = sc.nextLine();
        System.out.println("Nim   : " + Nim);
        System.out.println("Nama  : " + Nama);
        /*if (Nama.length() >=7){
            for (int i=3; i<=6;i++){
                System.out.print(Nama.charAt(i));
            }
            System.out.println("");
        }*/
       int left = -1, right = -1;
       for (int i=0;i<Nama.length();i++){
         if (Nama.charAt(i) == ' '){
            if (left == -1) continue;
            name.addElement(Nama.substring(left, i));
            left = -1;
         }
         else{
            if (left == -1) left = i;
            right = i+1;
         }
       }
       if (left != -1) name.addElement(Nama.substring(left, right));
        left = -1; 
        right = -1;
        System.out.println(name.elementAt(1));
       
    }
}
