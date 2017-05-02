package Behavioral.Iterator.HeadFirst.第4版系统迭代器.ConcreteClass;

import Behavioral.Iterator.HeadFirst.第1版餐厅合并菜单.MenuItem;
import Behavioral.Iterator.HeadFirst.第4版系统迭代器.BaseClass.Menu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by sahoo on 16/5/14.
 */
public class PancakeHouseMenu implements Menu{
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs,and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs,sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles,with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return  menuItems.iterator();
    }
}
