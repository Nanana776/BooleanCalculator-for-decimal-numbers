public class BooleanCalculator {

    public void and(int val1, int val2) {
        System.out.println(val1 & val2);
    }
  
    public void or(int val1, int val2) {
         System.out.println(val1 | val2);
    }
  
    public void xor(int val1, int val2) {
             System.out.println(val1 ^ val2);
    }
  
    public void not(int val1) {
             System.out.println(~val1);
    }
  
    public void nand(int val1, int val2) {
         System.out.println(~(val1 & val2));
    }
  
    public void nor(int val1, int val2) {
        System.out.println(~(val1 | val2));
    }
  
    public void xnor(int val1, int val2) {
        System.out.println(~(val1 ^ val2));
    }
  
    public void calculate(int val1, int val2, String operation) {
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
  
  