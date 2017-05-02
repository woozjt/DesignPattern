package Structural.Adapter.HeadFirst.第1版火鸡适配鸭子;

import Structural.Adapter.HeadFirst.第1版火鸡适配鸭子.Adapter.DuckAdapter;
import Structural.Adapter.HeadFirst.第1版火鸡适配鸭子.Adapter.TurkeyAdapter;
import Structural.Adapter.HeadFirst.第1版火鸡适配鸭子.Duck.BaseDuck;
import Structural.Adapter.HeadFirst.第1版火鸡适配鸭子.Duck.MallardDuck;
import Structural.Adapter.HeadFirst.第1版火鸡适配鸭子.Turkey.BaseTurkey;
import Structural.Adapter.HeadFirst.第1版火鸡适配鸭子.Turkey.WildTurkey;

/**
 * Created by sahoo on 16/5/11.
 */
public class DuckTestDrive {
    public static void start(){
        MallardDuck duck=new MallardDuck();
        WildTurkey turkey=new WildTurkey();

        BaseDuck turkeyAdapter = new TurkeyAdapter(turkey);
        BaseTurkey duckAdapter=new DuckAdapter(duck);

        System.out.println("The Turkey says......");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says......");
        duck.quack();
        duck.fly();

        System.out.println("\nThe TurkeyAdapter says......");
        testDuck(turkeyAdapter);

        System.out.println("\nThe DuckAdapter says......");
        testTurkey(duckAdapter);
    }

    private static void testDuck(BaseDuck duck) {
        duck.quack();
        duck.fly();
    }

    private static void testTurkey(BaseTurkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}
