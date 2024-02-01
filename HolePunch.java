public class HolePunch{

    private int holes;

    public HolePunch()
    {
        holes = 0;
    }
    /**
    * the punch method punches a paper and adds 3 dots/holes to the holes count
    * there is a limit of 15 holes in the HolePunch
    **/
    public void punch()
    {
        if(holes < 15)
        {
            holes += 3
        }
        else
        {
            System.out.println("Hole punch is full. Empty to continue punching");
        }
    }
    /**
    * the empty method resets holes to 0
    **/
    public void empty()
    {
        holes = 0;
    }
    /**
    * the getHoles method tells you how many holes are in the HolePunch
    * @ return the number of holes
    **/
    public int getHoles()
    {
        return holes;
    }
}