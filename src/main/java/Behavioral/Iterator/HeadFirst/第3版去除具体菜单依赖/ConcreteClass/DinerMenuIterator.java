package Behavioral.Iterator.HeadFirst.第3版去除具体菜单依赖.ConcreteClass;

import Behavioral.Iterator.HeadFirst.第1版餐厅合并菜单.MenuItem;
import Behavioral.Iterator.HeadFirst.第3版去除具体菜单依赖.BaseClass.Iterator;

/**
 * Created by sahoo on 16/5/14.
 */
public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null)
            return false;
        return true;
    }

    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
}
