package LearnPattern.Bridge;

public class QuickSorter extends Sorter {

    public void sort(Object arr[]) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(Object[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(Object[] arr, int low, int high) {
        Object pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (((Comparable) arr[j]).compareTo(pivot) < 0) {
                i++;
                swapObject(arr, i, j);
            }
        }

        swapObject(arr, high, i + 1);
        return i + 1;
    }

    private void swapObject(Object[] arr, int a, int b) {
        Object tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
