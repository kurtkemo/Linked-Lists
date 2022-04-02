
/**
 * Created constructor for Highscore class with name and score instance
 * variables.
 *
 * @author (Kurt Johnson)
 * @version (2/8/2020)
 */
public class HighScore
{
    private String theName;
    private int theScore;

    public HighScore(String name, int score)
    {
        this.theName = name;
        this.theScore = score;
    }

    public String getName()
    {
        return theName;
    }

    public int getScore()
    {
        return theScore;
    }

    public String toString()
    {
        return "Name: " + theName + " Score: " + theScore;
    }
}
