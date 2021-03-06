package structuralPattern.decooratorPattern;

public class MilkFoamDecorator extends Decorator {

    /**
     * 通过组合的方式把Coffee对象传递进来
     *
     * @param coffee
     */
    public MilkFoamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return mCoffee.getPrice()+15;
    }

    @Override
    public String getName() {
        return mCoffee.getName()+ " + addMilkFoam";
    }
}