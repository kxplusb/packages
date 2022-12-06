package specialClasses;

import java.util.*;

public class string {
    public static void main(String[] args) {
        //Java中的字符串不是基本类型(比如int、char等)
        //相反，所有字符串都是预定义的名为String的类的对象

        String java = "JAVA";
        String p = "programming";
        String H = "Hello  world!";
        String javaCopy = new String("JAVA");//用new关键字创建字符串
        /* 使用字符串字面量和new关键字之间的区别：
         *
         * 使用字符串文字创建字符串时，直接提供字符串的值，因此，编译器首先检查字符串池，看看字符串是否已经存在
         * 如果字符串已经存在， 不会创建新字符串，新引用会直接指向现有字符串
         * 如果字符串不存在，则创建新字符串
         *
         * 在使用new关键字创建字符串时，不会直接提供字符串的值，因此，新字符串总是被创建
         */


        //下面是一些常见的字符串方法
        System.out.println("-------START-------");

        //查找字符串长度
        //.length()
        System.out.println(java.length());
        System.out.println(H.length());//在Java字符串中空格的长度也要算进去
        System.out.println("-------------------");


        //连接字符串
        //.concat()
        String f = java.concat(p);
        String F = p.concat(java);
        System.out.println("f="+f);
        System.out.println("F="+F);
        //+
        String x = java + p ;
        String X = p + java ;
        System.out.println("x="+x);
        System.out.println("X="+X);
        System.out.println("-------------------");


        //分割字符串
        //.split()
        //不带limit参数
        String vowels = "a::b::c::d:e";//在“ ::”处分割字符串
        String[] result = vowels.split("::");//将结果存储在字符串数组中
        System.out.println("result = " + Arrays.toString(result));//将数组转换为字符串并打印
        //带limit参数
        /*
         * 如果limit参数为 0 或 负数，则split()返回包含所有子字符串的数组
         * 如果limit参数为正（例如n），则split()返回子字符串的最大值n
         * 如果需要使用特殊字符，如 \、|、^、*、+ 等，则需要对这些字符进行转义
         */
        vowels = "a:bc:de:fg:h";// 在":"处分割字符串
        String[] r = vowels.split(":", -2);// limit = -2; 数组包含所有子字符串
        System.out.println("返回结果当limit为 -2 = " + Arrays.toString(r));
        r = vowels.split(":", 0);// limit = 0; 数组包含所有子字符串
        System.out.println("返回结果当limit为 0 = " + Arrays.toString(r));
        r = vowels.split(":", 3);// limit = 3; 数组最多包含2个子字符串
        System.out.println("返回结果当limit为 3 = " + Arrays.toString(r));
        //注意：如果需要使用特殊字符，如 \、|、^、*、+ 等，则需要对这些字符进行转义
        vowels = "a\\bc+de+fg+h";
        System.out.println(Arrays.toString(vowels.split("\\\\")));
        System.out.println(Arrays.toString(vowels.split("\\+")));
        System.out.println("-------------------");


        //比较两个字符串是否相同
        //.equals()
        System.out.println(java.equals(javaCopy));
        System.out.println(java.equals(p));
        //==
        System.out.println(java == javaCopy);
        //.compareTo() //返回: ???
        System.out.println(java.compareTo(javaCopy));
        System.out.println(java.compareTo(p));
        System.out.println("-------------------");


        //从字符串中获取字符
        //.charAt()
        System.out.println("位置3处的字符:"+p.charAt(3));//注意这里的位置和数组的计算方式一样，是从0开始的
        //.subString获取子字符串
        System.out.println(p.substring(3));
        System.out.println(p.substring(3,5));
        System.out.println("-------------------");


        //大小写转换
        //.toUpperCase() / .toLowerCase()
        System.out.println("原本:"+p);
        System.out.println("大写:"+p.toUpperCase());
        System.out.println("原本:"+java);
        System.out.println("小写"+java.toLowerCase());
        System.out.println("-------------------");


        //替换字符
        //.replace()
        System.out.println(java.replace('A','a'));
        System.out.println("-------------------");


        //转义字符
        // “/”
        //有些符号在String里面不能直接打出来（比如“”），就要用到转义字符
        String str = "This is the \"String\" class.\nUse \"\\\" to realize more effects";//更多用法见print部分
        System.out.println(str);
        System.out.println("-------------------");


        //返回传递的参数的字符串表示形式
        //.valueOf()
        /*
         * .valueOf() 和 .toString()的区别
         * .toString() 可以被重写而 .valueOf() 是静态方法，不可以被重写
         * 二者都是使用类名调用，但是.toString()使用的是需要变成String类的类名，而.valueOf()使用的是String
         * 因此，对于自己定义的奇奇怪怪的类，不能调用.valueOf()而可以调用.toString()
         * 简单来说，就是.toString()的使用更加复杂但更灵活（需要重写但可以按自己的需要来写）
         * 而.valueOf()在多数情况下够用但有时满足不了你的个性化需求
         */
        char c = 'J';
        char ch[] = {'J', 'a', 'v', 'a'};
        System.out.println(String.valueOf(12+21));//将int类型转化为字符串
        System.out.println(String.valueOf(c));//将char转换为字符串
        System.out.println(String.valueOf(ch));//将char数组转换为字符串
        System.out.println(String.valueOf(ch,1,3));//将char数组的子数组转换为字符串
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Kotlin");
        System.out.println(String.valueOf(languages));//将ArrayList对象转换成一个字符串
        //Java中还有一个.copyValueOf()的方法，等效于.valueOf()方法
        System.out.println("--------END--------");

        //其他方法：
        //.getBytes()  //将字符串转换为字节数组(使用UCS等方式将其全部转化为byte并保存为一个数组)


    }
}