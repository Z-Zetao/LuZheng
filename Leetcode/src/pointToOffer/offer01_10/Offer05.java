package pointToOffer.offer01_10;

/**
 * @author 51465
 */
public class Offer05 {
    public static void main(String[] args) {
        String s = "We are happy.";
        Offer05 offer05 = new Offer05();
        String s1 = offer05.replaceSpace1(s);
        System.out.println(s1);
    }


    public String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }

    /**
     * 尽量地少用库函数刷leetCode
     * @param s 输入字符串
     * @return 空格转换为%20以后的输出
     */
    public String replaceSpace1(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (c == ' '){
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
