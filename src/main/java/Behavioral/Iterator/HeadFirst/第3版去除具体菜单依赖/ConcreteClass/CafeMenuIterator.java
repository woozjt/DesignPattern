package Behavioral.Iterator.HeadFirst.第3版去除具体菜单依赖.ConcreteClass;

import Behavioral.Iterator.HeadFirst.第1版餐厅合并菜单.MenuItem;
import Behavioral.Iterator.HeadFirst.第3版去除具体菜单依赖.BaseClass.Iterator;

import java.util.Hashtable;

/**
 * Created by sahoo on 16/5/15.
 */
public class CafeMenuIterator implements Iterator {
    Object[] menuItems;
    Hashtable items;
    int position = 0;

    public CafeMenuIterator(Hashtable items) {
        this.items = items;
        if (items.values().size() > 0)
            menuItems = items.values().toArray();
    }

    public boolean hasNext() {
        if (items.values().size() <= position ||  menuItems[position] == null) return false;
        return true;
    }

    public Object next() {
        MenuItem menuItem = (MenuItem) menuItems[position];
        position = position + 1;
        return menuItem;
    }
}
