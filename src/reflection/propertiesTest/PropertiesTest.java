package reflection.propertiesTest;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author 51465
 */
public class PropertiesTest {
    @Test
    public void test() throws IOException {
        Properties properties = new Properties();
        //读取配置文件方式一:这个的路径是在该模块下
//        FileInputStream fileInputStream = new FileInputStream("jdbc.properties");
//        properties.load(fileInputStream);
        //读取配置文件方式二:这个的路径是在当前模块的src下
        ClassLoader classLoader = PropertiesTest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("src\\jdbc.properties");
        properties.load(resourceAsStream);
        String user = properties.getProperty("name");
        String password = properties.getProperty("password");
        System.out.println("Name = " + user + " " + "Password = " + password);
    }
}
