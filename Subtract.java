package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract extends CalcOps {
    // TODO -- start your code here

    public Subtract(int a1, int a2, int o){
        this.argOne = a1;
        this.argTwo = a2;
        this.operation = o;
    }
    public String toString(){
        return(calcOp(argOne, argTwo, operation));
    }
}
