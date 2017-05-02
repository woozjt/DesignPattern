package Behavioral.Iterator.HeadFirst.第5版内部迭代器.Client;

import Behavioral.Iterator.HeadFirst.第5版内部迭代器.BaseClass.MenuComponent;

/**
 * Created by zhangjiantao on 2016/5/19.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus){
        this.allMenus =allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }
}
