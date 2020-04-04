package together;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayList<E> {
    private Object[] elementData;

    private int size;

    public MyArrayList() {
        this.elementData = new Object[10];
    }

    /*public MyArrayList(E e) {
        this.elementData = new Object[10];
    }*/

    public boolean add(E e) {
        if(this.size>=this.elementData.length) {
            Object[] temp = new Object[elementData.length*2];
            System.arraycopy(elementData,0,temp,0,size);
            //              Arrays.copyOf(elementData,0,temp.getClass());
            elementData = temp;
        }
        elementData[size++] = e;
        return true;
    }

    public Object get(int index) {
        return elementData[index];
    }

    public int length() {
        return size;
    }
}
