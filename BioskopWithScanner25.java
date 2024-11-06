import java.util.Scanner;
public class BioskopWithScanner25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next, menu;

        String[][] penonton = new String[4][2];

        do {
            System.out.println("===========================================");
            System.out.println("Menu 1: Input data penonton");
            System.out.println("Menu 2: Tampilkan data penonton");
            System.out.println("Menu 3: Exit");
            System.out.print("Pilih menu yang diinginkan (1-3): ");
            menu = sc.nextLine();

            if (menu.equals("1")) {
                while (true) {
                    System.out.println("===========================================");
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Posisi baris atau kolom tidak valid! Silakan coba lagi.");
                            continue;
                        }

                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi pada baris " + baris + " kolom " + kolom + " sudah terisi. Silakan pilih kursi lain.");
                        } else {
                            break;
                        }
                    }

                    penonton[baris - 1][kolom - 1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu.equals("2")) {
                System.out.println("===========================================");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Penonton pada baris ke-" + (i + 1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        System.out.print((penonton[i][j] != null ? penonton[i][j] : "***") + "\t");
                    }
                    System.out.println();
                }
            } else if (!menu.equals("3")) {
                System.out.println("Pilihan tidak valid, silakan pilih menu yang benar.");
            }

        } while (!menu.equals("3"));

        System.out.println("Terima kasih");
        sc.close();
    }
}