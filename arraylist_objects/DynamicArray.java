package arraylist;

public class DynamicArray {

    private final int INITIAL_SIZE = 10;

    private Object[] objects;
    private int index;
    private int size;


    public DynamicArray() {
        objects = new Object[INITIAL_SIZE];
        size = INITIAL_SIZE;
    }

    public void add(Object obj) {
        if (index == size - 1) {
            duplicateSize();
        }
        objects[index] = obj;
        index++;

    }

    public int size() {
        return index;
    }

    private void duplicateSize() {
        size = size * 2;
        Object newArr[] = new Object[size];
        for (int i = 0; i < objects.length; i++) {
            newArr[i] = objects[i];
        }
        objects = newArr;
    }

    public Object get(int i) {
        if (i > index - 1) {
            System.out.println("ArrayIndexOutOfBound");
        }
        if (i < 0) {
            System.out.println("Negative Value");
        }
        if (objects[i] instanceof Integer) {
            return (Integer) objects[i];
        } else if (objects[i] instanceof String) {
            return (String) objects[i];
        } else if (objects[i] instanceof Byte) {
            return (Byte) objects[i];
        } else if (objects[i] instanceof Short) {
            return (Short) objects[i];
        } else if (objects[i] instanceof Character) {
            return (Character) objects[i];
        } else if (objects[i] instanceof Long) {
            return (Long) objects[i];
        } else if (objects[i] instanceof Float) {
            return (Float) objects[i];
        } else if (objects[i] instanceof Double) {
            return (Double) objects[i];
        }
        return objects[i];
    }


    public int indexOf(Object object) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].equals(object)) {
                return i;
            }
        }
        System.out.println("NoSuchElement");
        return -1;

    }

    public boolean contains(Object object) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].equals(object)) {
                return true;
            }
        }
        return false;
    }

    public void remove(int i) {
        if (i > index - 1) {
            System.out.println(("ArrayIndexOutOfBound"));
        }
        if (i < 0) {
            System.out.println(("Negative Value"));
        }
        for (int x = i; x < objects.length - 1; x++) {
            objects[x] = objects[x++];
        }
        index--;
    }
}
