package com.oopHead.Forth;
/**
 * 属性（成员变量）   vs     局部变量
 *
 * 相同点：
 * 定义变量的格式都是：数据类型 变量名 = 变量值;
 * 都是先声明，后使用;
 * 变量都有其对应的作用域;
 *
 * 不同点：
 * 在类中声明的位置不同
 *      属性：直接定义在类的一对{}内
 *      局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量
 * 关于权限修饰符的不同————private、public、缺省、protected
 *      属性：可以在声明属性时，指明其权限，使用权限修饰符---->主要在封装性时考虑很多
 *      局部变量：不可以使用权限修饰符
 * 默认初始化值的不用
 *      属性：根据其类型，都有默认初始化值
 *          整形：0
 *          浮点型：0.0
 *          字符型：0（这个不是数字0，而是ASCII码中的0）
 *          布尔型：false
 *          引用数据类型：null
 *      局部变量：没有默认初始化值————意味着在调用之前一定要初始化值（也就是在调用时要初始化值，没有调用时就没事）
 *  在内存中加载的位置不同
 *      属性：加载到堆空间中
 *      局部变量：加载到栈空间中
 */
public class UserTest {
}
class User{
    //属性
    private String name;
    private int age;

    //这里的language、food就是局部变量
    public void talk(String language){
        System.out.println("我们的母语是：" + language);
    }
    public void eat(){
        String food = "烙饼";
        System.out.println("我们吃的是" + food);
    }
}
