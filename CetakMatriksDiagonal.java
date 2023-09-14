import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CetakMatriksDiagonal {
    static int[][] Matriks = new int[25][25];
    static int ukuranBaris;
    static int ukuranKolom;

    public static void main(String[] args) {
        System.out.print("input jumlah n baris = ");
        ukuranBaris = inputData();
        System.out.print("input jumlah n kolom = ");
        ukuranKolom = inputData();
        bacaMatriks();
        cetakMatriksDiagonal();

    }

    private static int inputData() {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String angkaInput = null;
        try {
            angkaInput = bfr.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int Data = Integer.valueOf(angkaInput).intValue();
        return Data;
    }

    private static void bacaMatriks() {
        for (int i = 0; i < ukuranBaris; i++) {
            for (int j = 0; j < ukuranKolom; j++) {
                System.out.print("Masukan Matriks Baris Ke - " + (i + 1) + " , Kolom Ke " + (j + 1) + " = ");
                Matriks[i][j] = inputData();
            }
        }
    }

    private static void cetakMatriksDiagonal() {
        for (int i = 0; i < ukuranBaris; i++) {
            System.out.println(Matriks[i][i]);
        }
    }
}