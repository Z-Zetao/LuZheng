package reflection.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Human{
    /**
     * 获取信仰
     * @return 返回信仰
     */
    String getBelief();

    /**
     * 获取吃的东西
     * @param food 食物
     */
    void eat(String food);
}

/**
 * 被代理类
 */
class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "I believe I can fly.";
    }

    @Override
    public void eat(String food) {
        System.out.println("I like eat " + food);
    }
}

/**
 * 动态代理
 * 1.如何根据加载到内存中的被代理类，动态地创建一个代理类及其对象
 * 2.当通过代理类地对象调用方法时，如何动态的调用被代理类中的同名方法
 */
class ProxyFactory{
    /**
     * 调用此方法返回一个代理类的对象
     * @param obj 被代理类的对象
     * @return 代理类对象
     */
    public static Object getProxyInstance(Object obj){
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);
    }
}
class MyInvocationHandler implements InvocationHandler{

    /**
     * obj:被代理类对象
     */
    private Object obj;

    public void bind(Object obj){
        this.obj = obj;
    }

    /**
     * 当我们通过代理类的对象调用方法A时，就会自动的调用如下invoke方法
     * 将被代理类要执行的方法A的功能就声明在invoke中
     * @param proxy 代理类对象
     * @param method 代理类对象调用的方法,此方法也就作为了被代理类对象要调用的方法
     * @return 代理类对象或被代理类对象的返回值
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(obj, args);
    }
}


/**
 * @author 51465
 */
public class ProxyTest {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        //proxyInstance就是代理类对象
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);
        //调用方法的时候会自动调用MyInvocationHandler中的invoke方法
        String belief = proxyInstance.getBelief();
        System.out.println(belief);
        proxyInstance.eat("四川麻辣烫");
        //another example
        NikeClothFactory nikeClothFactory = new NikeClothFactory();
        ClothFactory clothFactory = (ClothFactory) ProxyFactory.getProxyInstance(nikeClothFactory);
        clothFactory.produceCloth();
    }
}
