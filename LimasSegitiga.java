public class LimasSegitiga extends BangunRuang {
    double luasAlas;
    double tSegitiga;
    double tLimas;
    double luasSisiTegak;

    double luasPermukaan(){
        System.out.println("===== LUAS PERMUKAAN LIMAS SEGITIGA =====");
        System.out.print("Masukkan luas sisi tegak: ");
        luasSisiTegak = input.nextDouble();
        System.out.print("Masukkan luas alas: ");
        luasAlas = input.nextDouble();

        double luasPermukaan = luasSisiTegak + luasAlas;
        System.out.println("Luas Permukaan Limas Segitiga : "+luasPermukaan);
        return 0;
    }

    double volume(){
        System.out.println("===== VOLUME LIMAS SEGITIGA =====");
        System.out.print("Masukkan luas alas: ");
        luasAlas = input.nextDouble();
        System.out.print("Masukkan tinggi limas: ");
        tLimas = input.nextDouble();

        double volume = 1/3 * luasAlas * tLimas;
        System.out.println("Volume Limas Segitiga : "+volume);
        return 0;
    }
}
