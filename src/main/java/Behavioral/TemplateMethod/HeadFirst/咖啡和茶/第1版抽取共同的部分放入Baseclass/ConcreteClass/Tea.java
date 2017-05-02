package Behavioral.TemplateMethod.HeadFirst.咖啡和茶.第1版抽取共同的部分放入Baseclass.ConcreteClass;

import Behavioral.TemplateMethod.HeadFirst.咖啡和茶.第1版抽取共同的部分放入Baseclass.BaseClass.CaffeineBeverage;

/**
 * Created by sahoo on 16/4/26.
 */
public class Tea extends CaffeineBeverage {
    @Override
    public void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void steepTeaBag(){
        System.out.println("Steeping the tea");
    }

    public void addLemon(){
        System.out.println("Adding Lemon");
    }
}
