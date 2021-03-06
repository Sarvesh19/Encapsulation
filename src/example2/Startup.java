package example2;
import java.util.Scanner;
/**
 * This example fixes the problems in example1 and follows good encapsulation.
 * Notice the properties are declared private and most methods are also private.
 * Only a small number of methods are public, hiding the private helper methods.
 * This makes the class easier to use. Finally, method arguments are tested
 * for validity before values are copied into properties.
 *
 * @author jlombardo
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cake cake = new Cake();
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter Quantity for bake :");
        int quantity  = sc.nextInt();
        // Simple now -- only one method to understand. Other methods are
        // hidden away (encapsulated) by this method.
        cake.make(quantity);
    }

}
