package Behavioral.Iterator.HeadFirst.第3版去除具体菜单依赖.ConcreteClass;

import Behavioral.Iterator.HeadFirst.第1版餐厅合并菜单.MenuItem;
import Behavioral.Iterator.HeadFirst.第3版去除具体菜单依赖.BaseClass.Iterator;
import Behavioral.Iterator.HeadFirst.第3版去除具体菜单依赖.BaseClass.Menu;

import java.util.Hashtable;

/**
 * Created by sahoo on 16/5/15.
 */
public class CafeMenu implements Menu {
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99);
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
        addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator createIterator() {
        return new CafeMenuIterator(menuItems);
    }
}
