package players;

public class Berserk extends Hero {
    private int savedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    public int getSavedDamage() {
        return savedDamage;
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        setSavedDamage(boss.getDamage()/10);
        for (int i = 0; i <heroes.length ; i++) {
            if (this.getHealth()>0 && boss.getHealth()>0){
                boss.setHealth(boss.getHealth() - (this.getDamage() + getSavedDamage()));
                break;


            }

        }System.out.println(this.getName() + " " + "Oтбил босса");


    }


}
