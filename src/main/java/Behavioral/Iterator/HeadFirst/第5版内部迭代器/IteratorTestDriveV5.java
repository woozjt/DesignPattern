package Behavioral.Iterator.HeadFirst.第5版内部迭代器;

import Behavioral.Iterator.HeadFirst.第5版内部迭代器.BaseClass.MenuComponent;
import Behavioral.Iterator.HeadFirst.第5版内部迭代器.Client.Waitress;
import Behavioral.Iterator.HeadFirst.第5版内部迭代器.ConcreteClass.Menu;
import Behavioral.Iterator.HeadFirst.第5版内部迭代器.ConcreteClass.MenuItem;

/**
 * Created by zhangjiantao on 2016/5/19.
 */
public class IteratorTestDriveV5 {
    public static void start() {
        System.out.println("IteratorTestDriveV5.start");
        MenuComponent allMenus = getMenuComponent();
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }

    private static MenuComponent getMenuComponent() {
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfase", "Pancakes with fried eggs, sausage", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes with scrambled eggs, and toast", true, 3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59));

        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));
        dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat BLT", true, 2.99));
        dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
        dinerMenu.add(new MenuItem("Soup of the day", "A bowl of the soup of the day, with a side of potato salad", false, 3.29));
        dinerMenu.add(new MenuItem("Hotdog", "A hot dog , with saurkraut, relish, onions, topped with cheese", false, 3.05));
        dinerMenu.add(new MenuItem("Steamed Veggies and Brown Rice", "Steamed vegetables over brown rice", true, 3.99));

        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla ice cream", true, 1.59));
        dessertMenu.add(new MenuItem("Cheesecake", "Apple pie with a flakey crust, topped with vanilla ice cream", true, 1.59));
        dessertMenu.add(new MenuItem("Sorbet", "A scoop of raspberry and a scoop of lime", true, 1.89));

        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Pancakes with scrambled eggs, and toast", true, 2.99));
        cafeMenu.add(new MenuItem("Soup of the day", "Pancakes with scrambled eggs, and toast", true, 2.99));
        cafeMenu.add(new MenuItem("Burrito", "Pancakes with scrambled eggs, and toast", true, 2.99));

        return allMenus;
    }

}
