package programs1a;
import java.util.*;

public ArrayListLinkedList {
	    public static void main(String[] args) {
	        // Initialize ArrayList and LinkedList
	        List<String> arrayList = new ArrayList<>();
	        List<String> linkedList = new LinkedList<>();

	        // 1. Adding elements
	        addElements(arrayList);
	        addElements(linkedList);

	        // 2. Adding element at specific index
	        arrayList.add(1, "Mango");
	        linkedList.add(1, "Mango");

	        // 3. Adding multiple elements
	        List<String> moreFruits = Arrays.asList("Pineapple", "Grapes");
	        arrayList.addAll(moreFruits);
	        linkedList.addAll(moreFruits);

	        // 4. Accessing elements
	        System.out.println("Element at index 2 in ArrayList: " + arrayList.get(2));
	        System.out.println("Element at index 2 in LinkedList: " + linkedList.get(2));

	        // 5. Updating elements
	        arrayList.set(2, "Cherry");
	        linkedList.set(2, "Cherry");

	        // 6. Removing elements
	        arrayList.remove("Banana");
	        linkedList.remove("Banana");

	        // 7. Searching elements
	        System.out.println("ArrayList contains Orange? " + arrayList.contains("Orange"));
	        System.out.println("LinkedList contains Orange? " + linkedList.contains("Orange"));

	        // 8. List size
	        System.out.println("Size of ArrayList: " + arrayList.size());
	        System.out.println("Size of LinkedList: " + linkedList.size());

	        // 9. Iterating over list
	        System.out.println("ArrayList elements:");
	        for (String fruit : arrayList) {
	            System.out.println(fruit);
	        }

	        // 10. Using Iterator
	        System.out.println("LinkedList elements using Iterator:");
	        Iterator<String> iterator = linkedList.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        // 11. Sorting
	        Collections.sort(arrayList);
	        Collections.sort(linkedList);
	        System.out.println("Sorted ArrayList: " + arrayList);
	        System.out.println("Sorted LinkedList: " + linkedList);

	        // 12. Sublist
	        List<String> arrayListSub = arrayList.subList(1, 3);
	        System.out.println("Sublist from ArrayList: " + arrayListSub);

	        // 13. Clearing the list
	        arrayList.clear();
	        linkedList.clear();
	        System.out.println("ArrayList after clearing: " + arrayList);
	        System.out.println("LinkedList after clearing: " + linkedList);
	    }

	    private static void addElements(List<String> list) {
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");
	    }
	}

