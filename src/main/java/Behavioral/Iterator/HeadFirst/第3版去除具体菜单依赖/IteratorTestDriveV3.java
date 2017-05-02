package Behavioral.Iterator.HeadFirst.第3版去除具体菜单依赖;

import Behavioral.Iterator.HeadFirst.第3版去除具体菜单依赖.Client.Waitress;
import Behavioral.Iterator.HeadFirst.第3版去除具体菜单依赖.ConcreteClass.CafeMenu;
import Behavioral.Iterator.HeadFirst.第3版去除具体菜单依赖.ConcreteClass.DinerMenu;
import Behavioral.Iterator.HeadFirst.第3版去除具体菜单依赖.ConcreteClass.PancakeHouseMenu;

/**
 * Created by sahoo on 16/5/14.
 */
public class IteratorTestDriveV3 {
    public static void start(){
        System.out.println("IteratorTestDriveV3");

        PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
        DinerMenu dinerMenu=new DinerMenu();
        CafeMenu cafeMenu=new CafeMenu();

        Waitress waitress=new Waitress(pancakeHouseMenu,dinerMenu,cafeMenu);
        waitress.printMenu();
    }
}
