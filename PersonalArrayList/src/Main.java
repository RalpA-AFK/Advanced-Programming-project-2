public class Main {
    public static void testIsEmpty(){
        DynamicArray<Integer> list = new DynamicArray<>();
        System.out.println("--- Testing isEmpty ---");
        System.out.println("Is list empty? " + list.isEmpty()); // should print true
        list.addLast(10);
        System.out.println("Added 10, is list empty? " + list.isEmpty()); // should print false
    }
    public static void testSize(){
        DynamicArray<Integer> list = new DynamicArray<>();
        System.out.println("--- Testing size ---");
        System.out.println("What is the list size? " + list.size()); // 0
        list.addLast(10);
        System.out.println("What is the list size " + list.size()); // 1
    }
    public static void testDoubleCapacity(){
        DynamicArray<Integer> list = new DynamicArray<>();
        System.out.println("--- Testing doubleCapacity ---");
        System.out.println("What is the list capacity? " + list.capacity); // will be 10
        list.doubleCapacity();
        System.out.println("What is the list capacity " + list.capacity); // will be 20
    }
    public static void testHalveCapacity(){
        DynamicArray<Integer> list = new DynamicArray<>();
        System.out.println("--- Testing halveCapacity ---");
        System.out.println("What is the list capacity? " + list.capacity); // will be 10
        list.halveCapacity();
        System.out.println("What is the list capacity " + list.capacity); // will be 5
    }
    public static void testAddLast(){
        DynamicArray<Integer> list = new DynamicArray<>(); //populate the list
        list.addFirst(10); list.addFirst(20); list.addFirst(30); list.addFirst(40); list.addFirst(50);
        int size = list.size;
        System.out.println("--- Testing addLast ---");
        System.out.println("What is the last integer in the array? " + list.get(size - 1)); // will be 10
        list.addLast(60);
        size = list.size;
        System.out.println("What is the last integer in the array? " + list.get(size - 1)); // will be 60
    }
    public static void testAddFirst(){
        DynamicArray<Integer> list = new DynamicArray<>(); //populate the list
        list.addLast(10); list.addLast(20); list.addLast(30); list.addLast(40); list.addLast(50);
        System.out.println("--- Testing addFirst ---");
        System.out.println("What is the first integer in the array? " + list.getFirst()); // will be 10
        list.addFirst(60);
        System.out.println("What is the first integer in the array? " + list.getFirst()); // will be 60
    }
    public static void testInsertAt(){
        DynamicArray<Integer> list = new DynamicArray<>(); //populate the list
        list.addLast(10); list.addLast(20); list.addLast(30); list.addLast(40); list.addLast(50);
        System.out.println("--- Testing insertAt ---");
        System.out.println("What is the integer at index 2 in the array? " + list.get(2)); // will be 30
        list.insertAt(2,60);
        System.out.println("What is the integer at index 2 in the array? " + list.get(2)); // will be 60
        System.out.println("What is the integer at index 3? " + list.get(3)); //will be 30
    }
    public static void testRemoveFirst(){
        DynamicArray<Integer> list = new DynamicArray<>(); //populate the list
        list.addLast(10); list.addLast(20); list.addLast(30); list.addLast(40); list.addLast(50);
        System.out.println("--- Testing removeFirst ---");
        System.out.println("What is the integer at index 0 in the array? " + list.getFirst()); // will be 10
        list.removeFirst();
        System.out.println("What is the integer at index 0 in the array? " + list.getFirst()); // will be 20
    }
    public static void testRemoveLast(){
        DynamicArray<Integer> list = new DynamicArray<>(); //populate the list
        list.addLast(10); list.addLast(20); list.addLast(30); list.addLast(40); list.addLast(50);
        System.out.println("--- Testing removeLast ---");
        System.out.println("What is the integer at index 0 in the array? " + list.get(list.size - 1)); // will be 10
        list.removeLast();
        System.out.println("What is the integer at index 0 in the array? " + list.get(list.size - 1)); // will be 20
    }

    public static void testRemoveAt(){
        DynamicArray<Integer> list = new DynamicArray<>(); //populate the list
        list.addLast(10); list.addLast(20); list.addLast(30); list.addLast(40); list.addLast(50);
        System.out.println("--- Testing removeAt ---");
        System.out.println("What is the integer at index 2 in the array? " + list.get(2)); // will be 30
        list.removeAt(2);
        System.out.println("What is the integer at index 2 in the array? " + list.get(2)); // will be 40
    }
    public static void testGetFirst(){
        DynamicArray<Integer> list = new DynamicArray<>(); //populate the list
        list.addLast(10); list.addLast(20); list.addLast(30); list.addLast(40); list.addLast(50);
        System.out.println("--- Testing getFirst ---");
        System.out.println("What is the integer at index 0 in the array? " + list.getFirst()); // will be 10
        list.removeAt(0);
        System.out.println("What is the integer at index 2 in the array? " + list.getFirst()); // will be 20
    }
    public static void testGet(){
        DynamicArray<Integer> list = new DynamicArray<>(); //populate the list
        list.addLast(10); list.addLast(20); list.addLast(30); list.addLast(40); list.addLast(50);
        System.out.println("--- Testing get ---");
        System.out.println("What is the integer at index 4 in the array? " + list.get(4) ); // returns 50
    }
    public static void testSet(){
        DynamicArray<Integer> list = new DynamicArray<>(); //populate the list
        list.addLast(10); list.addLast(20); list.addLast(30); list.addLast(40); list.addLast(50);
        System.out.println("--- Testing set ---");
        System.out.println("What is the integer at index 2 in the array? " + list.get(2)); // will be 30
        list.set(2,60);
        System.out.println("What is the integer at index 2 in the array? " + list.get(2)); // will be 60
    }
    public static void testToArray(){
        DynamicArray<Integer> list = new DynamicArray<>(); //populate the list
        list.addLast(10); list.addLast(20); list.addLast(30); list.addLast(40); list.addLast(50);
        System.out.println("--- Testing toArray ---");
        Object[] arr = list.toArray();
        System.out.println("What are the contents of the array? " + java.util.Arrays.toString(arr));
    }
    public static void testTrimToSize(){
        DynamicArray<Integer> list = new DynamicArray<>(); //populate the list
        list.addLast(10); list.addLast(20); list.addLast(30); list.addLast(40); list.addLast(50);
        System.out.println("--- Testing trimToSize ---");
        System.out.println("What is the capacity and size of the array " + list.capacity + ", " + list.size);
        list.trimToSize();
        System.out.println("What is the capacity and size of the array " + list.capacity + ", " + list.size);
    }
    public static void testClone(){
        DynamicArray<Integer> list = new DynamicArray<>(); //populate the list
        list.addLast(10); list.addLast(20); list.addLast(30); list.addLast(40); list.addLast(50);
        System.out.println("--- Testing Clone ---");
        System.out.println("What is the current DynamicArray content? " + list);
        System.out.println("What is the new DynamicArray content? " + list.clone());
    }
    public static void testClear(){
        DynamicArray<Integer> list = new DynamicArray<>(); //populate the list
        list.addLast(10); list.addLast(20); list.addLast(30); list.addLast(40); list.addLast(50);
        System.out.println("--- Testing clear ---");
        System.out.println("What is the current Array content? " + list);
        list.clear();
        System.out.println("What is the new Array content? " + list);
    }
    public static void testToString(){
        DynamicArray<Integer> list = new DynamicArray<>(); //populate the list
        list.addLast(10); list.addLast(20); list.addLast(30); list.addLast(40); list.addLast(50);
        System.out.println("--- Testing toString ---");
        System.out.println("What does the array look like as a string? " + list.toString());
    }
    public static void testEquals(){
        DynamicArray<Integer> list = new DynamicArray<>(); //populate the list
        list.addLast(10); list.addLast(20); list.addLast(30); list.addLast(40); list.addLast(50);
        System.out.println("--- Testing equals ---");
        System.out.println("Are the two arrays equal? " + list.clone().equals(list));
    }

    public static void main(String[] args){
        //testIsEmpty();
        //testSize();
        //testDoubleCapacity();
        //testHalveCapacity();
        //testAddLast();
        //testAddFirst();
        //testInsertAt();
        //testRemoveFirst();
        //testRemoveLast();
        //testRemoveAt();
        //testGetFirst();
        //testGet();
        //testSet();
        //testToArray();
        //testTrimToSize();
        //testClone();
        //testClear();
        //testToString();
        //testEquals();
    }
}
