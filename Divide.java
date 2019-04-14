package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide extends CalcOps{
    // TODO -- start your code here


    public Divide(int a1, int a2, int o) {
        this.argOne = a1;
        this.argTwo = a2;
        this.operation = o;
    }

    public String toString(){
        if(this.argTwo!=0){
            String quo = calcOp(argOne, argTwo, operation); // QUOTIENT
            String remain = calcOp(argOne, argTwo, operation+1); // REMAINDER
            return(quo+" R "+remain);
        } else {
            return ("Error: Division by Zero 'Value Two' ");
        }
    }

}
