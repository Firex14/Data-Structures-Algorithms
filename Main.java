import tableau.MinMax;
import tableau.MoveZeroToEnd;
import tableau.ReverseTab;
import tableau.SortTab;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] tab = {1,0,8,18,0,21,9,45,2,3,0,-5};

        System.out.println("Initial Array:" + Arrays.toString(tab));

        int[] zeroToEndTab = MoveZeroToEnd.moveZeroToEnd(tab);
        System.out.println("Move Zero to end array:" + Arrays.toString(zeroToEndTab));


        int[] minMax = MinMax.getMinMax(tab);
        System.out.println("Minimum value: " + minMax[0]);
        System.out.println("Maximum value: " + minMax[1]);


        int[] reversed = ReverseTab.reverseTab(tab);
        System.out.println("Reversed array:" + Arrays.toString(reversed));

        int[] bubbleSortedTab = SortTab.bubbleSort(tab);
        System.out.println("Bubble Sorted array:" + Arrays.toString(bubbleSortedTab));

        int[] selectionSortedTab = SortTab.selectionSort(tab);
        System.out.println("Selection Sorted array:" + Arrays.toString(selectionSortedTab));


        int[] mergeSortedTab = SortTab.mergeSort(tab);
        System.out.println("merge Sorted array:" + Arrays.toString(mergeSortedTab));


        int[] twoMax = MinMax.getTwoMax(tab);
        System.out.println("Two max value:" + Arrays.toString(twoMax));

    }
}
