package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */

    /**
     * Constants for calculator operations
     */
    final private int ADD = 1;
    final private int SUBTRACT = 2;
    final private int MULTIPLY = 3;
    final private int DIVIDE = 4;

    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here
        if(operation == ADD){
            Add a = new Add(argumentOne, argumentTwo, operation);
            mOut.print(a.toString());

        } else if(operation == SUBTRACT){
            Subtract s = new Subtract(argumentOne, argumentTwo, operation);
            mOut.print(s.toString());

        } else if(operation == MULTIPLY) {
            Multiply m = new Multiply(argumentOne, argumentTwo, operation);
            mOut.print(m.toString());

        } else if (operation == DIVIDE){
            Divide d = new Divide(argumentOne, argumentTwo, operation);
            mOut.print(d.toString());
        } else { //Error
            mOut.print("Unknown Error");
        }
    }
}
