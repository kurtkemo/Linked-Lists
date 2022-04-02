
/**
 * Main method that calls insert method from llHighScore. Highscore object including 
 * name and score are placed into linked list one at a time based on user input. Will quit if user 
 * types '0' otherwise it will keep asking. After inputting 10 names the 11th will if larger than
 * the final node will be put into list and last node deleted.
 *
 * @author (Kurt Johnson)
 * @version (2/8/2020)
 */

import java.io.*;
import java.util.*;
public class TestList
{
    public static void main(String args[]) throws IOException
    {
        LLHighScore list1 = new LLHighScore();
        Scanner scan = new Scanner(System.in);
                
        while(true)
        {
            System.out.println("Enter name or type '0' to quit: ");
            String name = scan.next();
            if("0".equals(name))
            {
                break;
            }
            else
            {
                list1.deletion(10);
                System.out.println("Enter the score:");
                int score = scan.nextInt();

                list1.insert(new HighScore(name, score));

                System.out.println("\nHigh scores:");
                System.out.println(list1.toString());
            }
        }
    }
}

