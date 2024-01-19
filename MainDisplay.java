import java.util.*;

public class MainDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        String keputusan;

        boolean lagi = true;

        while (lagi) {
            System.out.println("===== PILIHAN =====");
            System.out.println("1. Volume Balok\n2. Luas Permukaan Balok\n3. Volume Bola\n4. Luas Permukaan Bola\n5. Volume Limas Segitiga\n6. Luas Permukaan Limas Segitiga\n7. Volume Tabung\n8. Luas Permukaan Tabung");
            System.out.println("===================");
            System.out.print("Pilihan Anda : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    Balok balok = new Balok();
                    balok.volume();

                    System.out.println("==========================");
                    System.out.println("MAU MENCOBA LAGI ? (ya/tidak)");
                        System.out.print("PILIHAN : ");
                        keputusan = input.nextLine();
    
                        if (keputusan.equalsIgnoreCase("ya")) {
                           continue;
                        } 
                    break;
                case 2:
                    Balok balok2 = new Balok();
                    balok2.luasPermukaan();

                    System.out.println("==========================");
                    System.out.println("MAU MENCOBA LAGI ? (ya/tidak)");
                        System.out.print("PILIHAN : ");
                        keputusan = input.nextLine();
    
                        if (keputusan.equalsIgnoreCase("ya")) {
                           continue;
                        } 
                    break;
                case 3:
                    Bola bola = new Bola();
                    bola.volume();

                    System.out.println("==========================");
                    System.out.println("MAU MENCOBA LAGI ? (ya/tidak)");
                        System.out.print("PILIHAN : ");
                        keputusan = input.nextLine();
    
                        if (keputusan.equalsIgnoreCase("ya")) {
                           continue;
                        } 
                    break;
                case 4:
                    Bola bola2 = new Bola();
                    bola2.luasPermukaan();

                    System.out.println("==========================");
                    System.out.println("MAU MENCOBA LAGI ? (ya/tidak)");
                        System.out.print("PILIHAN : ");
                        keputusan = input.nextLine();
    
                        if (keputusan.equalsIgnoreCase("ya")) {
                           continue;
                        } 
                    break;
                case 5:
                    LimasSegitiga limasSegitiga = new LimasSegitiga();
                    limasSegitiga.volume();

                    System.out.println("==========================");
                    System.out.println("MAU MENCOBA LAGI ? (ya/tidak)");
                        System.out.print("PILIHAN : ");
                        keputusan = input.nextLine();
    
                        if (keputusan.equalsIgnoreCase("ya")) {
                           continue;
                        } 
                    break;
                case 6:
                    LimasSegitiga limasSegitiga2 = new LimasSegitiga();
                    limasSegitiga2.luasPermukaan();
                    
                    System.out.println("==========================");
                    System.out.println("MAU MENCOBA LAGI ? (ya/tidak)");
                        System.out.print("PILIHAN : ");
                        keputusan = input.nextLine();
    
                        if (keputusan.equalsIgnoreCase("ya")) {
                           continue;
                        } 
                    break;
                case 7:
                    Tabung tabung = new Tabung();
                    tabung.volume();

                    System.out.println("==========================");
                    System.out.println("MAU MENCOBA LAGI ? (ya/tidak)");
                        System.out.print("PILIHAN : ");
                        keputusan = input.nextLine();
    
                        if (keputusan.equalsIgnoreCase("ya")) {
                           continue;
                        } 
                        
                    break;
                case 8:
                    Tabung tabung2 = new Tabung();
                    tabung2.luasPermukaan();

                    System.out.println("==========================");
                    System.out.println("MAU MENCOBA LAGI ? (ya/tidak)");
                        System.out.print("PILIHAN : ");
                        keputusan = input.nextLine();
    
                        if (keputusan.equalsIgnoreCase("ya")) {
                           continue;
                        } 
                    break;
                default:
                    break;
            }
        input.close();
        }
    }
}
