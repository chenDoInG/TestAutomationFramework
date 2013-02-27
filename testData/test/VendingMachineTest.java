
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class VendingMachineTest {

    @Test
    /* The test for the path initialize none  */ 
    public void test0(){
        vendingMachine vm = new vendingMachine();
        
    }

    @Test
    /* The test for the path initialize addChocs addChocs none  */ 
    public void test1(){
        vendingMachine vm = new vendingMachine();
        vm.addChoc("MM");
        vm.addChoc("MM");
        
    }

    @Test
    /* The test for the path initialize addChocs addChocs none  */ 
    public void test2(){
        vendingMachine vm = new vendingMachine();
        vm.addChoc("MM");
        vm.addChoc("MM");
        
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs getChocs none  */ 
    public void test3(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        vendingMachine vm = new vendingMachine();
        vm.coin(100);
        vm.addChoc("MM");
        vm.getChoc(sb);
        
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs addChocs getChocs none  */ 
    public void test4(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        vendingMachine vm = new vendingMachine();
        vm.coin(100);
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.getChoc(sb);
        
    }

    @Test
    /* The test for the path initialize addChocs addCoinAtLeastNinty getChocs addChocs none  */ 
    public void test5(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        vendingMachine vm = new vendingMachine();
        vm.addChoc("MM");
        vm.coin(100);
        vm.getChoc(sb);
        vm.addChoc("MM");
        
    }

    @Test
    /* The test for the path initialize addCoinAtLeastNinty addChocs addChocs getChocs addChocs none  */ 
    public void test6(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        vendingMachine vm = new vendingMachine();
        vm.coin(100);
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.getChoc(sb);
        vm.addChoc("MM");
        
    }

    @Test
    /* The test for the path initialize addChocs addChocs addCoinAtLeastNinty getChocs none  */ 
    public void test7(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        vendingMachine vm = new vendingMachine();
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.coin(100);
        vm.getChoc(sb);
        
    }

    @Test
    /* The test for the path initialize addCoinLessThanNinty coin coin addChocs getChocs addChocs none  */ 
    public void test8(){
        int c = 10;
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        vendingMachine vm = new vendingMachine();
        vm.coin(25);
        vm.coin(c);
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.addChoc("MM");
        vm.getChoc(sb);
        vm.addChoc("MM");
        
    }

    @Test
    /* The test for the path initialize addChocs addCoinLessThanNinty coin getChocs addChocs none  */ 
    public void test9(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        vendingMachine vm = new vendingMachine();
        vm.addChoc("MM");
        vm.coin(25);
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.getChoc(sb);
        vm.addChoc("MM");
        
    }

    @Test
    /* The test for the path initialize addChocs addChocs addCoinLessThanNinty coin getChocs none  */ 
    public void test10(){
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

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
    /* The test for the path initialize addCoinLessThanNinty addChocs addChocs coin coin getChocs none  */ 
    public void test11(){
        int c = 10;
        String s = "MM";
        StringBuffer sb = new StringBuffer(s);

        vendingMachine vm = new vendingMachine();
        vm.coin(25);
        vm.addChoc("MM");
        vm.addChoc("MM");
        vm.coin(c);
        vm.coin(10);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.coin(25);
        vm.getChoc(sb);
        
    }

}
