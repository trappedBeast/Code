package com.newStart2019.day0403;

import java.util.Arrays;
import java.util.Collection;

/**
 * @ClassName ArrayListProy
 * @Auther trappedBeast
 * @Date 2019/4/4 14:55
 * @Version 1.0
 * @Description TODO
 **/
public class ArrayListProy<E> {
    private static final Object[] EMPTY_ELEMENTDATA = {};
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    transient Object[] elementData;
    private int size;
    public ArrayListProy(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);
        }
    }

    public ArrayListProy() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }
    public ArrayListProy(Collection<? extends E> c) {
        elementData = c.toArray();
        if ((size = elementData.length) != 0) {
            // c.toArray might (incorrectly) not return Object[] (see 6260652)
            if (elementData.getClass() != Object[].class)
                elementData = Arrays.copyOf(elementData, size, Object[].class);
        } else {
            // replace with empty array.
            this.elementData = EMPTY_ELEMENTDATA;
        }
    }

    public int size() {
        return size;
    }
}
    