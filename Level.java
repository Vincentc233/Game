public class Level
{
    private boolean goal;
    private int points;
    private int sum;

    public Level(boolean g, int p){
        goal = g;
        points = p;
    }
    /** Returns true if the player reached the goal on this level and returns false otherwise */
    public boolean goalReached()
    {
        return goal;
    }
    /** Returns the number of points (a positive integer) recorded for this level */
    public int getPoints()
    {
        if(goal) sum+= points;
        return sum;
    }

// There may be instance variables, constructors, and methods that are not shown.
}
