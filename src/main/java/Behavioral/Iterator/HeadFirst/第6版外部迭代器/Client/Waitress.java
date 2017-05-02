package Behavioral.Iterator.HeadFirst.第6版外部迭代器.Client;


import Behavioral.Iterator.HeadFirst.第6版外部迭代器.BaseClass.MenuComponent;

import java.util.Iterator;

/**
 * Created by zhangjiantao on 2016/5/20.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus){
        this.allMenus =allMenus;
    }

    public void printMenu() {
        allMenus.print();
        Iterator compositeIterator = allMenus.createIterator();
        while (compositeIterator.hasNext()) {
            MenuComponent component = (MenuComponent) compositeIterator.next();
            component.print();
        }
    }

    public void printVegetarianMenu(){
        Iterator iterator=allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n------");
        while (iterator.hasNext()){
            MenuComponent menuComponent=(MenuComponent)iterator.next();
            try {
                if (menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e){}

        }
    }
}
