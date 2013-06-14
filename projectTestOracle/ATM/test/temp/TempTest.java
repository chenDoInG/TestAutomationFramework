
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;


public class TempTest {

    public boolean test(){
        boolean userAuthenticated = false; // user is not authenticated to start
        int currentAccountNumber = 0; // no current account number to start
        String input = "1\n\n3\n3\n10";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Screen screen = new Screen(); // create screen
        Keypad keypad = new Keypad(); // create keypad
        CashDispenser cashDispenser = new CashDispenser(); // create cash dispenser
        DepositSlot depositSlot = new DepositSlot(); // create deposit slot
        BankDatabase bankDatabase = new BankDatabase(); // create acct info database
        Transaction currentTransaction = null;
        userAuthenticated = bankDatabase.authenticateUser( 12345, 54321 );
        currentTransaction = new Deposit( 12345, screen, bankDatabase, keypad, depositSlot );
        currentTransaction.execute();
        userAuthenticated = bankDatabase.authenticateUser( 12345, 54320 );
        return userAuthenticated == false;
    }
}
