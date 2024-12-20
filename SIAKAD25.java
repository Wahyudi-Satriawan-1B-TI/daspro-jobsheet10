import java.util.Scanner;
public class SIAKAD25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        System.out.println("======================================");
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int m = sc.nextInt();
        System.out.print("Masukkan jumlah Mata Kuliah: ");
        int mk = sc.nextInt();

        int [][] nilai = new int[m][mk];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("======================================");
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPerSiswa/mk);
        }

        System.out.println("======================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");
        
        for (int j = 0; j < mk; j++) {
            double totalPerMatkul = 0;
            
            for (int i = 0; i < m; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j+1) + ": " + (totalPerMatkul/m));
            System.out.println("======================================");
        }
        sc.close();

    }
}
