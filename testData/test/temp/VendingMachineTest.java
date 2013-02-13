
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class VendingMachineTest {

    @Test
    /* The test for the path initialize   */ 
    public void test0(){
        vendingMachine vm = new vendingMachine();
    }

    @Test
    /* The test for the path initialize addChocs addChocs   */ 
    public void test1(){
        vendingMachine vm = new vendingMachine();
        vm.addChoc("MM");
        vm.addChoc("MM");
    }

    @Test
    /* The test for the path initialize addChocs addChocs   */ 
    public void test2(){
        vendingMachine vm = new vendingMachine();
        vm.addChoc("MM");
        vm.addChoc("MM");
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs getChocs   */ 
    public void test3(){
        StringBuffer sb = new StringBuffer("MM");
        vendingMachine vm = new vendingMachine();
        vm.coin(100);
        vm.addChoc("MM");
        vm.getChoc(sb);
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs addChocs getChocs   */ 
    public void test4(){
        StringBuffer sb = new StringBuffer("MM");
        vendingMachine vm = new vendingMachine();
        vm.coin(100);
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.getChoc(sb);
    }

    @Test
    /* The test for the path initialize addChocs addCoinAtLeastNinty getChocs getChocs addChocs   */ 
    public void test5(){
        StringBuffer sb = new StringBuffer("MM");
        vendingMachine vm = new vendingMachine();
        vm.addChoc("MM");
        vm.coin(100);
        vm.getChoc(sb);
        
        vm.getChoc(sb);
        
        vm.addChoc("MM");
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs addChocs getChocs getChocs addChocs   */ 
    public void test6(){
        StringBuffer sb = new StringBuffer("MM");
        vendingMachine vm = new vendingMachine();
        vm.coin(100);
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.getChoc(sb);
        
        vm.getChoc(sb);
        
        vm.addChoc("MM");
    }

    @Test
    /* The test for the path initialize addChocs addChocs addCoinAtLeastNinty getChocs   */ 
    public void test7(){
        StringBuffer sb = new StringBuffer("MM");
        vendingMachine vm = new vendingMachine();
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.coin(100);
        vm.getChoc(sb);
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty coin coin addChocs getChocs getChocs addChocs   */ 
    public void test8(){
        StringBuffer sb = new StringBuffer("MM");
        vendingMachine vm = new vendingMachine();
        vm.coin(25);
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        
        vm.addChoc("MM");
        vm.getChoc(sb);
        
        vm.getChoc(sb);
        
        vm.addChoc("MM");
    }

    @Test
    /* The test for the path initialize addChocs addCoinLessThanNinty coin getChocs getChocs addChocs   */ 
    public void test9(){
        StringBuffer sb = new StringBuffer("MM");
        vendingMachine vm = new vendingMachine();
        vm.addChoc("MM");
        vm.coin(25);
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        
        vm.getChoc(sb);
        
        vm.getChoc(sb);
        
        vm.addChoc("MM");
    }

    @Test
    /* The test for the path initialize addChocs addChocs addCoinLessThanNinty coin getChocs   */ 
    public void test10(){
        StringBuffer sb = new StringBuffer("MM");
        vendingMachine vm = new vendingMachine();
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.coin(25);
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        
        vm.getChoc(sb);
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty addChocs addChocs coin coin getChocs   */ 
    public void test11(){
        StringBuffer sb = new StringBuffer("MM");
        vendingMachine vm = new vendingMachine();
        vm.coin(25);
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        
        vm.getChoc(sb);
    }

}
