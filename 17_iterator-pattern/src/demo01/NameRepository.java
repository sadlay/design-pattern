package demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 14:24 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class NameRepository implements Container<String> {
    private static final int DEFAULT_CAPACITY = 10;
    public static final String[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA={};
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    private String[] names;

    private int size;

    public NameRepository() {
        this.names=DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    public void add(String name){
        ensureCapacityInternal(size + 1);
        names[size++]=name;
    }
    public String get(int index){
        if (index >= size){
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }
        return names[index];
    }
    public int size(){
        return size;
    }

    private void ensureCapacityInternal(int minCapacity) {
        if (names == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        }

        ensureExplicitCapacity(minCapacity);
    }

    private void ensureExplicitCapacity(int minCapacity) {
        // overflow-conscious code
        if (minCapacity - names.length > 0)
            grow(minCapacity);
    }

    private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = names.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        // minCapacity is usually close to size, so this is a win:
        names = Arrays.copyOf(names, newCapacity);
    }

    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) // overflow
            throw new OutOfMemoryError();
        return (minCapacity > MAX_ARRAY_SIZE) ? Integer.MAX_VALUE : MAX_ARRAY_SIZE;
    }

    @Override
    public Iterator<String> getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String>{
        int cursor;

        @Override
        public boolean hasNext() {
            return  cursor != size;
        }

        @Override
        public String next() {
            int i = cursor;
            if (i >= size)
                throw new NoSuchElementException();
            String[] names = NameRepository.this.names;
            if (i >= names.length)
                throw new ConcurrentModificationException();
            cursor = i + 1;
            return names[i];
        }
    }
}
