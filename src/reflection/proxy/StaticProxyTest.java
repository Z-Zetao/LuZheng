package reflection.proxy;

/**
 * @author 51465
 */
interface ClothFactory{
    void produceCloth();
}

/**
 * 代理类
 */
class ProxyClothFactory implements ClothFactory{

    private ClothFactory clothFactory;

    public ProxyClothFactory(ClothFactory clothFactory) {
        this.clothFactory = clothFactory;
    }

    @Override
    public void produceCloth() {
        System.out.println("代理工厂做一些准备工作");
        clothFactory.produceCloth();
        System.out.println("代理工厂做一些后续的收尾工作");
    }
}

/**
 * 被代理类
 */
class NikeClothFactory implements ClothFactory{

    @Override
    public void produceCloth() {
        System.out.println("耐克工厂生产一批运动服");
    }
}

/**
 * 测试类
 * @author 51465
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(
                new NikeClothFactory()
        );
        proxyClothFactory.produceCloth();
    }
}
