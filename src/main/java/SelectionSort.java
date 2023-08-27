import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SelectionSort {

    private static List<Integer> list = Arrays.asList(64, 25, 12, 22, 11);

    public static void init() {
        showHeader();
        for (int j = 0; j < list.size(); j++) {
            List<Integer> tmpList = new ArrayList<>();
            for (int k = j; k < list.size(); k++) {
                tmpList.add(list.get(k));
            }
            int min = Collections.min(tmpList);
            int pos = list.indexOf(min);
            if(!list.get(j).equals(list.get(pos))) {
                swap(pos, j);
            }
        }
    }

    private static void swap(int pos, int i) {
        int swap = list.get(i);
        list.set(i,list.get(pos));
        list.set(pos, swap);
        System.out.println(list);
    }

    private static void showHeader() {
        System.out.println("Initial Array");
        System.out.println("--------------------");
        System.out.println(list);
        System.out.println("--------------------");
    }
}
