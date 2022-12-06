package Basics;

import Classes_n_Methods.CnM0_types;

import java.util.Scanner;

public class Basic6_if {
    public static void main(String[] args) {
        boolean t = true, f = false;
        //常规写法:
        if(t){
            System.out.println(1);
        }
        //else if(boolean){;}
        else System.out.println(0);//后面只跟一句的话可以不用{}

//        //简便写法:
//        (t)?System.out.print(1):System.out.print(0)



        // 额外赠送：switch语句
        /*
        switch（？）{
            case ‘ ’ ：
                statement（s）；
                break；
            case ' ' ：
                ……
            default ：
                statement（s）
        }
         */
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.print("input:");
        int m = input.nextInt();
        String s = input.next();
        char c = s.charAt(0);
        switch ( m ){
            case 1 ^ 2 :// 数字时不需要加‘’
                System.out.println(m+m);
                break;
            case 3 ^ '4' :
                System.out.println("");
                break;
            default :
                System.out.println("default");
        }

        switch ( c ){// m不能是string类型的，若要表示符号或字母则需要改为char类型
            case '1' ^ '2' :
                System.out.println(m+m);
                break;
            case '3' ^ '4' :// 只能是单引号，不能是双引号
                System.out.println("");
                break;
            case 'a' :
                System.out.println("apple");
                break;
            default :
                System.out.println("default");
        }
        //原理上能用switch写的都可以用if写
    }
}
