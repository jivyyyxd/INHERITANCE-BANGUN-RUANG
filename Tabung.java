public class Tabung extends BangunRuang {
    double r, t;

    @Override
    double volume(){
        System.out.println("===== VOLUME TABUNG =====");
        System.out.print("Masukkan panjang jari jari: ");
        r = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        t = input.nextDouble();

        double volume = Math.PI * r * r * t;
        System.out.println("Volume tabung: "+volume);
        return 0;
    }

    @Override
    double luasPermukaan(){
        System.out.println("===== VOLUME TABUNG =====");
        System.out.print("Masukkan panjang jari jari: ");
        r = input.nextDouble();

        double luasPermukaan = (2 * Math.PI) + (2 * Math.PI * r * r);
        System.out.println("Luas permukaan tabung: "+luasPermukaan);
        return 0;
    }
}
