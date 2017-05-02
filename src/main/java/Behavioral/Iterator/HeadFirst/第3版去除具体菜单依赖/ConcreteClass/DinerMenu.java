package Behavioral.Iterator.HeadFirst.第3版去除具体菜单依赖.ConcreteClass;

import Behavioral.Iterator.HeadFirst.第1版餐厅合并菜单.MenuItem;
import Behavioral.Iterator.HeadFirst.第3版去除具体菜单依赖.BaseClass.Iterator;
import Behavioral.Iterator.HeadFirst.第3版去除具体菜单依赖.BaseClass.Menu;

/**
 * Created by sahoo on 16/5/14.
 */
public class DinerMenu implements Menu {

    static final  int MAX_ITEMS=6;
    int numberOfItems=0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems=new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT","(Fakin')Bacon with lettuce & tomato on whole wheat",true,2.99);
        addItem("BLT","Bacon with lettuce &  tomato on whole wheat",false,2.99);
        addItem("Soup of the day","Soup of the day, with a side of potato salad",false,3.29);
        addItem("Hotdog","A hot dog, with saurkraut, relish, onions, topped with cheese",false,3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        if (numberOfItems>=MAX_ITEMS){
            System.out.println("Sorry,menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems]=menuItem;
            numberOfItems=numberOfItems+1;
        }
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
