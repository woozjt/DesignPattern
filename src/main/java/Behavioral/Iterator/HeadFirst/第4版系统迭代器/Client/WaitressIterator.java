package Behavioral.Iterator.HeadFirst.第4版系统迭代器.Client;

import Behavioral.Iterator.HeadFirst.第1版餐厅合并菜单.MenuItem;
import Behavioral.Iterator.HeadFirst.第4版系统迭代器.BaseClass.Menu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zhangjiantao on 2016/5/19.
 */
public class WaitressIterator {
    ArrayList menus;

    public WaitressIterator(ArrayList menus) {
        this.menus = menus;
    }

    private void printMenu(){
        Iterator menuIterator=menus.iterator();
        while (menuIterator.hasNext()){
            Menu menu=(Menu)menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()){
            MenuItem menuItem=(MenuItem)iterator.next();
            System.out.print(menuItem.getName()+" ");
            System.out.print(menuItem.getPrice()+" ");
            System.out.println(menuItem.getDescription());
        }
    }
}
