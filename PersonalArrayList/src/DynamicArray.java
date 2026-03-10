public class DynamicArray<E> {
    private E[] array;
    private int size;
    private int capacity;


    public DynamicArray(){ //default constructor
        capacity = 10;
        array = (E[]) new Object[capacity];
        size = 0;
    }
    public DynamicArray(int capacity){
        this.capacity = capacity;
        array = (E[]) new Object[capacity];
        size = 0 ;
    }
    public boolean isEmpty(){
        if(size == 0){return true;} //if size is 0 array is empty
        return false;

    }
    public int size(){
        return size;
    }
    public void doubleCapacity(){
        capacity *= 2;
        E[] newArray = (E[]) new Object[capacity];
        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }
    public void halveCapacity(){
        if(capacity / 2 >= size) {
            capacity /= 2;
            E[] newArray = (E[]) new Object[capacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }
    public void addLast(E e){
        if(size == capacity){doubleCapacity();}
        array[size] = e;
        size++;
    }
    public void addFirst(E e){
        if(size == capacity){doubleCapacity();}
        for(int i = size; i > 0; i--){
            array[i] = array[i - 1];
        }
        array[0] = e;
        size++;
    }
    public void insertAt(int i, E e){
        if(size == capacity){doubleCapacity();}
        if(i < 0 || i > size){
            System.out.println("index is out of bounds");
        }else {
            for (int j = size; j > i; j--) {
                array[j] = array[j - 1];
            }
            array[i] = e;
            size++;
        }
    }

}