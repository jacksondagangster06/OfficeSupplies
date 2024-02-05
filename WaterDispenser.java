public class WaterDispenser
{
    private  int canister;
    private boolean leak;
    public final double DRIP = 1.5;
    public WaterDispenser()
    {
        canister = 10000;
        leak = false;
    }

    public int getAmount()
    {
        return canister;
    }
    /**
     * fillBottle method fills a 500ml water bottle
     **/
    public void fillBottle()
    {
        int rand = (int) (Math.random() * 3);
        if(rand == 0)
        {
            leak = true;
        }
        else
        {
            leak = false;
        }

        if (canister >= 500 && leak == false)
        {
            canister -= 500;
        }
        else if(canister >= 500 && leak == true)
        {
            canister -= 500 * DRIP;
        }
        else
        {
            System.out.println("No more water, refill dispenser");
        }
    }

    public void fillCup()
    {
        int rand = (int) (Math.random() * 3);
        if(rand == 0)
        {
            leak = true;
        }
        else
        {
            leak = false;
        }
        if (canister >= 200)
        {
            canister -= 200;
        }
        else if(canister >= 200 && leak == true)
        {
            canister -= 200 * DRIP;
        }
        else
        {
            System.out.println("No more water, refill dispenser");
        }
    }

    public void refill()
    {
        canister = 1000;
    }
}
