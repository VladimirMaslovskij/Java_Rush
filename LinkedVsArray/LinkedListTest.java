//Methods for LinkedList
import java.util.LinkedList;

public class LinkedListTest
{
    LinkedList<Integer> linkedList = new LinkedList<>();
    long createLinkedList(int size)
    {
        long listInitialTime = System.nanoTime();
        for (int i = 0; i < size; i++)
        {
            linkedList.add((int)(Math.random() * 100000));
        }
        return System.nanoTime() - listInitialTime;
    }
    long addElementToStartLinkedList()
    {
        long initialTime = System.nanoTime();
        linkedList.add(0,(int)(Math.random() * 100000));
        return System.nanoTime() - initialTime;
    }
    long addElementToEndLinkedList(int size)
    {
        long initialTime = System.nanoTime();
        linkedList.add(size,(int)(Math.random() * 100000));
        return System.nanoTime() - initialTime;
    }
    long addElementToMiddleOfLinkedList(int size)
    {
        long initialTime = System.nanoTime();
        linkedList.add(size/2 ,(int)(Math.random() * 100000));
        return System.nanoTime() - initialTime;
    }
    long getElementFromMiddleOfLinkedList(int size)
    {
        long initialTime = System.nanoTime();
        linkedList.get(size/2);
        return System.nanoTime() - initialTime;
    }
    long setElementToMiddleOfLinkedList(int size)
    {
        long initialTime = System.nanoTime();
        linkedList.set(size/2,(int)(Math.random() * 100000));
        return System.nanoTime() - initialTime;
    }
}
