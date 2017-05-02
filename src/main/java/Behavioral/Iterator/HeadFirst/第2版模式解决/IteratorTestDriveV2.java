package Behavioral.Iterator.HeadFirst.第2版模式解决;

import Behavioral.Iterator.HeadFirst.第2版模式解决.Menu.DinerMenu;
import Behavioral.Iterator.HeadFirst.第2版模式解决.Menu.PancakeHouseMenu;
import Behavioral.Iterator.HeadFirst.第2版模式解决.Client.Waitress;

/**
 * Created by sahoo on 16/5/14.
 */
public class IteratorTestDriveV2 {
    public static void start(){
        System.out.println("IteratorTestDriveV2");

        PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
        DinerMenu dinerMenu=new DinerMenu();

        Waitress waitress=new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenu();
    }
}
