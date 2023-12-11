package arrlist;

import java.io.Console;

public class Test11_02 {
	
	// Method to mask the password while printing
    private static void maskPassword(char[] passwordArray) {
        System.out.print("Masked Password: ");
        for (int i = 0; i < passwordArray.length; i++) {
            System.out.print('*');
        }
    }
	
	// Method to clear the password from memory
    private static void clearPassword(char[] passwordArray) {
        for (int i = 0; i < passwordArray.length; i++) {
            passwordArray[i] = ' ';
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console console = System.console();

        if (console == null) {
            System.out.println("Console is not available. Exiting...");
            System.exit(1);
        }

        char[] passwordArray = console.readPassword("Enter your password: ");
        String password = new String(passwordArray);

        // Mask the password while printing
        maskPassword(passwordArray);

        // Do something with the masked password (e.g., validate or process it)
        System.out.println("\nPassword entered: " + password);

        // Clear the password from memory
        clearPassword(passwordArray);
	}

}
