package Models;

public class Fighter {
    final int maxLife = 100;
    protected String name;
    protected Integer strength;
    protected Integer dexterity;
    protected Integer life = maxLife;

    public Fighter() {
    }

    public Fighter(String name, Integer strength, Integer dexterity, Integer life) {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public void fight(Fighter ennemy) {
        System.out.println(this.name + " ATTACKS");
        int damage = (int) (Math.random() * this.strength + 1) - ennemy.dexterity;
        if (damage < 0) {
            damage = 0;
        }
        System.out.println("damage " + damage);
        ennemy.life = ennemy.life - damage;
        System.out.println(ennemy.name + " 💙 " + ennemy.life + " life points");

    }
    public boolean isAlive() {
        return this.life >0;
    }
}



