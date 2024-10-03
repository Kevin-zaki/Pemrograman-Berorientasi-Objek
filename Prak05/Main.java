public class Main {
    public static void main(String[] args) throws Exception {
        Spider LabaLaba = new Spider();
        LabaLaba.eat();

        Dog Blacky = new Dog();
        Blacky.setName("Blacky Si Raja Guguk");
        System.out.println("Nama Anjing Saya adalah " + Blacky.getName());
        Blacky.play();
        Blacky.eat();
        Blacky.walk();

        Cat Winter = new Cat();
        Winter.setName("Winter");
        System.out.println("Nama Kucing Saya adalah " + Winter.getName());
        Winter.play();
        Winter.eat();
        Winter.walk();
    }
}