package Behavioral.TemplateMethod.HeadFirst.咖啡和茶.第1版抽取共同的部分放入Baseclass.ConcreteClass;

import Behavioral.TemplateMethod.HeadFirst.咖啡和茶.第1版抽取共同的部分放入Baseclass.BaseClass.CaffeineBeverage;

/**
 * Created by sahoo on 16/4/25.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    public void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void brewCoffeeGrinds(){
        System.out.println("Dripping Coffee through filter");
    }

    public void addSugarAndMilk(){
        System.out.println("Adding Sugar and Milk");
    }
}
