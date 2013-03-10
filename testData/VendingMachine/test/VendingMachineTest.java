
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class VendingMachineTest {

    @Test
    /* The test for the path initialize addChocs addCoinLessThanNinty coin addChocs getChocs addCoinLessThanNinty coin getChocs addCoinLessThanNinty coin coin getChocs addChocs none  */ 
    public void test0(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);
        int c = 25;

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinTwoValuesLessThanNinty for the element coin ***/
        vm.coin(c);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addChocs addCoinAtLeastNinty addChocs getChocs addCoinAtLeastNinty getChocs addChocs addCoinAtLeastNinty getChocs addCoinLessThanNinty coin getChocs addChocs addCoinAtLeastNinty getChocs addCoinLessThanNinty addChocs coin getChocs addCoinAtLeastNinty getChocs addCoinLessThanNinty coin addChocs getChocs addChocs addCoinLessThanNinty addChocs coin getChocs addCoinLessThanNinty addChocs coin getChocs addCoinAtLeastNinty getChocs addCoinLessThanNinty addChocs addChocs coin getChocs addCoinAtLeastNinty getChocs addCoinLessThanNinty addChocs coin getChocs addCoinAtLeastNinty addChocs getChocs addCoinLessThanNinty addChocs addChocs coin getChocs none  */ 
    public void test1(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addChocs addChocs none  */ 
    public void test2(){
        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty addChocs addChocs coin coin getChocs none  */ 
    public void test3(){
        int c = 10;
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinTwoValuesLessThanNinty for the element coin ***/
        vm.coin(c);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty coin coin addChocs getChocs addChocs none  */ 
    public void test4(){
        int c = 25;
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinTwoValuesLessThanNinty for the element coin ***/
        vm.coin(c);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs addChocs getChocs addChocs none  */ 
    public void test5(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty coin addChocs getChocs addCoinLessThanNinty addChocs coin getChocs addCoinAtLeastNinty addChocs getChocs addChocs addCoinLessThanNinty coin getChocs addChocs addCoinAtLeastNinty getChocs addChocs addCoinAtLeastNinty getChocs none  */ 
    public void test6(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize none  */ 
    public void test7(){
        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs getChocs addCoinAtLeastNinty getChocs addCoinAtLeastNinty addChocs getChocs addCoinLessThanNinty coin addChocs getChocs addChocs addCoinLessThanNinty coin getChocs addCoinLessThanNinty addChocs coin getChocs addChocs addChocs addCoinLessThanNinty coin getChocs addCoinAtLeastNinty getChocs addCoinAtLeastNinty addChocs getChocs addChocs none  */ 
    public void test8(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addChocs addCoinAtLeastNinty getChocs addChocs none  */ 
    public void test9(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addChocs none  */ 
    public void test10(){
        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs getChocs addCoinAtLeastNinty addChocs getChocs addChocs none  */ 
    public void test11(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addChocs addChocs addCoinAtLeastNinty getChocs addCoinAtLeastNinty getChocs none  */ 
    public void test12(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs getChocs addChocs addCoinLessThanNinty coin getChocs none  */ 
    public void test13(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty addChocs addChocs coin getChocs addChocs addCoinLessThanNinty coin getChocs none  */ 
    public void test14(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty coin addChocs getChocs addCoinLessThanNinty coin coin addChocs getChocs none  */ 
    public void test15(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);
        int c = 10;

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinTwoValuesLessThanNinty for the element coin ***/
        vm.coin(c);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty addChocs coin getChocs addChocs addCoinLessThanNinty coin getChocs addChocs none  */ 
    public void test16(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addChocs addCoinLessThanNinty coin getChocs addChocs none  */ 
    public void test17(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addChocs addChocs none  */ 
    public void test18(){
        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty addChocs coin getChocs addCoinLessThanNinty coin addChocs coin getChocs none  */ 
    public void test19(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);
        int c = 25;

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinTwoValuesLessThanNinty for the element coin ***/
        vm.coin(c);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs addChocs getChocs addCoinLessThanNinty coin addChocs getChocs none  */ 
    public void test20(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty coin addChocs getChocs addChocs none  */ 
    public void test21(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty addChocs coin getChocs addChocs none  */ 
    public void test22(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs getChocs none  */ 
    public void test23(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addChocs addChocs addCoinLessThanNinty coin getChocs none  */ 
    public void test24(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addChocs addCoinLessThanNinty addChocs coin getChocs none  */ 
    public void test25(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addChocs addChocs addCoinAtLeastNinty getChocs addCoinAtLeastNinty getChocs addCoinAtLeastNinty addChocs getChocs addChocs none  */ 
    public void test26(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty addChocs coin getChocs addChocs addCoinAtLeastNinty getChocs addCoinLessThanNinty coin getChocs addCoinLessThanNinty coin addChocs getChocs addChocs addChocs none  */ 
    public void test27(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs addChocs getChocs addChocs addCoinLessThanNinty coin getChocs addCoinAtLeastNinty getChocs none  */ 
    public void test28(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty addChocs coin getChocs addChocs addCoinLessThanNinty coin getChocs addCoinAtLeastNinty getChocs addCoinLessThanNinty addChocs coin getChocs addCoinLessThanNinty addChocs coin getChocs addChocs addChocs addCoinAtLeastNinty getChocs addCoinAtLeastNinty getChocs addCoinLessThanNinty coin addChocs getChocs addChocs addChocs addCoinAtLeastNinty getChocs addCoinLessThanNinty coin getChocs none  */ 
    public void test29(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty coin addChocs getChocs addChocs addCoinLessThanNinty coin getChocs addCoinLessThanNinty coin getChocs none  */ 
    public void test30(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs getChocs addChocs none  */ 
    public void test31(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs getChocs addChocs addCoinAtLeastNinty getChocs none  */ 
    public void test32(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs addChocs getChocs none  */ 
    public void test33(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty addChocs coin getChocs addChocs addChocs none  */ 
    public void test34(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addChocs addChocs addCoinAtLeastNinty getChocs addCoinLessThanNinty coin getChocs addCoinAtLeastNinty addChocs getChocs addChocs none  */ 
    public void test35(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty addChocs coin getChocs none  */ 
    public void test36(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty coin addChocs getChocs none  */ 
    public void test37(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty coin addChocs getChocs addChocs addCoinAtLeastNinty getChocs addCoinAtLeastNinty getChocs addCoinLessThanNinty addChocs addChocs coin coin getChocs none  */ 
    public void test38(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);
        int c = 25;

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinTwoValuesLessThanNinty for the element coin ***/
        vm.coin(c);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addChocs addChocs addCoinLessThanNinty coin getChocs addCoinAtLeastNinty getChocs addCoinLessThanNinty coin addChocs getChocs addChocs none  */ 
    public void test39(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addChocs addChocs addCoinLessThanNinty coin getChocs addCoinLessThanNinty coin getChocs addCoinAtLeastNinty addChocs getChocs addChocs none  */ 
    public void test40(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty coin addChocs getChocs addChocs addChocs addCoinLessThanNinty coin getChocs none  */ 
    public void test41(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty addChocs addChocs coin getChocs none  */ 
    public void test42(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs addChocs getChocs addCoinLessThanNinty addChocs coin getChocs none  */ 
    public void test43(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty addChocs addChocs coin getChocs addCoinAtLeastNinty getChocs addChocs none  */ 
    public void test44(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty addChocs coin getChocs addChocs none  */ 
    public void test45(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs addChocs getChocs addChocs none  */ 
    public void test46(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty addChocs addChocs coin getChocs addCoinAtLeastNinty getChocs none  */ 
    public void test47(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty addChocs addChocs coin getChocs addCoinAtLeastNinty getChocs addCoinAtLeastNinty addChocs getChocs addChocs none  */ 
    public void test48(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs getChocs addCoinLessThanNinty addChocs coin getChocs none  */ 
    public void test49(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty coin addChocs addChocs getChocs none  */ 
    public void test50(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty addChocs coin addChocs getChocs none  */ 
    public void test51(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty coin addChocs getChocs addChocs none  */ 
    public void test52(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty coin addChocs addChocs getChocs addCoinLessThanNinty addChocs coin getChocs none  */ 
    public void test53(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty coin addChocs addChocs getChocs addChocs addCoinLessThanNinty coin getChocs none  */ 
    public void test54(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addChocs addChocs addCoinLessThanNinty coin getChocs addCoinLessThanNinty coin getChocs addCoinLessThanNinty coin addChocs getChocs addChocs none  */ 
    public void test55(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getNineChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        vm.getChoc(sb);
        
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty coin addChocs addChocs getChocs addChocs none  */ 
    public void test56(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty addChocs coin addChocs getChocs addChocs none  */ 
    public void test57(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty addChocs addChocs coin getChocs addChocs none  */ 
    public void test58(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty addChocs coin addChocs getChocs addChocs addCoinLessThanNinty coin getChocs none  */ 
    public void test59(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs getChocs addCoinLessThanNinty addChocs addChocs coin getChocs addChocs none  */ 
    public void test60(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addTenChocolates for the element addChocs ***/
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

}
