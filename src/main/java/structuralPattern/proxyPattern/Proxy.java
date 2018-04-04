package structuralPattern.proxyPattern;

/**
 *  代理模式（Proxy）
 *  其实每个模式名称就表明了该模式的作用，代理模式就是多一个代理类出来，
 *  替原对象进行一些操作，比如我们在租房子的时候回去找中介，为什么呢？
 *  因为你对该地区房屋的信息掌握的不够全面，希望找一个更熟悉的人去帮你做，
 *  此处的代理就是这个意思。
 */
public class Proxy implements Sourceable {

    private Source source;
    public Proxy(){
        super();
        this.source = new Source();
    }
    @Override
    public void method() {
        before();
        source.method();
        atfer();
    }
    private void atfer() {
        System.out.println("after proxy!");
    }
    private void before() {
        System.out.println("before proxy!");
    }
}