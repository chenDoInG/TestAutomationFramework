
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;


public class TempTest {

    public boolean test(){
        //board values
        int[][] Amap = { {0,0,0} , {0,0,0} , {0,0,0}  }; //Available Spots on the board
        int[][] Xmap = { {0,0,0} , {0,0,0} , {0,0,0}  }; //location of &apos;X&apos; Pieces
        int[][] Omap = { {0,0,0} , {0,0,0} , {0,0,0}  }; //location of &apos;O&apos; Pieces
        
        //Game values
        int WhosTurn = 1;
        
        TicTacToe ttt = new TicTacToe();
        ttt.Welcome();
        System.setIn(new ByteArrayInputStream("y".getBytes()));
        try {
        ttt.NewGame(Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        ttt.ShowGameBoard(Amap, Xmap, Omap);
        //this code is used to simulate the system input from the command line
        System.setIn(new ByteArrayInputStream("b2".getBytes()));
        
        try {
        WhosTurn = ttt.GetMove(WhosTurn, Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        try {
        ttt.CheckWin(Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        ttt.ShowGameBoard(Amap, Xmap, Omap);
        
        //this code is used to simulate the system input from the command line
        System.setIn(new ByteArrayInputStream("a1".getBytes()));
        
        try {
        WhosTurn = ttt.GetMove(WhosTurn, Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        try {
        ttt.CheckWin(Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        ttt.ShowGameBoard(Amap, Xmap, Omap);
        
        //this code is used to simulate the system input from the command line
        System.setIn(new ByteArrayInputStream("a2".getBytes()));
        
        try {
        WhosTurn = ttt.GetMove(WhosTurn, Amap, Xmap, Omap);
        } catch (IOException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
        }
        try {
        ttt.CheckWin(Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        ttt.ShowGameBoard(Amap, Xmap, Omap);
        
        //this code is used to simulate the system input from the command line
        System.setIn(new ByteArrayInputStream("c2".getBytes()));
        
        try {
        WhosTurn = ttt.GetMove(WhosTurn, Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        try {
        ttt.CheckWin(Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        ttt.ShowGameBoard(Amap, Xmap, Omap);
        
        //this code is used to simulate the system input from the command line
        System.setIn(new ByteArrayInputStream("b3".getBytes()));
        
        try {
        WhosTurn = ttt.GetMove(WhosTurn, Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        try {
        ttt.CheckWin(Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        ttt.ShowGameBoard(Amap, Xmap, Omap);
        
        //this code is used to simulate the system input from the command line
        System.setIn(new ByteArrayInputStream("b1".getBytes()));
        
        try {
        WhosTurn = ttt.GetMove(WhosTurn, Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        try {
        ttt.CheckWin(Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        ttt.ShowGameBoard(Amap, Xmap, Omap);
        
        //this code is used to simulate the system input from the command line
        System.setIn(new ByteArrayInputStream("a3".getBytes()));
        
        try {
        WhosTurn = ttt.GetMove(WhosTurn, Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        try {
        ttt.CheckWin(Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        ttt.ShowGameBoard(Amap, Xmap, Omap);
        
        //this code is used to simulate the system input from the command line
        System.setIn(new ByteArrayInputStream("c1".getBytes()));
        
        try {
        WhosTurn = ttt.GetMove(WhosTurn, Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        //this code is used to simulate the system input from the command line
        //System.setIn(new ByteArrayInputStream("n".getBytes()));
        try {
        ttt.CheckWin(Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        System.setIn(new ByteArrayInputStream("y".getBytes()));
        try {
        ttt.NewGame(Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        ttt.ShowGameBoard(Amap, Xmap, Omap);
        System.setIn(new ByteArrayInputStream("a1".getBytes()));
        
        try {
        WhosTurn = ttt.GetMove(WhosTurn, Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        try {
        ttt.CheckWin(Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        ttt.ShowGameBoard(Amap, Xmap, Omap);
        
        //this code is used to simulate the system input from the command line
        System.setIn(new ByteArrayInputStream("a2".getBytes()));
        
        try {
        WhosTurn = ttt.GetMove(WhosTurn, Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        try {
        ttt.CheckWin(Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        ttt.ShowGameBoard(Amap, Xmap, Omap);
        
        //this code is used to simulate the system input from the command line
        System.setIn(new ByteArrayInputStream("a3".getBytes()));
        
        try {
        WhosTurn = ttt.GetMove(WhosTurn, Amap, Xmap, Omap);
        } catch (IOException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
        }
        try {
        ttt.CheckWin(Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        ttt.ShowGameBoard(Amap, Xmap, Omap);
        
        //this code is used to simulate the system input from the command line
        System.setIn(new ByteArrayInputStream("b2".getBytes()));
        
        try {
        WhosTurn = ttt.GetMove(WhosTurn, Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        try {
        ttt.CheckWin(Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        ttt.ShowGameBoard(Amap, Xmap, Omap);
        
        //this code is used to simulate the system input from the command line
        System.setIn(new ByteArrayInputStream("c2".getBytes()));
        
        try {
        WhosTurn = ttt.GetMove(WhosTurn, Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        try {
        ttt.CheckWin(Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        ttt.ShowGameBoard(Amap, Xmap, Omap);
        
        //this code is used to simulate the system input from the command line
        System.setIn(new ByteArrayInputStream("b1".getBytes()));
        
        try {
        WhosTurn = ttt.GetMove(WhosTurn, Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        try {
        ttt.CheckWin(Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        ttt.ShowGameBoard(Amap, Xmap, Omap);
        
        //this code is used to simulate the system input from the command line
        System.setIn(new ByteArrayInputStream("b3".getBytes()));
        
        try {
        WhosTurn = ttt.GetMove(WhosTurn, Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        try {
        ttt.CheckWin(Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        ttt.ShowGameBoard(Amap, Xmap, Omap);
        
        //this code is used to simulate the system input from the command line
        System.setIn(new ByteArrayInputStream("c1".getBytes()));
        
        try {
        WhosTurn = ttt.GetMove(WhosTurn, Amap, Xmap, Omap);
        ttt.CheckWin(Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        ttt.ShowGameBoard(Amap, Xmap, Omap);
        
        System.setIn(new ByteArrayInputStream("c3".getBytes()));
        
        try {
        WhosTurn = ttt.GetMove(WhosTurn, Amap, Xmap, Omap);
        
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }try {
        ttt.CheckWin(Amap, Xmap, Omap);
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        return ttt.getWinner().equals("BOARD FULL! STALEMATE - NO") == true;
    }
}
