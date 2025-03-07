import java.util.HashSet;

public class Task3 {
    public static void main(String[] args) {
        // Step 1: Create a HashSet with at least 10 elements of type String
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        fruits.add("Fig");
        fruits.add("Grapes");
        fruits.add("Honeydew");
        fruits.add("Indian Fig");
        fruits.add("Jackfruit");

        // Step 2: Add a new element to the HashSet
        fruits.add("Kiwi");
        System.out.println("\nHashSet after adding 'Kiwi': " + fruits);

        // Step 3: Check if an element exists in the HashSet
        boolean containsCherry = fruits.contains("Cherry");
        System.out.println("\nDoes the HashSet contain 'Cherry'? " + containsCherry);

        // Step 4: Remove an element from the HashSet
        fruits.remove("Banana");
        System.out.println("\nHashSet after removing 'Banana': " + fruits);

        // Step 5: Check if the HashSet is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("\nIs the HashSet empty? " + isEmpty);

        // Step 6: Get the size of the HashSet
        System.out.println("\nSize of the HashSet: " + fruits.size());

        // Step 7: Print all the elements of the HashSet
        System.out.println("\nAll elements in the HashSet: " + fruits);

        // Step 8: Remove all elements from the HashSet
        fruits.clear();
        System.out.println("\nHashSet after removing all elements: " + fruits);
    }
}
