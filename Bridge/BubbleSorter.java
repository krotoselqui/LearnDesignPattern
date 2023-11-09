package LearnPattern.Bridge;

public class BubbleSorter extends SortImple {
    public void sort(Object[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                // Compare adjacent elements and swap if they are in the wrong order
                if (((Comparable) arr[i - 1]).compareTo(arr[i]) > 0) {
                    swapObject(arr, i - 1, i);
                    swapped = true;
                }
            }
            // Reduce the size of the array to avoid comparing sorted elements
            n--;
        } while (swapped);
    }

    private void swapObject(Object[] arr, int a, int b) {
        Object tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
