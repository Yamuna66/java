import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList of type String and add 10 elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grapes");
        list.add("Honeydew");
        list.add("Indian Fig");
        list.add("Jackfruit");

        // Step 2: Iterate through the ArrayList using an Iterator
        System.out.println("Iterating through the ArrayList:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Step 3: Add an element at a specific index
        list.add(3, "Kiwi");
        System.out.println("\nArrayList after adding 'Kiwi' at index 3:");
        System.out.println(list);

        // Step 4: Remove an element from the ArrayList
        list.remove("Banana");
        System.out.println("\nArrayList after removing 'Banana':");
        System.out.println(list);

        // Step 5: Remove an element at a specific index
        list.remove(5);  // Removes element at index 5
        System.out.println("\nArrayList after removing element at index 5:");
        System.out.println(list);

        // Step 6: Update the element at a specific index
        list.set(4, "Mango");
        System.out.println("\nArrayList after updating element at index 4 to 'Mango':");
        System.out.println(list);

        // Step 7: Check if the element is present at a particular index
        String elementAtIndex = list.get(2);  // Get element at index 2
        System.out.println("\nElement at index 2: " + elementAtIndex);

        // Step 8: Get the size of the ArrayList
        System.out.println("\nSize of the ArrayList: " + list.size());

        // Step 9: Check if a particular element is present in the ArrayList
        boolean containsMango = list.contains("Mango");
        System.out.println("\nIs 'Mango' present in the ArrayList? " + containsMango);

        // Step 10: Remove all elements from the ArrayList
        list.clear();
        System.out.println("\nArrayList after removing all elements:");
        System.out.println(list);
    }
}