public class Balok extends BangunRuang {   
    double p, l, t;

    @Override
    double volume(){
        System.out.println("===== VOLUME BALOK =====");
        System.out.print("Masukkan panjang: ");
        p = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        l = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        t = input.nextDouble();

        double volume =p * l * t; 
        System.out.println("Volume balok: "+volume);
        return volume;
    }

    @Override
    double luasPermukaan(){
        System.out.println("=====  LUAS PERMUKAAN BALOK =====");
        System.out.print("Masukkan panjang: ");
        p = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        l = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        t = input.nextDouble();

        double luasPermukaan = 2 * ((p*l) + (p*t) + (l*t));
        System.out.println("Luas permukaan balok: "+luasPermukaan);
        return luasPermukaan;
    }
}
