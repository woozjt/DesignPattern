package Structural.Decorator.YanMo.CalculationOfSalary.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangjiantao on 2016/4/15.
 */
public class TempDB {
    public TempDB() {
    }

    public static Map<String, Double> mapMonthSaleMoney = new HashMap<String, Double>();

    static {
        mapMonthSaleMoney.put("张三",10000.0);
        mapMonthSaleMoney.put("李四",20000.0);
        mapMonthSaleMoney.put("王五",30000.0);
    }
}
