/**
 * Use an array to print a board that is at least five elements by 
 * five elements.
 *
 * @author (Steve Kong)
 * @version (1.0)
 * 
 */

import java.util.Scanner;

public class PrintABoard
{
    public static void main(String[] orgs)
    {
        int length;
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many friends name that you are going to enter");
        length = input.nextInt();
        
        String[] names = new String[length];
        
        for(int counter = 0; counter < length; counter++)
        {
            System.out.println("Enter the name of friend "+(counter+1));
            names[counter] = input.next();
        }
        
        input.close();
        
        System.out.println("Your friends are");
        for(int counter = 0; counter < length; counter++)
        {
            System.out.println(names[counter]);
        }
        
    }
}
