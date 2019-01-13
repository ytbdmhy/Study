package String_StringBuilder_StringBuffer;

import java.util.Arrays;

/**
 * Created by Administrator on 2019-01-11.
 */
public class MyString {

    static String string = "  Hello World ";

    // String类的方法
    public static void main(String[] args) {
        // 1.length
        System.out.println(string.length());
        // 2.charAt
        System.out.println(string.charAt(5));
        // 3.getChars
        char[] chars = new char[15];
        string.getChars(1,7,chars,3);
        System.out.println(chars);
        // 4.getBytes
        byte[] bytes = string.getBytes();
        System.out.println(new String(bytes));
        // 5.toCharArray
        char[] chars1 = string.toCharArray();
        System.out.println(chars1);
        // 6.equals(区分大小写)
        String string2 = "  hello world ";
        System.out.println(string.equals(string2));
        // 7.equalsIgnoreCase(不区分大小写)
        System.out.println(string.equalsIgnoreCase(string2));
        // 8.startWith
        System.out.println(string.startsWith("e"));
        System.out.println(string.startsWith(" "));
        // 9.endWith
        System.out.println(string.endsWith("e"));
        System.out.println(string.endsWith(" "));
        // 10.toUpperCase
        System.out.println(string.toUpperCase());
        // 11.toLowerCase
        System.out.println(string.toLowerCase());
        // 12.concat
        System.out.println(string.concat(string2));
        // 13.trim
        System.out.println(string.trim());
        // 14.substring
        System.out.println(string.substring(3));
        System.out.println(string.substring(4,10));
        // 15.indexOf
        System.out.println(string.indexOf("e"));
        // 16.lastIndexOf
        System.out.println(string.lastIndexOf("e"));
        // 17.compareTo(区分大小写)
        System.out.println(string.compareTo(string2));
        // 18.compareToIgnoreCase(不区分大小写)
        System.out.println(string.compareToIgnoreCase(string2));
        // 19.replace
        System.out.println(string.replace("l","L") + "--" + string);
        System.out.println(string.replace(string,"good") + "--" + string);
        System.out.println(string.replace(string,string2) + "--" + string);
        System.out.println(string.replace(string2,string) + "--" + string);
        // 20.replaceFirst
        System.out.println(string.replaceFirst("l","L") + "--" + string);
        // 21.replaceAll

    }

    // char数组转String
    char[] chars = {'s','f','g','h','s'};
    String string1 = new String(chars); // 1
    String string2 = String.valueOf(chars); //2
    String string3 = Arrays.toString(chars); //3

    // String转char数组
    String stringToChars = "StringToChars";
    char[] chars2 = stringToChars.toCharArray();

}
