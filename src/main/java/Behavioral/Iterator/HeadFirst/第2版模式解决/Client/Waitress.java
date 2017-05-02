package Behavioral.Iterator.HeadFirst.第2版模式解决.Client;

import Behavioral.Iterator.HeadFirst.第1版餐厅合并菜单.MenuItem;
import Behavioral.Iterator.HeadFirst.第2版模式解决.BaseClass.Iterator;
import Behavioral.Iterator.HeadFirst.第2版模式解决.Menu.*;

/**
 * Created by sahoo on 16/5/13.
 */
public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator pancakeIterator=pancakeHouseMenu.createIterator();
        Iterator dinerIterator=dinerMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()){
            MenuItem menuItem=(MenuItem)iterator.next();
            System.out.print(menuItem.getName()+" ");
            System.out.print(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }
}
