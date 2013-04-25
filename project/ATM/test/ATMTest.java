
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;


public class ATMTest {

    @Test
    /* The test for the path Initial0 initialize Idle authenticate AuthenticationValid withdraw Withdrawn  FinalState0  */ 
    public void test0(){
        /*** test code of initializeMapping for the element initialize ***/
        boolean userAuthenticated = false; // user is not authenticated to start
        int currentAccountNumber = 0; // no current account number to start
        String input = "1\n\n10";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Screen screen = new Screen(); // create screen
        Keypad keypad = new Keypad(); // create keypad
        CashDispenser cashDispenser = new CashDispenser(); // create cash dispenser
        DepositSlot depositSlot = new DepositSlot(); // create deposit slot
        BankDatabase bankDatabase = new BankDatabase(); // create acct info database
        Transaction currentTransaction = null;
        /*** test code of authenticateMapping for the element authenticate ***/
        userAuthenticated = bankDatabase.authenticateUser( 12345, 54321 );
        /*** test code of withdrawMapping for the element withdraw ***/
        currentTransaction = new Deposit( 12345, screen, bankDatabase, keypad, depositSlot );
        currentTransaction.execute();
    }

    @Test
    /* The test for the path Initial0 initialize Idle authenticate AuthenticationNotValid  Idle authenticate AuthenticationNotValid  FinalState0  */ 
    public void test1(){
        /*** test code of initializeMapping for the element initialize ***/
        boolean userAuthenticated = false; // user is not authenticated to start
        int currentAccountNumber = 0; // no current account number to start
        String input = "1\n\n10";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Screen screen = new Screen(); // create screen
        Keypad keypad = new Keypad(); // create keypad
        CashDispenser cashDispenser = new CashDispenser(); // create cash dispenser
        DepositSlot depositSlot = new DepositSlot(); // create deposit slot
        BankDatabase bankDatabase = new BankDatabase(); // create acct info database
        Transaction currentTransaction = null;
        /*** test code of notAuthenticateMapping for the element authenticate ***/
        userAuthenticated = bankDatabase.authenticateUser( 12345, 54320 );
        /*** test code of notAuthenticateMapping for the element authenticate ***/
        userAuthenticated = bankDatabase.authenticateUser( 12345, 54320 );
        assertEquals(true, userAuthenticated == false);
    }

    @Test
    /* The test for the path Initial0 initialize Idle authenticate AuthenticationValid deposit Deposited  Idle authenticate AuthenticationNotValid  FinalState0  */ 
    public void test2(){
        /*** test code of initializeMapping for the element initialize ***/
        boolean userAuthenticated = false; // user is not authenticated to start
        int currentAccountNumber = 0; // no current account number to start
        String input = "1\n\n10";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Screen screen = new Screen(); // create screen
        Keypad keypad = new Keypad(); // create keypad
        CashDispenser cashDispenser = new CashDispenser(); // create cash dispenser
        DepositSlot depositSlot = new DepositSlot(); // create deposit slot
        BankDatabase bankDatabase = new BankDatabase(); // create acct info database
        Transaction currentTransaction = null;
        /*** test code of authenticateMapping for the element authenticate ***/
        userAuthenticated = bankDatabase.authenticateUser( 12345, 54321 );
        /*** test code of depositMapping for the element deposit ***/
        currentTransaction = new Deposit( 12345, screen, bankDatabase, keypad, depositSlot );
        currentTransaction.execute();
        /*** test code of notAuthenticateMapping for the element authenticate ***/
        userAuthenticated = bankDatabase.authenticateUser( 12345, 54320 );
        assertEquals(true, userAuthenticated == false);
    }

    @Test
    /* The test for the path Initial0 initialize Idle authenticate AuthenticationValid Inquire BalanceInquired  Idle authenticate AuthenticationNotValid  FinalState0  */ 
    public void test3(){
        /*** test code of initializeMapping for the element initialize ***/
        boolean userAuthenticated = false; // user is not authenticated to start
        int currentAccountNumber = 0; // no current account number to start
        String input = "1\n\n10";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Screen screen = new Screen(); // create screen
        Keypad keypad = new Keypad(); // create keypad
        CashDispenser cashDispenser = new CashDispenser(); // create cash dispenser
        DepositSlot depositSlot = new DepositSlot(); // create deposit slot
        BankDatabase bankDatabase = new BankDatabase(); // create acct info database
        Transaction currentTransaction = null;
        /*** test code of authenticateMapping for the element authenticate ***/
        userAuthenticated = bankDatabase.authenticateUser( 12345, 54321 );
        /*** test code of inquireMapping for the element Inquire ***/
        currentTransaction = new BalanceInquiry( 12345, screen, bankDatabase );
        currentTransaction.execute();
        /*** test code of notAuthenticateMapping for the element authenticate ***/
        userAuthenticated = bankDatabase.authenticateUser( 12345, 54320 );
        assertEquals(true, userAuthenticated == false);
    }

    @Test
    /* The test for the path Initial0 initialize Idle authenticate AuthenticationValid withdraw Withdrawn  Idle authenticate AuthenticationNotValid  FinalState0  */ 
    public void test4(){
        /*** test code of initializeMapping for the element initialize ***/
        boolean userAuthenticated = false; // user is not authenticated to start
        int currentAccountNumber = 0; // no current account number to start
        String input = "1\n\n10";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Screen screen = new Screen(); // create screen
        Keypad keypad = new Keypad(); // create keypad
        CashDispenser cashDispenser = new CashDispenser(); // create cash dispenser
        DepositSlot depositSlot = new DepositSlot(); // create deposit slot
        BankDatabase bankDatabase = new BankDatabase(); // create acct info database
        Transaction currentTransaction = null;
        /*** test code of authenticateMapping for the element authenticate ***/
        userAuthenticated = bankDatabase.authenticateUser( 12345, 54321 );
        /*** test code of withdrawMapping for the element withdraw ***/
        currentTransaction = new Deposit( 12345, screen, bankDatabase, keypad, depositSlot );
        currentTransaction.execute();
        /*** test code of notAuthenticateMapping for the element authenticate ***/
        userAuthenticated = bankDatabase.authenticateUser( 12345, 54320 );
        assertEquals(true, userAuthenticated == false);
    }

}
