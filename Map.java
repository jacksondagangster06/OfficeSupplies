import java.util.ArrayList;


public class Map
{
    ArrayList<State> states;
    private int rand;

    public Map()
    {
        rand = 0;
        states = new ArrayList<State>();
        states.add(new State("California","Sacremento"));
        states.add(new State("New York","Albany"));
        states.add(new State("Florida","Tallahassee"));
        
    }

    public void spin()
    {
        
    }
}