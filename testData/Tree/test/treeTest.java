

import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;



public class TreeTest {

    @Test
    /* The test for the path Initial0 initialize Initialized insert Root insert MoreThanRoot show MoreThanRootShown  MoreThanRoot show MoreThanRootShown  MoreThanRoot  FinalState0  */ 
    public void test0(){
        /*** test code of initializeMapping for the element initialize ***/
        Tree tree = new Tree();
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of showMapping for the element show ***/
        tree.displayTree();
        /*** test code of showMapping for the element show ***/
        tree.displayTree();
        assertEquals(true, (tree.getRoot()!= null && (tree.getRoot().leftChild == null || tree.getRoot().rightChild != null)) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized insert Root insert MoreThanRoot traverse MoreThanRootTraversed  MoreThanRoot find MoreThanRootFound  MoreThanRoot traverse MoreThanRootTraversed  MoreThanRoot  FinalState0  */ 
    public void test1(){
        /*** test code of initializeMapping for the element initialize ***/
        Tree tree = new Tree();
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of traverseMapping for the element traverse ***/
        tree.traverse(1);
        /*** test code of findMapping for the element find ***/
        tree.find(1);
        /*** test code of traverseMapping for the element traverse ***/
        tree.traverse(1);
        assertEquals(true, (tree.getRoot()!= null && (tree.getRoot().leftChild == null || tree.getRoot().rightChild != null)) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized insert Root show RootShown  Root insert MoreThanRoot delete Root traverse RootTraversed  Root find RootFound  Root show RootShown  Root insert MoreThanRoot  FinalState0  */ 
    public void test2(){
        /*** test code of initializeMapping for the element initialize ***/
        Tree tree = new Tree();
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of showMapping for the element show ***/
        tree.displayTree();
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of deleteMapping for the element delete ***/
        tree.delete(1);
        /*** test code of traverseMapping for the element traverse ***/
        tree.traverse(1);
        /*** test code of findMapping for the element find ***/
        tree.find(1);
        /*** test code of showMapping for the element show ***/
        tree.displayTree();
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        assertEquals(true, (tree.getRoot()!= null && (tree.getRoot().leftChild == null || tree.getRoot().rightChild != null)) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized traverse Traversed  Initialized insert Root delete Initialized traverse Traversed  Initialized insert Root insert MoreThanRoot  FinalState0  */ 
    public void test3(){
        /*** test code of initializeMapping for the element initialize ***/
        Tree tree = new Tree();
        /*** test code of traverseMapping for the element traverse ***/
        tree.traverse(1);
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of deleteMapping for the element delete ***/
        tree.delete(1);
        /*** test code of traverseMapping for the element traverse ***/
        tree.traverse(1);
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        assertEquals(true, (tree.getRoot()!= null && (tree.getRoot().leftChild == null || tree.getRoot().rightChild != null)) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized find Found  Initialized show Shown  Initialized insert Root insert MoreThanRoot  FinalState0  */ 
    public void test4(){
        /*** test code of initializeMapping for the element initialize ***/
        Tree tree = new Tree();
        /*** test code of findMapping for the element find ***/
        tree.find(1);
        /*** test code of showMapping for the element show ***/
        tree.displayTree();
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        assertEquals(true, (tree.getRoot()!= null && (tree.getRoot().leftChild == null || tree.getRoot().rightChild != null)) == true);
    }

    @Test
    /* The test for the path Initial0 initialize Initialized insert Root insert MoreThanRoot  FinalState0  */ 
    public void test5(){
        /*** test code of initializeMapping for the element initialize ***/
        Tree tree = new Tree();
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        /*** test code of insertMapping for the element insert ***/
        tree.insert(1, 1.0);
        assertEquals(true, (tree.getRoot()!= null && (tree.getRoot().leftChild == null || tree.getRoot().rightChild != null)) == true);
    }

}
