package structuralPattern.bridgePattern;

public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}
