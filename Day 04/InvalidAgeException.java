
public class InvalidAgeException extends Exception {
    InvalidAgeException() {
        super("Invalid Age");
    }
}


/**
 * hi
 */
class hi {
    public static void main(String[] args) {
        int age = 5;
        try {
            if (age < 18) {
                throw new InvalidAgeException();
            } else {
                System.out.println("Eligible for voting");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}