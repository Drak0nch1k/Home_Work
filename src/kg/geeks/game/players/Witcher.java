package kg.geeks.game.players;

public class Witcher extends Hero{
    public Witcher(int health, int damage, String name) {

        super(health, damage, SuperAbility.NECROMANCER, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <= 0 && !heroes[i].equals(this)){
                int health = heroes[i].getHealth();
                heroes[i].setHealth(health + this.getHealth());
                System.out.println("Witcher оживил: " + heroes[i]);
                this.setHealth(0);
                break;
            }
        }

    }
}
