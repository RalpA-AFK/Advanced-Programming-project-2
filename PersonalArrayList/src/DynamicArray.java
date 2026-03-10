public class DynamicArray<E> {
    private E[] array;
    private int size;
    private int capacity;


    public DynamicArray() { //default constructor
        capacity = 10;
        array = (E[]) new Object[capacity];
        size = 0;
    }

    public DynamicArray(int capacity) { //when capacity is declared this runs
        this.capacity = capacity;
        array = (E[]) new Object[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } //if size is 0 array is empty
        return false;

    }

    public int size() { // just returns the size of the array not starting from 0
        return size;
    }

    public void doubleCapacity() {
        capacity *= 2;
        E[] newArray = (E[]) new Object[capacity];
        for (int i = 0; i < size; i++) { // cycles through the array and stores each value into the new array
            newArray[i] = array[i];
        }
        array = newArray; // set array to the new array that has double capacity
    }

    public void halveCapacity() {
        if (capacity / 2 >= size) { // the capacity should still be bigger than array size
            capacity /= 2;
            E[] newArray = (E[]) new Object[capacity];
            for (int i = 0; i < size; i++) { // cycles through the array and stores each value into the new array
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void addLast(E e) {
        if (size == capacity) { // when adding if the array is to small we double its capacity
            doubleCapacity();
        }
        array[size] = e; // input the new variable at the end
        size++;          // expand array
    }

    public void addFirst(E e) {
        if (size == capacity) { // when adding if the array is to small we double its capacity
            doubleCapacity();
        }
        for (int i = size; i > 0; i--) { //starting from the tail of the array it goes to the head
            array[i] = array[i - 1];     //and shifts each value downwards
        }
        array[0] = e; // input the new variable at the head
        size++;       // expand array
    }

    public void insertAt(int i, E e) {
        if (size == capacity) { // when adding if the array is to small we double its capacity
            doubleCapacity();
        }
        if (i < 0 || i > size) { // checks to see if the index given exists within the array
            System.out.println("index is out of bounds");
        } else {
            for (int j = size; j > i; j--) { // starting from the tail we go towards the index
                array[j] = array[j - 1];     // given and shift the values downwards
            }
            array[i] = e; // input the new variable at the index given
            size++;       // expand array
        }
    }

    public E removeFirst() {
        if (size == 0) { // if the array is empty we return null as nothing can be removed
            return null;
        }
        E firstNum = array[0]; // store the first number to return it
        for (int i = 0; i < size - 1; i++) { // shift the array
            array[i] = array[i + 1];         // the plus 1 ignores the first index when restoring numbers
        }
        size--; //contract array
        return firstNum;

    }

    public E removeLast() {
        if (size == 0) { // if the array is empty we return null as nothing can be removed
            return null;
        }
        E lastNum = array[size - 1]; // the array is capped at size - 1 not size
        size--;
        return lastNum;
    }

    public E removeAt(int i) {
        if (size == 0) {return null;} // if the array is empty we return null as nothing can be removed
        if (i < 0 || i >= size) { // checks to see if the index given exists within the array
            System.out.println("index is out of bounds");
        } else {
            E removeNum = array[i];
            for (int j = i; j < size - 1; j++) { // left shift
                array[j] = array[j + 1];


            }
            size--; // contract array
            return removeNum;
        }
        return null;
    }
    public E getFirst(){
        if(size == 0){return null;}// if the array is empty we return null
        return array[0];
    }
    public E get(int i){
        if(size == 0){return null;}
        if (i < 0 || i >= size) {
           System.out.println("index is out of bounds");
           return null;
        }
        return array[i];
    }
    public E set(int i, E newElem){
        if(size == 0){return null;}
        if (i < 0 || i >= size) {
            System.out.println("index is out of bounds");
            return null;
        }
        E oldElem = array[i];
        array[i] = newElem;
        return oldElem;
    }
    public E[] toArray(){
        E[] newArray = (E[]) new Object[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
    public void trimToSize(){
        capacity = size;
        E[] newArray = (E[]) new Object[capacity];
        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }
    public DynamicArray<E> clone(){
        DynamicArray<E> newList = new DynamicArray<E>(capacity);
        for(int i = 0; i < size; i++){
            newList.array[i] = array[i];
        }
        newList.capacity = capacity;
        newList.size = size;
        return newList;
    }
    public void clear(){
        for(int i = 0; i < size; i++){
            array[i] = null;
        }
        size = 0;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < size; i++){
            sb.append(array[i]);
            if(i < size-1){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();

    }
    public boolean equals(Object o){
        if(this == o){return true;}
        if(o == null || !(o instanceof DynamicArray)){return false;}
        DynamicArray<E> other = (DynamicArray<E>) o;
        if(size != other.size){return false;}
        for(int i = 0; i < size; i++){
            if(!array[i].equals(other.array[i])){return false;}
        }
        return true;

    }
}
