package players;

import general.RPG_Game;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coefficient = RPG_Game.random.nextInt(2) + 2;
        boss.setHealth(boss.getHealth() - coefficient * this.getDamage());
        System.out.println("WARRIOR HITS CRITICALLY: " + coefficient * this.getDamage());
    }
}
