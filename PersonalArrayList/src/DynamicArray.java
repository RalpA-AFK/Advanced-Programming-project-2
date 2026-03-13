public class DynamicArray<E> {
    protected E[] baseArray;
    protected int size;
    protected int capacity;

    public DynamicArray() { //default constructor
        capacity = 10;
        baseArray = (E[]) new Object[capacity];
        size = 0;
    }
    public DynamicArray(int capacity) { //when capacity is declared this runs
        this.capacity = capacity;
        baseArray = (E[]) new Object[capacity];
        size = 0;
    }
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } //if size is 0 baseArray is empty
        return false;

    }
    public int size() { // just returns the size of the baseArray not starting from 0
        return size;
    }
    public void doubleCapacity() {
        capacity *= 2;
        E[] newArray = (E[]) new Object[capacity];
        for (int i = 0; i < size; i++) { // cycles through the baseArray and stores each value into the new baseArray
            newArray[i] = baseArray[i];
        }
        baseArray = newArray; // set baseArray to the new baseArray that has double capacity
    }
    public void halveCapacity() {
        if (capacity / 2 >= size) { // the capacity should still be bigger than baseArray size
            capacity /= 2;
            E[] newArray = (E[]) new Object[capacity];
            for (int i = 0; i < size; i++) { //cycles through the baseArray and stores
                newArray[i] = baseArray[i];  //each value into the new baseArray
            }
            baseArray = newArray;
        }
    }
    public void addLast(E e) {
        if (size == capacity) { // when adding if the baseArray is to small we double its capacity
            doubleCapacity();
        }
        baseArray[size] = e; // input the new variable at the end
        size++;          // expand baseArray
    }
    public void addFirst(E e) {
        if (size == capacity) { // when adding if the baseArray is to small we double its capacity
            doubleCapacity();
        }
        for (int i = size; i > 0; i--) { //starting from the tail of the baseArray it goes to the head
            baseArray[i] = baseArray[i - 1];     //and shifts each value downwards
        }
        baseArray[0] = e; // input the new variable at the head
        size++;       // expand baseArray
    }
    public void insertAt(int i, E e) {
        if (size == capacity) { // when adding if the baseArray is to small we double its capacity
            doubleCapacity();
        }
        if (i < 0 || i > size) { // checks to see if the index given exists within the baseArray
            System.out.println("index is out of bounds");
        } else {
            for (int j = size; j > i; j--) { // starting from the tail we go towards the index
                baseArray[j] = baseArray[j - 1]; // given and shift the values downwards
            }
            baseArray[i] = e; // input the new variable at the index given
            size++;       // expand baseArray
        }
    }
    public E removeFirst() {
        if (size == 0) { // if the baseArray is empty we return null as nothing can be removed
            return null;
        }
        E firstNum = baseArray[0]; // store the first number to return it
        for (int i = 0; i < size - 1; i++) { // shift the baseArray
            baseArray[i] = baseArray[i + 1]; // the plus 1 ignores the first index when restoring numbers
        }
        size--; //contract baseArray
        return firstNum;
    }
    public E removeLast() {
        if (size == 0) { // if the baseArray is empty we return null as nothing can be removed
            return null;
        }
        E lastNum = baseArray[size - 1]; // the baseArray is capped at size - 1 not size
        size--;
        return lastNum;
    }
    public E removeAt(int i) {
        if (size == 0) {return null;} // if the baseArray is empty we return null as nothing can be removed
        if (i < 0 || i >= size) { // checks to see if the index given exists within the baseArray
            System.out.println("index is out of bounds");
        } else {
            E removeNum = baseArray[i];
            for (int j = i; j < size - 1; j++) { // left shift
                baseArray[j] = baseArray[j + 1];


            }
            size--; // contract baseArray
            return removeNum;
        }
        return null; //placeholder return outside of loop so that the code produces no error
    }
    public E getFirst(){
        if(size == 0){return null;}// if the baseArray is empty we return null
        return baseArray[0];
    }
    public E get(int i){
        if(size == 0){return null;} // if the baseArray is empty we return null
        if (i < 0 || i >= size) { // checks to see if the index given exists within the baseArray
           System.out.println("index is out of bounds");
           return null;
        }
        return baseArray[i];
    }
    public E set(int i, E newElem){
        if(size == 0){return null;} // if the baseArray is empty we return null
        if (i < 0 || i >= size) {   // checks to see if the index given exists within the baseArray
            System.out.println("index is out of bounds");
            return null;
        }
        E oldElem = baseArray[i];
        baseArray[i] = newElem; //assigns new element to old element index
        return oldElem; //prints out element that was their previously
    }
    public Object[] toArray(){
        Object[] newArray = new Object[size];
        for (int i = 0; i < size; i++) { // newArray takes the baseArrays elements
            newArray[i] = baseArray[i];      // but does not change baseArray
        }
        return newArray;
    }
    public void trimToSize(){ // capacity = size
        capacity = size;
        E[] newArray = (E[]) new Object[capacity];
        for(int i = 0; i < size; i++){ //copy's baseArray to newArray to update capacity
            newArray[i] = baseArray[i];
        }
        baseArray = newArray;
    }
    public DynamicArray<E> clone(){ //makes a new dynamicArray with same values as the base one
        DynamicArray<E> newList = new DynamicArray<E>(capacity);
        for(int i = 0; i < size; i++){ //copy's baseArray to the newList's baseArray
            newList.baseArray[i] = baseArray[i];
        }
        newList.capacity = capacity; // copy capacity
        newList.size = size;         // copy size
        return newList;              //return list
    }
    public void clear(){
        for(int i = 0; i < size; i++){ // clears baseArray contents
            baseArray[i] = null;
        }
        size = 0;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder("["); // start string with [
        for(int i = 0; i < size; i++){ // this will add each value in the array into
            sb.append(baseArray[i]);   // the string with a comma between each
            if(i < size-1){
                sb.append(",");
            }
        }
        sb.append("]"); // end string with ]
        return sb.toString(); //returns complete String

    }
    public boolean equals(Object o){ // compares this DynamicArray to an object for equality
        if(this == o){return true;} // if both references point to the same address they are equal
        if(o == null || !(o instanceof DynamicArray)){return false;} // if 0 is null or not a DynamicArray, they're not equal
        DynamicArray<E> other = (DynamicArray<E>) o; // cast o to dynamicArray for access to its contents
        if(size != other.size){return false;} // compares size, if not the same not equal
        for(int i = 0; i < size; i++){ // compares every element and determines if they are equal
            if(!baseArray[i].equals(other.baseArray[i])){return false;}
        }
        return true; // all elements equal

    }
}
