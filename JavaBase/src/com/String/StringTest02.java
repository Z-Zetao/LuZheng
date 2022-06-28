package com.String;

/**
 * @author 51465
 */
public class StringTest02 {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "EE";

        String s3 = "javaEE";
        String s4 = "java" + "EE";
        String s5 = s1 + "EE";
        String s6 = "java" + s2;

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s5 == s6);//false
    }
}
