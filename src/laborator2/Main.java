package laborator2;

public class Main {

    public static void Main(String[] args)
    {
        Fighter fighter1=new Fighter("Superman", 20,1000);
        Fighter fighter2=new Fighter("Grinch", 40,1000);
        BoxingMatch bm=new BoxingMatch(fighter1,fighter2);
    }
}
