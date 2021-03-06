package laborator2;

public class BoxingMatch {
    Fighter fighter1;
    Fighter fighter2;
    public BoxingMatch(Fighter fighter1, Fighter fighter2)
    {
        this.fighter1=fighter1;
        this.fighter2=fighter2;
    }
    public String fight(Fighter winner)
    {
        while(fighter1.getHealth()>0 && fighter2.getHealth()>0)
        {
            fighter1.attack(fighter2);

            if(fighter2.getHealth()>0)
            {
                fighter2.attack(fighter1);
            }
            else
            return fighter1.getName();
        }
        return fighter2.getName();
    }
}
