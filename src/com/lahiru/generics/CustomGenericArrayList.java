package com.lahiru.generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }

        data[size] = num;
        size++;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        this.data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T remove = (T)(data[--size]);
        return remove;
    }

    public T get(int index) {
        return (T)(data[index]);
    }

    public int size() {
        return data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenericArrayList<String> arrayList = new CustomGenericArrayList<>();

        arrayList.add("20");
        arrayList.add("12");
        arrayList.add("32.5f");
        arrayList.add("23");

        System.out.println(arrayList);
        System.out.println(arrayList.remove()); // only change the size and when add again a values to array add to that new size to a new value
        System.out.println(arrayList.size());


        arrayList.add("30");
        arrayList.add("42");
        arrayList.add("45");
        arrayList.add("24");

        System.out.println(arrayList);

        arrayList.add("56");
        arrayList.add("44");
        arrayList.add("43");
        arrayList.add("67");

        System.out.println(arrayList);
        System.out.println(arrayList.remove());
        System.out.println(arrayList.size());
    }
}
