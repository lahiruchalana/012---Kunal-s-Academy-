package com.lahiru.generics;

import com.lahiru.interfaces.nested_interfaces.C;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }

        data[size] = num;
        size++;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        this.data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove() {
        int remove = data[--size];
        return remove;
    }

    public int get(int index) {
        return data[index];
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
        CustomArrayList arrayList = new CustomArrayList();

        arrayList.add(20);
        arrayList.add(12);
        arrayList.add(32);
        arrayList.add(23);

        System.out.println(arrayList);
        System.out.println(arrayList.remove()); // only change the size and when add again a values to array add to that new size to a new value
        System.out.println(arrayList.size());


        arrayList.add(30);
        arrayList.add(42);
        arrayList.add(45);
        arrayList.add(24);

        System.out.println(arrayList);

        arrayList.add(56);
        arrayList.add(44);
        arrayList.add(43);
        arrayList.add(67);

        System.out.println(arrayList);
        System.out.println(arrayList.remove());
        System.out.println(arrayList.size());
    }
}
