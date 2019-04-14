package mooc.vandy.java4android.calculator.logic;

/**
 * This abstract class is used to perform all
 * of the calculator functions for the all
 * of the operations.  It is the base class
 * that is used by Add, Subtract Multiply and Divide
 */

public abstract class CalcOps {

    /**
     * Arguments for math operations
     */
    protected int argOne = 0;
    protected int argTwo = 0;
    protected int operation = 0;

    /**
     * Constants for math operations
     */
    final private int ADD = 1;
    final private int SUBTRACT = 2;
    final private int MULTIPLY = 3;
    final private int QUOTIENT = 4;
    final private int REMAINDER = 5;

    public  String calcOp(int a1, int a2, int op){
        if(op == ADD){
            return Integer.toString(a1 + a2);
        } else if(op == SUBTRACT){
            return Integer.toString(a1 - a2);
        } else if(op == MULTIPLY){
            return Integer.toString(a1 * a2);
        } else if(op == QUOTIENT) {
            return Integer.toString(a1 / a2);
        } else if(op == REMAINDER) {
            return Integer.toString(a1 % a2);
        } else {
            return "";
        }
    }
}
