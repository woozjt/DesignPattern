package Behavioral.TemplateMethod.HeadFirst.咖啡和茶.第1版抽取共同的部分放入Baseclass.BaseClass;

/**
 * Created by sahoo on 16/4/25.
 */
public abstract class CaffeineBeverage {

    public abstract void prepareRecipe();

    public void boilWater(){
        System.out.println("Boiling water");
    }

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

}
