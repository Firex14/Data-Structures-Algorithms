package tableau;

public class SortTab {

    public static int[] bubbleSort(int[] tab){
        int n = tab.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (tab[j] > tab[j+1]) {
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }
        return tab;
    }

    public static int[] selectionSort(int[] tab){
        int n = tab.length;
        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if (tab[j] < tab[min_index]) {
                    min_index = j;
                }
            }
            int temp = tab[i];
            tab[i] = tab[min_index];
            tab[min_index] = temp;
        }
        return tab;
    }

    public static int[] mergeSort(int[] tab){
        if (tab.length <= 1) {
            return tab;
        }

        int mid = tab.length / 2;
        int[] left = new int[mid];
        int[] right = new int[tab.length - mid];

        System.arraycopy(tab, 0, left, 0, mid);
        System.arraycopy(tab, mid, right, 0, tab.length - mid);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        // Comparer et fusionner les éléments de left et right dans merged
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }

        // Si il reste des éléments dans left
        while (i < left.length) {
            merged[k++] = left[i++];
        }

        // Si il reste des éléments dans right
        while (j < right.length) {
            merged[k++] = right[j++];
        }

        return merged;
    }

}
