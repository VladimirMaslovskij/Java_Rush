//Methods for ArrayList
import java.util.ArrayList;

public class ArrayListTest {
    static ArrayList<Integer> arrayList = new ArrayList<>();
    static long createArrayList(int size)
    {
        long initialTime = System.nanoTime();
        for (int i = 0; i < size; i++)
        {
            arrayList.add((int)(Math.random() * 100000));
        }
        return System.nanoTime() - initialTime;
    }
    long addElementToStartArrayList()
    {
        long initialTime = System.nanoTime();
        arrayList.add(0,(int)(Math.random() * 100000));
        return System.nanoTime() - initialTime;
    }
    long addElementToEndArrayList(int size)
    {
        long initialTime = System.nanoTime();
        arrayList.add(size,(int)(Math.random() * 100000));
        return System.nanoTime() - initialTime;
    }
    long addElementToMiddleOfArrayList(int size)
    {
        long initialTime = System.nanoTime();
        arrayList.add(size/2 ,(int)(Math.random() * 100000));
        return System.nanoTime() - initialTime;
    }
    long getElementFromMiddleOfArrayList(int size)
    {
        long initialTime = System.nanoTime();
        arrayList.get(size/2);
        return System.nanoTime() - initialTime;
    }
    long setElementToMiddleOfArrayList(int size)
    {
        long initialTime = System.nanoTime();
        arrayList.set(size/2,(int)(Math.random() * 100000));
        return System.nanoTime() - initialTime;
    }
}
