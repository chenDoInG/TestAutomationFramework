
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class VendingMachineTest {

    @Test
    /* The test for the path Initial initialize State1 addChocs State4 addCoinAtLeastNinty State6 addChocs State9 getChocs State4 addCoinAtLeastNinty State6 getChocs State1 addChocs State4 addCoinAtLeastNinty State6 getChocs State4 addCoinLessThanNinty State5 coin State6 getChocs State4 addChocs State7 addCoinAtLeastNinty State9 getChocs State4 addCoinLessThanNinty State5 addChocs State8 coin State9 getChocs State4 addCoinAtLeastNinty State6 getChocs State1 addCoinLessThanNinty State2 coin State3 addChocs State6 getChocs State1 addChocs State4 addCoinLessThanNinty State5 addChocs State8 coin State9 getChocs State4 addCoinLessThanNinty State5 addChocs State8 coin State9 getChocs State4 addCoinAtLeastNinty State6 getChocs State1 addCoinLessThanNinty State2 addChocs State5 addChocs State8 coin State9 getChocs State4 addCoinAtLeastNinty State6 getChocs State1 addCoinLessThanNinty State2 addChocs State5 coin State6 getChocs State1 addCoinAtLeastNinty State3 addChocs State6 getChocs State1 addCoinLessThanNinty State2 addChocs State5 addChocs State8 coin State9 getChocs State4 none Final  */ 
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
}
