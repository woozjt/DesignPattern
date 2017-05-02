package Behavioral.TemplateMethod.HeadFirst.咖啡和茶.第2版进一步抽取算法骨架.BaseClass;

/**
 * Created by sahoo on 16/4/26.
 */
public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
