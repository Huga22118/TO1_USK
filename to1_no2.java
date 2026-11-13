import java.util.Scanner;

public class to1_no2 {
    // convert double to rupiah format -Huga
    public static String s(double e){
        String temp;
        temp = String.format("%.1f", e);
        int ef = 0;
        for (int i=0;i<temp.length();i++){
            if (temp.charAt(i) == ','){
                ef = i;
                break;
            }
        }
        String s = temp.substring(0, ef);
        String yf = "";
        int cnt = 0;
        for (int i=s.length()-1; i>=0; i--){
            yf+=s.charAt(i);
            cnt++;
            if (cnt==3 && i!=0){ yf+='.'; cnt = 0;}
        }
        cnt = 0; String reversed = "";
        for (int i=0;i<yf.length();i++){
            reversed+=yf.charAt(yf.length()-1-i);
        }
        return reversed;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double hargaBarang, dis;
        hargaBarang = sc.nextInt();
        dis = sc.nextInt();
        System.out.println("Harga Barang : Rp. " + s(hargaBarang));
        System.out.println("Diskon : " + dis + " %");
        double discount, temp;
        discount = hargaBarang/100*dis;
        temp = hargaBarang-discount;
        System.out.println("Diskon(Rp.) : Rp. " + s(discount));
        System.out.println("Total Harga : Rp. " + s(temp));
    }
}
