package players;
public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int boost = 5;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this.getHealth() > 0){
                heroes[i].setDamage(heroes[i].getDamage() + boost);
            }

        }            System.out.println(this.getName() +" ADDED DAMAGE");


    }
}
