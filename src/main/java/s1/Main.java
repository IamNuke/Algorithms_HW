package s1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = new Random().nextInt(100);
        }
        printArray(array);
        sort(array);
        System.out.println();
        printArray(array);

    }

    public static void sort(int[] array)
    {

        for (int i = array.length/2 - 1; i >= 0 ; i--) {
            heapify(array, array.length, i);
        }
        for (int i = array.length - 1; i >= 0 ; i--) {


        }

    }

    public static void heapify(int[] array, int heapSize, int rootIndex)
    {
        int maxItem = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < heapSize && array[leftChild] > array[maxItem])
            maxItem = leftChild;
        if (rightChild < heapSize && array[rightChild] > array[maxItem])
            maxItem = rightChild;

        if (maxItem != rootIndex){
            int temp = array[rootIndex];
            array[rootIndex] = array[maxItem];
            array[maxItem] = temp;

            heapify(array, heapSize, maxItem);
        }
    }

    public static void printArray(int[] array)
    {
        for (int j : array) {
            System.out.printf("%3d", j);
        }

    }
}



