package Behavioral.Observer.HeadFirst.第2版实现气象站.BaseClass;

/**
 * Created by sahoo on 16/4/26.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}

