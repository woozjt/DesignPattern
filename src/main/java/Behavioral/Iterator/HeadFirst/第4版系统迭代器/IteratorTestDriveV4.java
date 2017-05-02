package Behavioral.Iterator.HeadFirst.第4版系统迭代器;

import Behavioral.Iterator.HeadFirst.第4版系统迭代器.Client.Waitress;
import Behavioral.Iterator.HeadFirst.第4版系统迭代器.ConcreteClass.CafeMenu;
import Behavioral.Iterator.HeadFirst.第4版系统迭代器.ConcreteClass.DinerMenu;
import Behavioral.Iterator.HeadFirst.第4版系统迭代器.ConcreteClass.PancakeHouseMenu;

/**
 * Created by sahoo on 16/5/14.
 */
public class IteratorTestDriveV4 {
    public static void start(){
        System.out.println("IteratorTestDriveV4");

        PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
        DinerMenu dinerMenu=new DinerMenu();
        CafeMenu cafeMenu=new CafeMenu();

        Waitress waitress=new Waitress(pancakeHouseMenu,dinerMenu,cafeMenu);
        waitress.printMenu();
    }
}
