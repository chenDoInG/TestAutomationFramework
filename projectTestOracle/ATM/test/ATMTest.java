
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;


public class ATMTest {

    @Test
    /* The test for the path Initial0 initialize Idle authenticate AuthenticationNotValid  Idle authenticate AuthenticationNotValid  FinalState0  */ 
    public void test0(){
        /*** test code of initializeMapping for the element initialize ***/
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

        /*** test oracle level TO1  for initializeMapping***/        assertTrue(currentTransaction == null);
        assertTrue(currentAccountNumber == 0);
        assertEquals(1, keypad.getInput());
        /*** test code of notAuthenticateMapping for the element authenticate ***/
        userAuthenticated = bankDatabase.authenticateUser( 12345, 54320 );

        /*** test oracle level TO1  for notAuthenticateMapping***/        
        /*** test code of notAuthenticateMapping for the element authenticate ***/
        userAuthenticated = bankDatabase.authenticateUser( 12345, 54320 );

        /*** test oracle level TO1  for notAuthenticateMapping***/        
        assertEquals(true, userAuthenticated == false);
    }

    @Test
    /* The test for the path Initial0 initialize Idle authenticate AuthenticationValid withdraw Withdrawn  Idle authenticate AuthenticationNotValid  FinalState0  */ 
    public void test1(){
        /*** test code of initializeMapping for the element initialize ***/
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

        /*** test oracle level TO1  for initializeMapping***/        assertTrue(currentTransaction == null);
        assertTrue(currentAccountNumber == 0);
        assertEquals(1, keypad.getInput());
        /*** test code of authenticateMapping for the element authenticate ***/
        userAuthenticated = bankDatabase.authenticateUser( 12345, 54321 );

        /*** test oracle level TO1  for authenticateMapping***/        
        /*** test code of withdrawMapping for the element withdraw ***/
        currentTransaction = new Withdrawal( 12345, screen, bankDatabase, keypad, cashDispenser );
        currentTransaction.execute();

        /*** test oracle level TO1  for withdrawMapping***/        
        /*** test code of notAuthenticateMapping for the element authenticate ***/
        userAuthenticated = bankDatabase.authenticateUser( 12345, 54320 );

        /*** test oracle level TO1  for notAuthenticateMapping***/        
        assertEquals(true, userAuthenticated == false);
    }

    @Test
    /* The test for the path Initial0 initialize Idle authenticate AuthenticationValid Inquire BalanceInquired  Idle authenticate AuthenticationNotValid  FinalState0  */ 
    public void test2(){
        /*** test code of initializeMapping for the element initialize ***/
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

        /*** test oracle level TO1  for initializeMapping***/        assertTrue(currentTransaction == null);
        assertTrue(currentAccountNumber == 0);
        assertEquals(1, keypad.getInput());
        /*** test code of authenticateMapping for the element authenticate ***/
        userAuthenticated = bankDatabase.authenticateUser( 12345, 54321 );

        /*** test oracle level TO1  for authenticateMapping***/        
        /*** test code of inquireMapping for the element Inquire ***/
        currentTransaction = new BalanceInquiry( 12345, screen, bankDatabase );
        currentTransaction.execute();

        /*** test oracle level TO1  for inquireMapping***/        
        /*** test code of notAuthenticateMapping for the element authenticate ***/
        userAuthenticated = bankDatabase.authenticateUser( 12345, 54320 );

        /*** test oracle level TO1  for notAuthenticateMapping***/        
        assertEquals(true, userAuthenticated == false);
    }

    @Test
    /* The test for the path Initial0 initialize Idle authenticate AuthenticationValid deposit Deposited  Idle authenticate AuthenticationNotValid  FinalState0  */ 
    public void test3(){
        /*** test code of initializeMapping for the element initialize ***/
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

        /*** test oracle level TO1  for initializeMapping***/        assertTrue(currentTransaction == null);
        assertTrue(currentAccountNumber == 0);
        assertEquals(1, keypad.getInput());
        /*** test code of authenticateMapping for the element authenticate ***/
        userAuthenticated = bankDatabase.authenticateUser( 12345, 54321 );

        /*** test oracle level TO1  for authenticateMapping***/        
        /*** test code of depositMapping for the element deposit ***/
        currentTransaction = new Deposit( 12345, screen, bankDatabase, keypad, depositSlot );
        currentTransaction.execute();

        /*** test oracle level TO1  for depositMapping***/        
        /*** test code of notAuthenticateMapping for the element authenticate ***/
        userAuthenticated = bankDatabase.authenticateUser( 12345, 54320 );

        /*** test oracle level TO1  for notAuthenticateMapping***/        
        assertEquals(true, userAuthenticated == false);
    }

}
