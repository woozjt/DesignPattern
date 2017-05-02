package Behavioral.TemplateMethod.HeadFirst.用模板方法排序;

/**
 * Created by zhangjiantao on 2016/5/3.
 */

public class DuckSort implements Comparable {
    String name;
    int weight;

    public DuckSort(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + " weighs " + weight;
    }



    public int compareTo(Object object) {

        DuckSort otherDuck = (DuckSort)object;

        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else { // this.weight > otherDuck.weight
            return 1;
        }
    }
}

