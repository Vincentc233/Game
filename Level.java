public class Level
{
    private boolean goal;
    private int points;

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

}
