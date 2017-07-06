public class Operations {

    /**
     * The addition function.
     * @param x The first operand
     * @param y The second operand
     * @return the sum of x and y
     */
    public static int add(int x, int y) {
        return x + y;
    }

    /**
     * The subtraction function
     * @param x The first operand
     * @param y The second operand
     * @return y taken from x
     */
    public static int subtract(int x, int y) {
        return x - y;
    }
    

    /**
     * The multiplication function
     * @param x The first operand
     * @param y The second operand
     * @return x times y
     */
    public static int multiply(int x, int y) {
        return x * y;
    }
    
    public static double divide(int x, int y) {
    	if (y!=0){
    		return x/y;
    	} 
    	else {
    		System.out.println("Division by 0 is BAAAAD !!! ");
    		return 0;
    	}
        
    }
    
}
