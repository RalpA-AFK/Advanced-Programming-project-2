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
        System.out.println("What is the last integer in the array? " + list.baseArray[size]); // will be 50
        list.addLast(60);
        size = list.size;
        System.out.println("What is the last integer in the array? " + list.baseArray[size]); // will be 60
    }
    public static void testAddFirst(){
        DynamicArray<Integer> list = new DynamicArray<>(); //populate the list
        list.addLast(10); list.addLast(20); list.addLast(30); list.addLast(40); list.addLast(50);
        System.out.println("--- Testing addFirst ---");
        System.out.println("What is the first integer in the array? " + list.baseArray[0]); // will be 10
        list.addFirst(60);
        System.out.println("What is the first integer in the array? " + list.baseArray[0]); // will be 60
    }
    public static void testInsertAt(){
        DynamicArray<Integer> list = new DynamicArray<>(); //populate the list
        list.addLast(10); list.addLast(20); list.addLast(30); list.addLast(40); list.addLast(50);
        System.out.println("--- Testing insertAt ---");
        System.out.println("What is the integer at index 2 in the array? " + list.baseArray[2]); // will be 30
        list.insertAt(2,60);
        System.out.println("What is the integer at index 2 in the array? " + list.baseArray[2]); // will be 60
    }
    public static void testRemoveFirst(){

    }



    public static void main(String[] args){

    }
}
