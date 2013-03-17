
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class VendingMachineTest {

    @Test
    /* The test for the path initialize none  */ 
    public void test0(){
        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addChocs addChocs none  */ 
    public void test1(){
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
    /* The test for the path initialize addCoinAtLeastNinty addChocs getChocs none  */ 
    public void test3(){
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs addChocs getChocs none  */ 
    public void test4(){
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
    /* The test for the path initialize addChocs addCoinAtLeastNinty getChocs addChocs none  */ 
    public void test5(){
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
    /* The test for the path initialize addCoinAtLeastNinty addChocs addChocs getChocs addChocs none  */ 
    public void test6(){
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinOneDollar for the element addCoinAtLeastNinty ***/
        vm.coin(100);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
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
    public void test7(){
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
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty coin coin addChocs getChocs addChocs none  */ 
    public void test8(){
        10,25
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinTwoValuesLessThanNinty for the element coin ***/
        vm.coin(c);
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
    /* The test for the path initialize addChocs addCoinLessThanNinty coin getChocs addChocs none  */ 
    public void test9(){
        10,25
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
        /*** test code of coinTwoValuesLessThanNinty for the element coin ***/
        vm.coin(c);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of addChocolate for the element addChocs ***/
        vm.addChoc("MM");
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty addChocs coin coin getChocs addChocs none  */ 
    public void test10(){
        10,25
        StringBuffer sb = new StringBuffer(s);

        /*** test code of initializeVendingMachine for the element initialize ***/
        vendingMachine vm = new vendingMachine();
        /*** test code of coinQuarter for the element addCoinLessThanNinty ***/
        vm.coin(25);
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
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addChocs addChocs addCoinLessThanNinty coin getChocs none  */ 
    public void test11(){
        10,25
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
        /*** test code of coinTwoValuesLessThanNinty for the element coin ***/
        vm.coin(c);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty addChocs addChocs coin coin getChocs none  */ 
    public void test12(){
        10,25
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
        /*** test code of coinTwoValuesLessThanNinty for the element coin ***/
        vm.coin(c);
        /*** test code of getChocolate for the element getChocs ***/
        vm.getChoc(sb);
        /*** test code of doingNothing for the element none ***/
        
    }

}
