// Chloe Todd
// Sin 9

public class Sin9CatchExceptions {

    public static void main(String[] args) {
        int length = 0;
        try {
            String str = null;
            length = str.length(); // throws NullPointerException
        } catch (NullPointerException e /*DO NOT write 'Exception e'*/) {
            //Using specific exceptions is better than general exceptions.
            System.err.println("A NullPointerException occurred: " + e.getMessage());
        }
        System.out.println(length);
    }
}
