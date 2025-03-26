public class Game
{
    private int score;
    private boolean bonus;
    private Level levelOne = new Level(true, 200);
    private Level levelTwo = new Level(true, 100);;
    private Level levelThree = new Level(true, 500);;

    /** Postcondition: All instance variables have been initialized. */
    public Game(boolean b)
    {
        bonus = b;
    }
    /** Returns true if this game is a bonus game and returns false otherwise */
    public boolean isBonus()
    {
        return bonus;
    }
    /** Simulates the play of this Game (consisting of three levels) and updates all relevant
     * game data
     */
    public void play()
    { /* implementation not shown */ }
    /** Returns the score earned in the most recently played game, as described in part (a) */
    public int getScore()
    {
        score = levelOne.getPoints() + levelTwo.getPoints() + levelThree.getPoints();
        if(isBones())
        return score;
    }
    /** Simulates the play of num games and returns the highest score earned, as
     * described in part (b)
     * Precondition: num > 0
     */
    public int playManyTimes(int num)
    { /* to be implemented in part (b) */ }
// There may be instance variables, constructors, and methods that are not shown.
}
