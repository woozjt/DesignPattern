package Behavioral.TemplateMethod.HeadFirst.咖啡和茶.第3版对模板方法进行挂钩.BaseClass;

/**
 * Created by sahoo on 16/4/26.
 */
public abstract class CaffeineBeverageWithHook {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiments();
        }
    }

    public abstract void brew();

    public abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public boolean customerWantsCondiments(){
        return true;
    }
}
