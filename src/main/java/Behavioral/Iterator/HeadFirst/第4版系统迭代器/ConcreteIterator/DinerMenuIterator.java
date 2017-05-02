package Behavioral.Iterator.HeadFirst.第4版系统迭代器.ConcreteIterator;

import Behavioral.Iterator.HeadFirst.第1版餐厅合并菜单.MenuItem;

import java.util.Iterator;

/**
 * Created by sahoo on 16/5/14.
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] list) {
        this.items = list;
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

    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if (items[position - 1] != null) {
            for (int i = position - 1; i < (items.length - 1); i++) {
                items[i] = items[i + 1];
            }
            items[items.length - 1] = null;
        }

    }
}
