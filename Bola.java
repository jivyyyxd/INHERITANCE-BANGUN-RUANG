public class Bola extends BangunRuang {
    double r;

    @Override
    double volume(){
        System.out.println("===== VOLUME BOLA =====");
        System.out.print("Masukkan panjang jari jari: ");
        r = input.nextDouble();
        
        double volume = 4/3 * r * r * r;
        System.out.println("Volume bola: "+volume);
        return volume;
    }
    
    @Override
    double luasPermukaan(){
        System.out.println("===== LUAS PERMUKAAN BOLA =====");
        System.out.print("Masukkan panjang jari jari: ");
        r = input.nextDouble();

        double luasPermukaan = 4 * Math.PI * r * r;
        System.out.println("Lupas permukaan bola: "+luasPermukaan);
        return luasPermukaan;
    }
}
