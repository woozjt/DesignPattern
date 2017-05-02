package Behavioral.Iterator.HeadFirst.第6版外部迭代器.ConcreteClass;

import java.util.Iterator;

/**
 * Created by zhangjiantao on 2016/5/19.
 */
public class NullIterator implements Iterator {
    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
