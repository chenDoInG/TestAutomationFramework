
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;


public class VendingMachineTest {

    @Test
    /* The test for the path initialize addChocs addCoinAtLeastNinty getChocs addChocs none  */ 
    public void test0(){
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
    /* The test for the path initialize addCoinLessThanNinty coin addChocs coin addChocs coin coin getChocs addChocs addCoinLessThanNinty coin getChocs none  */ 
    public void test1(){
        int c = 25;
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinTwoValuesLessThanNinty for the element coin ***/
        vm.coin(c);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinTwoValuesLessThanNinty for the element coin ***/
        vm.coin(c);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinTwoValuesLessThanNinty for the element coin ***/
        vm.coin(c);
        /*** test code of coinTwoValuesLessThanNinty for the element coin ***/
        vm.coin(c);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinTwoValuesLessThanNinty for the element coin ***/
        vm.coin(c);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addChocs addCoinLessThanNinty coin addChocs addChocs getChocs none  */ 
    public void test2(){
        int c = 10;
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinTwoValuesLessThanNinty for the element coin ***/
        vm.coin(c);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs getChocs addCoinLessThanNinty coin addChocs getChocs addChocs none  */ 
    public void test3(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);
        int c = 10;

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
        /*** test code of coinTwoValuesLessThanNinty for the element coin ***/
        vm.coin(c);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addChocs addChocs addCoinAtLeastNinty getChocs none  */ 
    public void test4(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

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
    /* The test for the path initialize addChocs addChocs none  */ 
    public void test5(){
        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addChocs none  */ 
    public void test6(){
        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
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
    /* The test for the path initialize addCoinAtLeastNinty addChocs getChocs addChocs none  */ 
    public void test8(){
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
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

}
