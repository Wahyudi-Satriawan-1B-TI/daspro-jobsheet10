import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rataResponden = 0, rataPertanyaan = 0;
        int [][] survei = new int[10][6];

        for (int i = 0; i < survei.length; i++) {
            System.out.println("============================================================================");
            System.out.println("Silahkan isi pertanyaan-pertanyaan berikut dengan cara melakukan input (1-5)");
            System.out.println("1 = Sangat Tidak Puas");
            System.out.println("2 = Tidak Puas");
            System.out.println("3 = Biasa");
            System.out.println("4 = Puas");
            System.out.println("5 = Sangat Puas");
            System.out.println("============================================================================");
            System.out.println("Responden ke-" + (i + 1));
            double totalPerResponden = 0;
            
            for (int j = 0; j < survei[i].length; j++) {
                int input;
                System.out.print("Pertanyaan ke-" + (j + 1) + ": ");
                input = sc.nextInt();
                    
                if (input >= 1 && input <= 5) {
                    survei[i][j] = input;
                    totalPerResponden += input;
                } else {
                    System.out.println("Input tidak valid, masukkan angka antara 1 hingga 5.");
                }
            }
            System.out.printf("Nilai rata-rata responden ke-" + (i+1) + ": " + (totalPerResponden/6));
            rataResponden += (totalPerResponden/6);
            System.out.println();
        }
        System.out.println("============================================================================");
        System.out.println("Nilai rata-rata setiap Pertanyaan:");
        
        for (int j = 0; j < 6; j++) {
            double totalPerPertanyaan = 0;
            
            for (int i = 0; i < 10; i++) {
                totalPerPertanyaan += survei[i][j];
            }
            System.out.println("======================================");
            System.out.printf("Pertanyaan ke-" + (j + 1) + ": " + (totalPerPertanyaan/10));
            rataPertanyaan += (totalPerPertanyaan/10);
            System.out.println();
        }
        
        System.out.println("============================================================================");
        System.out.println("Nilai rata-rata keseluruhan: " + ((rataPertanyaan / 6 + rataResponden / 10) / 2));
        System.out.println("============================================================================");
        
        sc.close();
    }
}