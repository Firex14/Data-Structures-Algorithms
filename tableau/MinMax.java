package tableau;

public class MinMax {
    public static int[] getMinMax(int[] tab) {
        int min = tab[0];
        int max = tab[0];

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
            if (tab[i] < min) {
                min = tab[i];
            }
        }

        return new int[]{min, max};
    }

    public static int[] getTwoMax(int[] tab){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int el : tab) {
            if (el > max1) {
                max2 = max1;
                max1 = el;
            } else if (el > max2 && el < max1) {
                max2 = el;
            }
        }

        return new int[]{max1, max2};
    }
}
