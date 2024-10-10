public class Main{
    public static void main(String[] args) {
        Jagoan jakaSembung = new Jagoan("Jaka Sembung");
        Jubah jubahPutih = new Jubah("Jubah Putih",7,50);
        Senjata golok = new Senjata("Golok", 25);
        jakaSembung.setArmor(jubahPutih);
        jakaSembung.setWeapon(golok);

        Jagoan pitung = new Jagoan("Si Pitung");
        Jubah jubahHitam = new Jubah("Jubah Hitam",8,52);
        Senjata toya = new Senjata("Toya", 24);
        pitung.setArmor(jubahHitam);
        pitung.setWeapon(toya);

        jakaSembung.display();
        pitung.display();

        jakaSembung.attack(pitung);
        jakaSembung.attack(pitung);
        pitung.attack(jakaSembung);
        jakaSembung.attack(pitung);
        pitung.attack(jakaSembung);
    }
}