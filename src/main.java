import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        Boss boss = new Boss();

        boss.setBossDamage(50);
        boss.setHealth(400);
        boss.setProtection("Magical");
        System.out.println("Damage boss: " + boss.getBossDamage() + " " + " Health boss : " + boss.getHealth() +
                " Protection boss :" + boss.getProtection());
        createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Damage hero : "+createHeroes()[i].getDamage() +" "+ "Health: " +createHeroes()[i].getHealth() +" Superpower: "+ createHeroes()[i].getSuperPower());
        }
    }
    public static  Hero[] createHeroes(){
        Hero thor=new Hero(280,33);
        Hero halk=new Hero(300,45,"melner");
        Hero kep=new Hero(220,22);
        Hero[] heroes ={thor,halk,kep};
        return heroes;
    }
}
