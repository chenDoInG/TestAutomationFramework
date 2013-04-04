
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;


public class VendingMachineTest {

    @Test
    /* The test for the path Initial initialize Credit0Stock0  Final  */ 
    public void test0(){
        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        assertEquals(true, vm.getCredit() == 0);
    }

    @Test
    /* The test for the path Initial initialize Credit0Stock0 addChocs Credit0Stock1 addChocs Credit0Stock1To10 addChocs Credit0Stock1To10  Final  */ 
    public void test1(){
        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        assertEquals(true, vm.getStock().size() > 1 && vm.getStock().size() < 10);
    }

    @Test
    /* The test for the path Initial initialize Credit0Stock0 addCoinAtLeastNinty Credit90Stock0 addChocs Credit90Stock1 getChocs Credit0Stock0 addChocs Credit0Stock1  Final  */ 
    public void test2(){
        StringBuffer sb = new StringBuffer("MM");

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        assertEquals(true, vm.getStock().size() == 1);
    }

    @Test
    /* The test for the path Initial initialize Credit0Stock0 addChocs Credit0Stock1 addCoinAtLeastNinty Credit90Stock1 getChocs Credit0Stock0 addChocs Credit0Stock1  Final  */ 
    public void test3(){
        StringBuffer sb = new StringBuffer("MM");

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
        assertEquals(true, vm.getStock().size() == 1);
    }

    @Test
    /* The test for the path Initial initialize Credit0Stock0 addChocs Credit0Stock1 addChocs Credit0Stock1To10 addCoinAtLeastNinty Credit90Stock1To10 getChocs Credit0Stock1  Final  */ 
    public void test4(){
        StringBuffer sb = new StringBuffer("MM");

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        assertEquals(true, vm.getStock().size() == 1);
    }

    @Test
    /* The test for the path Initial initialize Credit0Stock0 addCoinAtLeastNinty Credit90Stock0 addChocs Credit90Stock1 addChocs Credit90Stock1To10 addChocs Credit90Stock1To10 getChocs Credit0Stock1  Final  */ 
    public void test5(){
        StringBuffer sb = new StringBuffer("MM");

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getTwoChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.coin(100);
        vm.getChoc(sb);
        
        
        
        assertEquals(true, vm.getStock().size() == 1);
    }

    @Test
    /* The test for the path Initial initialize Credit0Stock0 addChocs Credit0Stock1 addCoinLessThanNinty Credit0To90Stock1 coin Credit90Stock1 getChocs Credit0Stock0 addChocs Credit0Stock1  Final  */ 
    public void test6(){
        StringBuffer sb = new StringBuffer("MM");

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
        assertEquals(true, vm.getStock().size() == 1);
    }

    @Test
    /* The test for the path Initial initialize Credit0Stock0 addChocs Credit0Stock1 addChocs Credit0Stock1To10 addCoinLessThanNinty Credit0To90Stock1To10 coin Credit90Stock1To10 getChocs Credit0Stock1  Final  */ 
    public void test7(){
        StringBuffer sb = new StringBuffer("MM");

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
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
        assertEquals(true, vm.getStock().size() == 1);
    }

    @Test
    /* The test for the path Initial initialize Credit0Stock0 addCoinLessThanNinty Credit0To90Stock0 coin Credit0To90Stock0 coin Credit90Stock0 addChocs Credit90Stock1 getChocs Credit0Stock0 addChocs Credit0Stock1  Final  */ 
    public void test8(){
        StringBuffer sb = new StringBuffer("MM");

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinFifty for the element coin ***/
        vm.coin(25);
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
        assertEquals(true, vm.getStock().size() == 1);
    }

    @Test
    /* The test for the path Initial initialize Credit0Stock0 addCoinLessThanNinty Credit0To90Stock0 addChocs Credit0To90Stock1 coin Credit0To90Stock1 coin Credit90Stock1 getChocs Credit0Stock0 addChocs Credit0Stock1  Final  */ 
    public void test9(){
        StringBuffer sb = new StringBuffer("MM");

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinFifty for the element coin ***/
        vm.coin(25);
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
        assertEquals(true, vm.getStock().size() == 1);
    }

    @Test
    /* The test for the path Initial initialize Credit0Stock0 addCoinLessThanNinty Credit0To90Stock0 addChocs Credit0To90Stock1 addChocs Credit0To90Stock1To10 coin Credit0To90Stock1To10 coin Credit90Stock1To10 getChocs Credit0Stock1  Final  */ 
    public void test10(){
        StringBuffer sb = new StringBuffer("MM");

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinFifty for the element coin ***/
        vm.coin(25);
        vm.coin(25);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        assertEquals(true, vm.getStock().size() == 1);
    }

}
