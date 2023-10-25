import java.io.*;
import java.sql.SQLOutput;

public class MainClassSuper {
    public static void main(String[] args) throws IOException{
        //Instance Of CLass nya
        subClass sub = new subClass("","",0);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("--INPUT--");
        System.out.print("Masukkan Nama : ");
        String nama = input.readLine();
        System.out.print("Masukkan Keterangan : ");
        String ket = input.readLine();
        System.out.print("Masukkan Usia : ");
        int usia = Integer.parseInt(input.readLine());

        //Masukkan data ke object Constructor
        sub = new subClass (nama, ket, usia);

        //Membuat Output an
        System.out.println("-- LIHAT DATA YANG TELAH DI INPUT--");
        System.out.println("Nama : " + sub.getNama());
        System.out.println("Keterangan : " + sub.getKeterangan());
        System.out.println("Usia : " + sub.getUsia());


    }
}
