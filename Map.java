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
        states.add(new State("Texas", "Austin"));
        states.add(new State("Colorado", "Denver"));
        states.add(new State("Maine", "Augusta"));
        states.add(new State("Montana", "Helena"));
        states.add(new State("Nebraska", "Lincoln"));
        
    }

    public void spin()
    {
        rand = (int)(Math.random() * 8);
    }

    public String getState()
    {
        return states.get(rand).getName();
    }

    public String getCapital()
    {
        return states.get(rand).getCapital();
    }

}