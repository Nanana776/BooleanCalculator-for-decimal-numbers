public class BooleanCalculator {

    private long toLongBits(double val) {
        return (long) val; 
    }

    private double toDouble(long bits) {
        return (double) bits; 
    }

    public void and(double val1, double val2) {
        long bits1 = toLongBits(val1);
        long bits2 = toLongBits(val2);
        long result = bits1 & bits2;
        System.out.println(toDouble(result));  
    }

    public void or(double val1, double val2) {
        long bits1 = toLongBits(val1);
        long bits2 = toLongBits(val2);
        long result = bits1 | bits2;
        System.out.println(toDouble(result)); 
    }

    public void xor(double val1, double val2) {
        long bits1 = toLongBits(val1);
        long bits2 = toLongBits(val2);
        long result = bits1 ^ bits2;
        System.out.println(toDouble(result)); 
    }

    public void not(double val1) {
        long bits = toLongBits(val1);
        long result = ~bits;
        System.out.println(toDouble(result));  
    }

    public void nand(double val1, double val2) {
        long bits1 = toLongBits(val1);
        long bits2 = toLongBits(val2);
        long result = ~(bits1 & bits2); 
        System.out.println(toDouble(result));  
    }

    public void nor(double val1, double val2) {
        long bits1 = toLongBits(val1);
        long bits2 = toLongBits(val2);
        long result = ~(bits1 | bits2); 
        System.out.println(toDouble(result)); 
    }

    public void xnor(double val1, double val2) {
        long bits1 = toLongBits(val1);
        long bits2 = toLongBits(val2);
        long result = ~(bits1 ^ bits2);  
        System.out.println(toDouble(result));  
    }

    public void calculate(double val1, double val2, String operation) {
        switch (operation.toLowerCase()) {
            case "and":
                and(val1, val2);
                break;
            case "or":
                or(val1, val2);
                break;
            case "xor":
                xor(val1, val2);
                break;
            case "not":
                not(val1);
                break;
            case "nand":
                nand(val1, val2);
                break;
            case "nor":
                nor(val1, val2);
                break;
            case "xnor":
                xnor(val1, val2);
                break;
            default:
                System.out.println("Can't execute: " + operation);
        }
    }
}
