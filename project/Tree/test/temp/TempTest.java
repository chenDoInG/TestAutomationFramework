
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;


public class TempTest {

    public boolean test(){
        Tree tree = new Tree();
        tree.insert(1, 1.0);
        tree.insert(1, 1.0);
        return (tree.getRoot()!= null && (tree.getRoot().leftChild == null || tree.getRoot().rightChild != null)) == true;
    }
}
