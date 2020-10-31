import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program untuk mencari total gaji
 * dan tunjangan dari inputan status user
 */

public class ProgramTunjangan {
    public static void main(String[] args) {
        Scanner scanner;
        int gajiPokok,
                tunjangan,
                totalGaji;

        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan?:" + " Rp.");
        scanner = new Scanner(System.in);
        gajiPokok = scanner.nextInt();
        tunjangan = 0;

        System.out.print("Status Anda? " + "(Menikah/Belum)\t: ");
        String status = scanner.next();

        System.out.print("\n");
        System.out.println("========Hasil Perhitungan Gaji Anda========");

        NumberFormat numberFormat = NumberFormat.getInstance(new Locale("id", "ID"));
        System.out.println("Gaji Pokok\t\t\t:" + " Rp." + numberFormat.format(gajiPokok));

        if (status.equals("Menikah")) {
            tunjangan = (int) (0.35 * gajiPokok);
        }

        totalGaji = gajiPokok + tunjangan;
        System.out.println("Tunjangan\t\t\t:" + " Rp." + numberFormat.format(tunjangan));
        System.out.println("Total Gaji\t\t\t:" + " Rp." + numberFormat.format(totalGaji));
        System.out.println("(Developed by : Arsy Opraza Akma)");
    }
}
