
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;


public class VendingMachineTest {

    @Test
    /* The test for the path Initial initialize Credit0Stock0 addChocs Credit0Stock1 addChocs Credit0Stock1To10 addChocs Credit0Stock1To10 coin Credit90Stock1To10 getChocs Credit0Stock1  Final  */ 
    public void test0(){
        StringBuffer sb = new StringBuffer("MM");

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getTwoChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.coin(100);
        vm.getChoc(sb);
        assertEquals(true, vm.getCredit() == 0);
    }

    @Test
    /* The test for the path Initial initialize Credit0Stock0 coin Credit0To90Stock0 coin Credit0To90Stock0 addChocs Credit0To90Stock1 coin Credit0To90Stock1 addChocs Credit0To90Stock1To10 coin Credit0To90Stock1To10 coin Credit90Stock1To10 getChocs Credit0Stock1 addChocs Credit0Stock1To10 coin Credit0To90Stock1To10 coin Credit90Stock1To10 getChocs Credit0Stock1  Final  */ 
    public void test1(){
        StringBuffer sb = new StringBuffer("MM");

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinTen for the element coin ***/
        vm.coin(10);
        /*** test code of coinTen for the element coin ***/
        vm.coin(10);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinTen for the element coin ***/
        vm.coin(10);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinTen for the element coin ***/
        vm.coin(10);
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
        /*** test code of coinTen for the element coin ***/
        vm.coin(10);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        assertEquals(true, vm.getCredit() == 0);
    }

    @Test
    /* The test for the path Initial initialize Credit0Stock0 coin Credit0To90Stock0 coin Credit90Stock0 addChocs Credit90Stock1 getChocs Credit0Stock0 addChocs Credit0Stock1 coin Credit0To90Stock1 coin Credit90Stock1 addChocs Credit90Stock1To10 addChocs Credit90Stock1To10 getChocs Credit0Stock1 coin Credit90Stock1 getChocs Credit0Stock0 addChocs Credit0Stock1  Final  */ 
    public void test2(){
        StringBuffer sb = new StringBuffer("MM");

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinTen for the element coin ***/
        vm.coin(10);
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
        /*** test code of coinTen for the element coin ***/
        vm.coin(10);
        /*** test code of coinOneDollarAndTen for the element coin ***/
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getTwoChocolates for the element getChocs ***/
        vm.getChoc(sb);
        vm.coin(100);
        vm.getChoc(sb);
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
        assertEquals(true, vm.getCredit() == 0);
    }

    @Test
    /* The test for the path Initial initialize Credit0Stock0 addChocs Credit0Stock1 addChocs Credit0Stock1To10  Final  */ 
    public void test3(){
        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        assertEquals(true, vm.getCredit() == 0);
    }

    @Test
    /* The test for the path Initial initialize Credit0Stock0 addChocs Credit0Stock1  Final  */ 
    public void test4(){
        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        assertEquals(true, vm.getCredit() == 0);
    }

    @Test
    /* The test for the path Initial initialize Credit0Stock0  Final  */ 
    public void test5(){
        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        assertEquals(true, vm.getStock().size() == 0);
    }

    @Test
    /* The test for the path Initial initialize Credit0Stock0 coin Credit90Stock0 addChocs Credit90Stock1 getChocs Credit0Stock0 addChocs Credit0Stock1  Final  */ 
    public void test6(){
        StringBuffer sb = new StringBuffer("MM");

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
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
        assertEquals(true, vm.getCredit() == 0);
    }

}
