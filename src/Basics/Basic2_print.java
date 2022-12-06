package Basics;

public class Basic2_print {
    public static void main(String[] args) {
        int a = 0;
        double b = 0.15;
        String c = "abc";
//compare : print() & println()
        System.out.println("===================");//只是分割线
        //print()
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        System.out.printf("\n===================\n");

        //println()
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.printf("===================\n");
//println would add a "\n" after printing.


        //printf()  //格式化输出
        System.out.printf( "%d%f%s" , a , b , c );//示例1
        System.out.printf( "%d\n%.1f\n%s\n" , a , b , c );//示例2
        System.out.printf("%-5d%.1f%8.1f\n", 2, b, b);//示例3
        System.out.printf("%-5d%-8.2f%.2f\n", 2, b, b);//示例4
        System.out.printf("%d    %.1f   %.1f\n", 2, b, b);//示例5
        System.out.printf("===================\n");
        System.out.printf( "%d\n%f%f%f%f\r%s" ,a,b,b,b,b,c );//示例6
        System.out.printf( "%d\n%f%f%f%f%s\n" ,a,b,b,b,b,c );//示例7
        /*格式化输出printf（）：
            1）%d，%f，%s分别为整型，浮点型，字符串型的占位符，不可以混用
            2）%f不能作为int类的占位符，可以用作 float 和 double 类的
            3）%.1f的意思是保留一位小数，会四舍五入（浮点型转化为整型时不会四舍五入，直接砍掉尾巴）
            4）%20f / %20d 的意思是右对齐输出，宽度为n个半角字符，不足的用空格补足，超出的话不会截断,
            %0n表示类似，但不足部分填充字符为'0',%-nd表示左对齐，输出宽度为n。
            5）\n为换行符，光标移到下一行；\r为回车符，光标移到当前行的最前端，会覆盖当前行的所有字
            （在终端打开时，有多少字就覆盖多少字，比如示例7若在终端打开就只会覆盖前三个数字，即0.1）
         */


        //其他占位符：
        int t1 = 10 ; double t2 = 10 ;

        //%g用于打印浮点型数据时，会去掉多余的零，至多保留六位有效数字，当%g用于打印超过6位的浮点型数据时会选择%e格式进行输出。
        System.out.printf("%g\n",t2);

        //%e的默认保留小数点后6位，以科学计数法输出。
        System.out.printf("%e\n",t2);

        //%x为整数占位符，输出时转化为十六进制。
        System.out.printf("%x\n",t1);

        //%o为整数占位符，输出时转化为八进制。
        System.out.printf("%o\n",t1);
    }
}
