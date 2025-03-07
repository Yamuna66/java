import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        // Step 1: Create a HashMap with at least 10 key-value pairs
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "John");
        students.put(102, "Alice");
        students.put(103, "Bob");
        students.put(104, "Catherine");
        students.put(105, "David");
        students.put(106, "Eva");
        students.put(107, "Frank");
        students.put(108, "Grace");
        students.put(109, "Hannah");
        students.put(110, "Irene");

        // Step 2: Insert a Key-Value mapping into the map
        students.put(111, "Jack");

        // Step 3: Fetch the value of a Key
        String studentName = students.get(103);  // Fetch value for student ID 103
        System.out.println("Student with ID 103: " + studentName);

        // Step 4: Create a clone/copy of the HashMap
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) students.clone();
        System.out.println("\nCloned Map: " + clonedMap);

        // Step 5: Check if the given Key is in the Map
        boolean hasKey = students.containsKey(104);  // Check if ID 104 exists
        System.out.println("\nDoes ID 104 exist? " + hasKey);

        // Step 6: Check if the value is in the Map
        boolean hasValue = students.containsValue("Eva");  // Check if "Eva" exists
        System.out.println("\nIs 'Eva' in the Map? " + hasValue);

        // Step 7: Check if the map is empty
        boolean isEmpty = students.isEmpty();
        System.out.println("\nIs the Map empty? " + isEmpty);

        // Step 8: Print the size of the Map
        System.out.println("\nSize of the Map: " + students.size());

        // Step 9: Print all the Keys of the Map to the console
        System.out.println("\nKeys in the Map: " + students.keySet());

        // Step 10: Print all the Values of the Map to the console
        System.out.println("\nValues in the Map: " + students.values());

        // Step 11: Remove a specific Key-Value pair
        students.remove(105);  // Remove student with ID 105
        System.out.println("\nMap after removing ID 105: " + students);

        // Step 12: Copy all the elements of the Map to another Map
        HashMap<Integer, String> anotherMap = new HashMap<>();
        anotherMap.putAll(students);
        System.out.println("\nAnother Map after copying elements from the original Map: " + anotherMap);
    }
}
