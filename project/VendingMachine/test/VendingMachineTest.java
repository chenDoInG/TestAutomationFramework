
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;


public class VendingMachineTest {

    @Test
    /* The test for the path Initial initialize State1 none Final  */ 
    public void test0(){
        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path Initial initialize State1 addChocs State4 addChocs State7 addChocs State7 none Final  */ 
    public void test1(){
        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path Initial initialize State1 addCoinAtLeastNinty State3 addChocs State6 getChocs State1 addChocs State4 none Final  */ 
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
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path Initial initialize State1 addChocs State4 addCoinAtLeastNinty State6 getChocs State1 addChocs State4 none Final  */ 
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
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path Initial initialize State1 addChocs State4 addChocs State7 addCoinAtLeastNinty State9 getChocs State4 none Final  */ 
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
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path Initial initialize State1 addCoinAtLeastNinty State3 addChocs State6 addChocs State9 addChocs State9 getChocs State4 none Final  */ 
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
        
        
        
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path Initial initialize State1 addChocs State4 addCoinLessThanNinty State5 coin State6 getChocs State1 addChocs State4 none Final  */ 
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
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path Initial initialize State1 addChocs State4 addChocs State7 addCoinLessThanNinty State8 coin State9 getChocs State4 none Final  */ 
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
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path Initial initialize State1 addCoinLessThanNinty State2 coin State2 coin State3 addChocs State6 getChocs State1 addChocs State4 none Final  */ 
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
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path Initial initialize State1 addCoinLessThanNinty State2 addChocs State5 coin State5 coin State6 getChocs State1 addChocs State4 none Final  */ 
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
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path Initial initialize State1 addCoinLessThanNinty State2 addChocs State5 addChocs State8 coin State8 coin State9 getChocs State4 none Final  */ 
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
        /*** test code of doingNothing for the element none ***/
        
    }

}
