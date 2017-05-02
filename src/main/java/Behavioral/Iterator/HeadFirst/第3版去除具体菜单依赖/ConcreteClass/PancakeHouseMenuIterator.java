package Behavioral.Iterator.HeadFirst.第3版去除具体菜单依赖.ConcreteClass;

import Behavioral.Iterator.HeadFirst.第1版餐厅合并菜单.MenuItem;
import Behavioral.Iterator.HeadFirst.第3版去除具体菜单依赖.BaseClass.Iterator;

import java.util.ArrayList;

/**
 * Created by sahoo on 16/5/14.
 */
public class PancakeHouseMenuIterator implements Iterator {

    ArrayList items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }

    public boolean hasNext() {
        if (items.size() <= position || items.get(position) == null)
            return false;
        return true;
    }

    public Object next() {
        MenuItem menuItem = (MenuItem) items.get(position);
        position = position + 1;
        return menuItem;
    }
}
