package tableau;

public class ReverseTab {
    public static int[] reverseTab(int[] tab) {
        int left = 0;
        int right = tab.length - 1;

        while (left < right) {
            int temp = tab[left];
            tab[left] = tab[right];
            tab[right] = temp;

            left++;
            right--;
        }
        return tab;
    }
}
