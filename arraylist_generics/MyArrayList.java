package arraylist_generics;

import java.util.NoSuchElementException;

public class GenericArrayList<T> {
    private final int INITIAL_SIZE = 10;

    private Object[] objects;
    private int index;
    private int size;


    public GenericArrayList() {
        objects = new Object[INITIAL_SIZE];
        size = INITIAL_SIZE;
    }

    public T get(int i) {
        if (i > index - 1) {
            System.out.println("ArrayIndexOutOfBound");
        }
        if (i < 0) {
            System.out.println("Negative Value");
        }
        return (T) objects[i];
    }

    public void add(T obj) {
        if (index == size - 1) {
            duplicateSize();
        }
        objects[index] = obj;
        index++;
    }

    public int size() {
        return index;
    }

    public void remove(T obj) {
        boolean flag = false;
        for (int i = 0; i < index; i++) {
            if (flag) {
                break;
            }
            if (objects[i].equals(obj)) {
                for (int j = i; j < index - 1; j++) {
                    objects[j] = objects[j + 1];
                    flag = true;
                }
            }
        }
        index--;
    }

    public boolean contains(T obj) {
        for (int i = 0; i < index; i++) {
            if (objects[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }
    private void duplicateSize() {
        size = size * 2;
        Object newArr[] = new Object[size];
        for (int i = 0; i < objects.length; i++) {
            newArr[i] = objects[i];
        }
        objects = newArr;
    }


}
