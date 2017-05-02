package Behavioral.TemplateMethod.HeadFirst.用模板方法排序;

import java.util.Objects;

/**
 * Created by zhangjiantao on 2016/5/3.
 */
public class BaseSort {

    public static void sortable(Object[] dest) {
        Object[] src = dest.clone();
        mergeSortable(src, dest, 0, dest.length);
    }

    private static void mergeSortable(Object[] src, Object[] dest, int low, int high) {
        for (int i = low; i < high; i++) {
            for (int j = i;
                 j > low && ((Comparable) dest[j - 1]).compareTo(dest[j]) > 0;
                 j--) {
                swap(dest, j, j - 1);
            }
        }
    }

    private static void swap(Object[] dest, int j, int i) {

    }
}
