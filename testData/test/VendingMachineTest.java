
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class VendingMachineTest {

    @Test
    /* The test for the path initialize   */ 
    public void test0(){
    }

    @Test
    /* The test for the path initialize addChocs addChocs   */ 
    public void test1(){
        vendingMachine vm = new vendingMachine();
        vm.addChoc("MM");
        vm.addChoc("MM");
        assertEquals(true, vm.getStock().size() == 10);
    }

    @Test
    /* The test for the path initialize addChocs addChocs   */ 
    public void test2(){
        vendingMachine vm = new vendingMachine();
        vm.addChoc("MM");
        vm.addChoc("MM");
        assertEquals(true, vm.getStock().size() > 0 && vm.getStock().size() < 10);
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs getChocs   */ 
    public void test3(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        vendingMachine vm = new vendingMachine();
        vm.coin(100);
        vm.addChoc("MM");
        vm.getChoc(sb);
        assertEquals(true, vm.getStock().size() > 0 && vm.getStock().size() < 10);
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs addChocs getChocs   */ 
    public void test4(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        vendingMachine vm = new vendingMachine();
        vm.coin(100);
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.getChoc(sb);
        assertEquals(true, vm.getStock().size() > 0 && vm.getStock().size() < 10);
    }

    @Test
    /* The test for the path initialize addChocs addCoinAtLeastNinty getChocs addChocs   */ 
    public void test5(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        vendingMachine vm = new vendingMachine();
        vm.addChoc("MM");
        vm.coin(100);
        vm.getChoc(sb);
        vm.addChoc("MM");
        assertEquals(true, vm.getStock().size() > 0 && vm.getStock().size() < 10);
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs addChocs getChocs addChocs   */ 
    public void test6(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        vendingMachine vm = new vendingMachine();
        vm.coin(100);
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.getChoc(sb);
        vm.addChoc("MM");
        assertEquals(true, vm.getStock().size() > 0 && vm.getStock().size() < 10);
    }

    @Test
    /* The test for the path initialize addChocs addChocs addCoinAtLeastNinty getChocs   */ 
    public void test7(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        vendingMachine vm = new vendingMachine();
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.coin(100);
        vm.getChoc(sb);
        assertEquals(true, vm.getStock().size() > 0 && vm.getStock().size() < 10);
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty coin coin addChocs getChocs addChocs   */ 
    public void test8(){
        int c = 11;
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        vendingMachine vm = new vendingMachine();
        vm.coin(25);
        vm.coin(c);
        vm.coin(c);
        vm.addChoc("MM");
        vm.getChoc(sb);
        vm.addChoc("MM");
        assertEquals(true, vm.getStock().size() > 0 && vm.getStock().size() < 10);
    }

    @Test
    /* The test for the path initialize addChocs addCoinLessThanNinty coin getChocs addChocs   */ 
    public void test9(){
        int c = 11;
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        vendingMachine vm = new vendingMachine();
        vm.addChoc("MM");
        vm.coin(25);
        vm.coin(c);
        vm.getChoc(sb);
        vm.addChoc("MM");
        assertEquals(true, vm.getStock().size() > 0 && vm.getStock().size() < 10);
    }

    @Test
    /* The test for the path initialize addChocs addChocs addCoinLessThanNinty coin getChocs   */ 
    public void test10(){
        int c = 11;
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        vendingMachine vm = new vendingMachine();
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.coin(25);
        vm.coin(c);
        vm.getChoc(sb);
        assertEquals(true, vm.getStock().size() > 0 && vm.getStock().size() < 10);
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty addChocs addChocs coin coin getChocs   */ 
    public void test11(){
        int c = 11;
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        vendingMachine vm = new vendingMachine();
        vm.coin(25);
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.coin(c);
        vm.coin(c);
        vm.getChoc(sb);
        assertEquals(true, vm.getStock().size() > 0 && vm.getStock().size() < 10);
    }

}
