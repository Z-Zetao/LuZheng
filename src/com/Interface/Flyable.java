package com.Interface;

/**
 * @author 51465
 */
public interface Flyable {
    /**
     * 全局常量
     */
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1;

    /**
     * 抽象方法
     */
    public abstract void fly();
    void stop();
}
