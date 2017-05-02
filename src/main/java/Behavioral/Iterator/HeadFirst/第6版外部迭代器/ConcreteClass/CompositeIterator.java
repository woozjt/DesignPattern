package Behavioral.Iterator.HeadFirst.第6版外部迭代器.ConcreteClass;


import Behavioral.Iterator.HeadFirst.第6版外部迭代器.BaseClass.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by zhangjiantao on 2016/5/19.
 */
public class CompositeIterator implements Iterator {

    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    public boolean hasNext() {
        if (stack.empty())
            return false;

        Iterator iterator = (Iterator) stack.peek();
        if (!iterator.hasNext()) {
            stack.pop();
            return this.hasNext();
        }
        return true;
    }

    public MenuComponent next() {
        if (!hasNext())
            return null;

        Iterator iterator = (Iterator) stack.peek();
        MenuComponent menuComponent = (MenuComponent) iterator.next();
        stack.push(menuComponent.createIterator());
        return menuComponent;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
