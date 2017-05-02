package Behavioral.Iterator.HeadFirst.第2版模式解决.Menu;

import Behavioral.Iterator.HeadFirst.第1版餐厅合并菜单.MenuItem;
import Behavioral.Iterator.HeadFirst.第2版模式解决.BaseClass.Iterator;
import Behavioral.Iterator.HeadFirst.第2版模式解决.ConcreteClass.PancakeHouseMenuIterator;

import java.util.ArrayList;

/**
 * Created by sahoo on 16/5/13.
 */
public class PancakeHouseMenu {
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
        return new PancakeHouseMenuIterator(menuItems);
    }

}
