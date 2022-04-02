
/**
 * Linked list class with insert and delete methods. Inserted based on score sorted largest to
 * smallest. Delete removes the last node of the list if there are 10 already in the list. The
 * method can be used to show top 5 or top 3.
 * 
 * @author (Kurt Johnson)
 * @version (2/8/2020)
 */
import java.io.*;
import java.util.*;
public class LLHighScore
{
    private Node list;
    

    public LLHighScore()
    {
       list = null;
    }

    public void insert(HighScore s)
    {
        Node temp = new Node(s);
        Node current = list;

        if(list == null || current.data.getScore() <= temp.data.getScore())
        {
            temp.next = list;
            list = temp;
            return;
        }
        while(current.next != null || list != null)
        {
            if(current.next == null && current.data.getScore() >= temp.data.getScore())
            {
                temp.next = null;
                current.next = temp;
                return;
            }
            else if(current.data.getScore() >= temp.data.getScore() 
            && current.next.data.getScore() <= temp.data.getScore())
            {
                temp.next = current.next;
                current.next = temp;
                return;
            }
            current = current.next;
        }
    }

    public void deletion(int position)
    {
        Node current = list;
        int count = 0;
        if(current == null)
        {
            return;
        }
        while(current.next != null)
        {
            count++;
            if(count == position-1)
            {
                current.next = null;
                return;
            }
            current = current.next;
        }
    }

    public String toString()
    {
        String result = "";
        Node current = list;
        while(current != null)
        {
            result += current.data + "\n";
            current = current.next;
        }
        return result;
    }

    private class Node
    {
        public HighScore data;
        public Node next;

        public Node(HighScore s)
        {
            data = s;
            next = null;
        }
    }
}
