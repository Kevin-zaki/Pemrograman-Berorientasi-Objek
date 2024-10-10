class Jagoan{
    private String nama;
    private int baseHealth;
    private int baseAttack;
    private int incrementHealth;
    private int incrementAttack;
    private int level;
    private int totalDamage;
    private boolean isAlive;

    // Ini adalah object member
    private Jubah armor;
    private Senjata weapon;

    public Jagoan(String nama){
        this.nama = nama;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
        this.isAlive = true;
    }

    public String getName(){
        return this.nama;
    }

    public int getHealth(){
        return this.maxHealth() - this.totalDamage;
    }

    public void display(){
        System.out.println("Nama Jagoan\t\t: " + this.nama);
        System.out.println("Jubah\t\t\t: " + this.armor.getname());
        System.out.println("Senjata\t\t\t: " + this.weapon.getname());
        System.out.println("Level\t\t\t: " + this.level);
        System.out.println("Kesehatan\t\t: " + this.getHealth() +"/" + this.maxHealth());
        System.out.println("Menyerang \t\t: " + this.getAttackPower());
        System.out.println("Masih Hidup\t\t: " + this.isAlive + "\n");
    }

    public void attack(Jagoan opponent){
        // hitung damage
        int damage = this.getAttackPower();
        // print event
        System.out.println(this.nama + " Menyerang " + opponent.getName() + " dengan kekuatan " + damage);
        // attack si opponent
        opponent.defence(damage);

        this.levelUp();
    }

    public void defence(int damage){

        // receive damage
        int defencePower = this.armor.getDefencePower();
        int deltaDamage;

        System.out.println(this.nama + " Kekuatan Pertahanan = "+ defencePower);
        if(damage > defencePower){
            deltaDamage = damage - defencePower;
        } else {
            deltaDamage = 0;
        }
        
        System.out.println("Kekalahan yang diperoleh = " + deltaDamage + "\n");
        
        // adding total damage
        this.totalDamage += deltaDamage;

        // check is alive
        if (this.getHealth() <= 0){
            this.isAlive = false;
            this.totalDamage = this.maxHealth();
        }

        this.display();
    }
    
    private int getAttackPower(){
        return this.baseAttack + this.level*this.incrementAttack + this.weapon.getAttack();
    }

    private void levelUp(){
        this.level++;
    }

    public void setArmor(Jubah armor){
        this.armor = armor;
    }

    public void setWeapon(Senjata weapon){
        this.weapon = weapon;
    }

    public int maxHealth(){
        return this.baseHealth + this.level*this.incrementHealth + this.armor.getAddHealth();
    }


}