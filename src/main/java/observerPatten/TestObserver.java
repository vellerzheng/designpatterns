package observerPatten;

public class TestObserver {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        CartoonObserver cartoonObserver = new CartoonObserver();
        NBAObserver nbaObserver = new NBAObserver();
        concreteSubject.addObserver(cartoonObserver);
        concreteSubject.addObserver(nbaObserver);

        concreteSubject.notifyAllObserver("老师来了");
        concreteSubject.notify(cartoonObserver,"老师来了，看卡通书会没收！");

    }

}
