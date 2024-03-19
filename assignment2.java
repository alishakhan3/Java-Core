public class assignment2 {

    public static int divison(int x, int y) {
        if (y == 0) 
        {
            throw new ArithmeticException("Division by zero");
        }
        return x/y;
    }
    public static void main(String[] args) {
        try 
        {
            int x=5;
            int y=0;
            int r = divison(x,y);
            System.out.println("Result= " + r);
        } 
        catch (ArithmeticException e) {
            System.out.println("Do not divide by zero");
        }
    }
}
