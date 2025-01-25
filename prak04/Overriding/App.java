public class App {
    public static void main(String[] args) throws Exception {
        BangunDatar bangunDatar = new BangunDatar();
        Persegi persegi = new Persegi(3);
        Segitiga segitiga = new Segitiga(4, 4);
        Lingkaran lingkaran = new Lingkaran(7);
        
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        System.out.print("\n");
        System.out.println("Luas persegi: " + persegi.luas());
        System.out.println("keliling persegi: " + persegi.keliling());
        System.out.print("\n");
        System.out.println("Luas segitiga: " + segitiga.luas());
        System.out.print("\n");
        System.out.println("Luas lingkaran: " + lingkaran.luas());
        System.out.println("keliling lingkaran: " + lingkaran.keliling());
    }
}