package code._4_student_effort.Challenge9;

import java.util.Arrays;

public class MySetCC<T> implements MySet<T> {

    private Object[] array = new Object[0];

    @Override
    public void add(T e) {
        if (!contains(e)) {
            array = Arrays.copyOf(array, array.length + 1);
            array[array.length - 1] = e;
        }
    }

    @Override
    public void remove(T e) {
        Object[] newArray = new Object[0];
        for (Object it: array) {
            if (!it.equals(e)) {
                newArray = Arrays.copyOf(newArray, newArray.length+1);
                newArray[newArray.length-1] = it;
            }
        }

        array = newArray;
    }

    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public void set(int index, T e) {
        if (!contains(e)) {
            this.array[index] = e;
        }
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean contains(T e) {
        for (Object it : array) {
            if (it.equals(e)) {
                return true;
            }
        }

        return false;
    }
}
