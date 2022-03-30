package laborator2;

public class Fighter{
    private String name;
    private int damagePerAttack, health;
    public Fighter(String name,int damagePerAttack, int health)
    {
        this.damagePerAttack=damagePerAttack;
        this.name=name;
        this.health=health;

    }
    public void attack(Fighter Opponent)
    {
        int damage=100;
        Opponent.health=Opponent.health-damage;
    }

    public String getName() {
        return name;
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }

    public int getHealth() {
        return health;
    }
}
