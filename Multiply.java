package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply extends CalcOps {
    // TODO -- start your code here

    public Multiply(int a1, int a2, int o){
        this.argOne = a1;
        this.argTwo = a2;
        this.operation = o;
    }
    public String toString(){
        return(calcOp(argOne, argTwo, operation));
    }
}
