package Behavioral.TemplateMethod.HeadFirst.用模板方法排序;

import java.util.Arrays;

/**
 * Created by zhangjiantao on 2016/5/3.
 */
public class DuckSortTestDrive {

    public static void main(String[] args) {
        DuckSort[] ducks = {
                new DuckSort("Daffy", 8),
                new DuckSort("Dewey", 2),
                new DuckSort("Howard", 7),
                new DuckSort("Louie", 2),
                new DuckSort("Donald", 10),
                new DuckSort("Huey", 2)
        };

        System.out.println("Before sorting:");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting:");
        display(ducks);
    }

    public static void display(DuckSort[] ducks) {
        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }
}
