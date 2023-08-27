package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Thor extends Hero {
    public Thor(int health, int damage, String name) {

        super(health, damage, SuperAbility.STUN, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean stun = RPG_Game.random.nextBoolean();
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && stun == true){
                boss.setDamage(0);
                System.out.println("Boss оглушон ");
            }else {
                boss.setDamage(70);
            }
            break;
        }

    }
}
