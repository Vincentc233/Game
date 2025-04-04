public class Level
{
    private boolean goal;
    private int points;
    private int sum;

    public boolean goalReached()
    {
        return goal;
    }
    public void reachGoal(){
        goal =true;
    }
    public int getPoints()
    {
        return points;
    }
    public void setPoints(int p){
        points = p;
    }

// There may be instance variables, constructors, and methods that are not shown.
}
