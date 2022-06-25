//I do not use getters and setters. I am lazy);
public class Main
{
    public static final String YELLOW = "\u001B[33m";
    public static final String RESET = "\u001B[0m";
    static Menu menu = new Menu();
    static LinkedListTest linkedListTest = new LinkedListTest();
    static ArrayListTest arrayListTest = new ArrayListTest();

    public static void main(String[] args)
    {
        int size = menu.menu();
        System.out.println("<-----List_Size----->");
        System.out.println(size);
        System.out.println("<-----Time_to_create_LinkedList_Vs_ArrayList---->");
        System.out.println("LinkedList -> :"+linkedListTest.createLinkedList(size) + " ns"
                + "\n ArrayList -> :" + ArrayListTest.createArrayList(size) + " ns");
        if (linkedListTest.createLinkedList(size)>ArrayListTest.createArrayList(size))
            System.out.println(YELLOW + "LinkedList is slower" + RESET);
        else System.out.printf(YELLOW + "LinkedList is faster" + RESET);
        System.out.println("<-----Time_to_Add_First_Element_To_LinkedList_Vs_ArrayList----->");
        System.out.println("LinkedList -> :"+linkedListTest.addElementToStartLinkedList() + " ns"
                + "\n ArrayList -> :" + arrayListTest.addElementToStartArrayList() + " ns");
        if (linkedListTest.addElementToStartLinkedList()>arrayListTest.addElementToStartArrayList())
            System.out.println(YELLOW + "LinkedList is slower" + RESET);
        else System.out.printf(YELLOW + "LinkedList is faster" + RESET);
        System.out.println("\n<-----Time_to_Add_Last_Element_To_LinkedList_Vs_ArrayList----->");
        System.out.println("LinkedList -> :"+linkedListTest.addElementToEndLinkedList(size) + " ns"
                + "\n ArrayList -> :" + arrayListTest.addElementToEndArrayList(size) + " ns");
        if (linkedListTest.addElementToEndLinkedList(size)>arrayListTest.addElementToEndArrayList(size))
            System.out.println(YELLOW + "LinkedList is slower" + RESET);
        else System.out.printf(YELLOW + "LinkedList is faster" + RESET);
        System.out.println("<-----Time_to_Add_Element_To_Middle_Of_LinkedList_Vs_ArrayList----->");
        System.out.println("LinkedList -> :"+linkedListTest.addElementToMiddleOfLinkedList(size) + " ns"
                + "\n ArrayList -> :" + arrayListTest.addElementToMiddleOfArrayList(size) + " ns");
        if (linkedListTest.addElementToMiddleOfLinkedList(size)>arrayListTest.addElementToMiddleOfArrayList(size))
        System.out.println(YELLOW + "LinkedList is slower" + RESET);
        else System.out.printf(YELLOW + "LinkedList is faster" + RESET);
        System.out.println("<-----Time_to_Get_Element_From_Middle_Of_LinkedList_Vs_ArrayList----->");
        System.out.println("LinkedList -> :"+linkedListTest.getElementFromMiddleOfLinkedList(size) + " ns"
                + "\n ArrayList -> :" + arrayListTest.getElementFromMiddleOfArrayList(size) + " ns");
        if (linkedListTest.getElementFromMiddleOfLinkedList(size)>arrayListTest.getElementFromMiddleOfArrayList(size))
            System.out.println(YELLOW + "LinkedList is slower" + RESET);
        else System.out.printf(YELLOW + "LinkedList is faster" + RESET);
        System.out.println("<-----Time_to_Set_Element_To_Middle_Of_LinkedList_Vs_ArrayList----->");
        System.out.println("LinkedList -> :"+linkedListTest.setElementToMiddleOfLinkedList(size) + " ns"
                + "\n ArrayList -> :" + arrayListTest.setElementToMiddleOfArrayList(size) + " ns");
        if (linkedListTest.setElementToMiddleOfLinkedList(size)>arrayListTest.setElementToMiddleOfArrayList(size))
            System.out.println(YELLOW + "LinkedList is slower" + RESET);
        else System.out.printf(YELLOW + "LinkedList is faster" + RESET);
    }
}



