package tableau;

public class MoveZeroToEnd {
    public static int[] moveZeroToEnd(int[] tab){
        int index = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != 0){
                tab[index] = tab[i];
                index++;
            }
        }

        for (int i = index; i < tab.length; i++) {
            tab[i] = 0;
        }
        return tab;
    }
}
