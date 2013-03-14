
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class treeTest {

    @Test
    /* The test for the path Initial0 initialize Initialized Insert Root Delete Initialized Insert Root insert MoreThanRoot  FinalState0  */ 
    public void test0(){
        /*** test code of initializeMapping for the element initialize ***/
        Tree tree = new Tree();
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of deleteMapping for the element delete ***/
        tree.delete(1);
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        assertEquals(true, (tree.getRoot()!= null && (tree.getRoot().leftChild == null || tree.getRoot().rightChild != null)) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized find Found  Initialized Insert Root insert MoreThanRoot  FinalState0  */ 
    public void test1(){
        /*** test code of initializeMapping for the element initialize ***/
        Tree tree = new Tree();
        /*** test code of findMapping for the element find ***/
        tree.find(1);
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        assertEquals(true, (tree.getRoot()!= null && (tree.getRoot().leftChild == null || tree.getRoot().rightChild != null)) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized traverse Traversed  Initialized Insert Root insert MoreThanRoot  FinalState0  */ 
    public void test2(){
        /*** test code of initializeMapping for the element initialize ***/
        Tree tree = new Tree();
        /*** test code of traverseMapping for the element traverse ***/
        tree.traverse(1);
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        assertEquals(true, (tree.getRoot()!= null && (tree.getRoot().leftChild == null || tree.getRoot().rightChild != null)) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized show Shown  Initialized Insert Root insert MoreThanRoot  FinalState0  */ 
    public void test3(){
        /*** test code of initializeMapping for the element initialize ***/
        Tree tree = new Tree();
        /*** test code of showMapping for the element show ***/
        tree.displayTree();
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        assertEquals(true, (tree.getRoot()!= null && (tree.getRoot().leftChild == null || tree.getRoot().rightChild != null)) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized Insert Root insert MoreThanRoot delete Root insert MoreThanRoot  FinalState0  */ 
    public void test4(){
        /*** test code of initializeMapping for the element initialize ***/
        Tree tree = new Tree();
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of deleteMapping for the element delete ***/
        tree.delete(1);
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        assertEquals(true, (tree.getRoot()!= null && (tree.getRoot().leftChild == null || tree.getRoot().rightChild != null)) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized Insert Root traverse RootTraversed  Root insert MoreThanRoot  FinalState0  */ 
    public void test5(){
        /*** test code of initializeMapping for the element initialize ***/
        Tree tree = new Tree();
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of traverseMapping for the element traverse ***/
        tree.traverse(1);
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        assertEquals(true, (tree.getRoot()!= null && (tree.getRoot().leftChild == null || tree.getRoot().rightChild != null)) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized Insert Root show RootShown  Root insert MoreThanRoot  FinalState0  */ 
    public void test6(){
        /*** test code of initializeMapping for the element initialize ***/
        Tree tree = new Tree();
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of showMapping for the element show ***/
        tree.displayTree();
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        assertEquals(true, (tree.getRoot()!= null && (tree.getRoot().leftChild == null || tree.getRoot().rightChild != null)) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized Insert Root find RootFound  Root insert MoreThanRoot  FinalState0  */ 
    public void test7(){
        /*** test code of initializeMapping for the element initialize ***/
        Tree tree = new Tree();
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of findMapping for the element find ***/
        tree.find(1);
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        assertEquals(true, (tree.getRoot()!= null && (tree.getRoot().leftChild == null || tree.getRoot().rightChild != null)) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized Insert Root insert MoreThanRoot traverse MoreThanRootTraversed  MoreThanRoot  FinalState0  */ 
    public void test8(){
        /*** test code of initializeMapping for the element initialize ***/
        Tree tree = new Tree();
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of traverseMapping for the element traverse ***/
        tree.traverse(1);
        assertEquals(true, (tree.getRoot()!= null && (tree.getRoot().leftChild == null || tree.getRoot().rightChild != null)) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized Insert Root insert MoreThanRoot show MoreThanRootShown  MoreThanRoot  FinalState0  */ 
    public void test9(){
        /*** test code of initializeMapping for the element initialize ***/
        Tree tree = new Tree();
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of showMapping for the element show ***/
        tree.displayTree();
        assertEquals(true, (tree.getRoot()!= null && (tree.getRoot().leftChild == null || tree.getRoot().rightChild != null)) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized Insert Root insert MoreThanRoot find MoreThanRootFound  MoreThanRoot  FinalState0  */ 
    public void test10(){
        /*** test code of initializeMapping for the element initialize ***/
        Tree tree = new Tree();
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of findMapping for the element find ***/
        tree.find(1);
        assertEquals(true, (tree.getRoot()!= null && (tree.getRoot().leftChild == null || tree.getRoot().rightChild != null)) == true);
    }

}
