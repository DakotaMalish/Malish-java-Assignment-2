//******************************************************
//*** Program 1 Inches converter 
//*** Dakota Malish dm061
//******************************************************
//*** 
//******************************************************
//*** Program Started: 06/19/18
//******************************************************
//*** 
//******************************************************
package malish.java.progect.pkg2;
import java.util.*;
/**
 *
 * @author RedPanda13
 */
public class MalishJavaProgect2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double in = 0;
        double ft = 12;
        double fl = 660;
        double mi = 5280;
        
        System.out.println("Enter inches: ");
        Scanner userInput = new Scanner(System.in);
        in = userInput.nextInt();
        
        if (in >= 12)
        {
            System.out.println("Inches: "+in+" Equals Feet: "+(in/ft));
        }
        else if (in >= 660)
        {
            System.out.println("Inches: "+in+" Equals Furlongs: "+(in/fl));
        }
        else if(in >= 5280)
        {
            System.out.println("Inches: "+in+" Equals Miles: "+(in/mi));
        }
    }
}
