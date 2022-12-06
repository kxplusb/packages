package Basics;

import java.util.Scanner;

public class Basic4_cycle {
    public static void main(String[] args) {
        int a = 1 ;
        // while & do-while

        // while
        /* while(condition){
         * loop
           }*/
        while ( a > 10 ){
            System.out.println(a);
            a++ ;
        }

        // do-while
        /* do{
             loop;
        }while(condition)
         */
        do {
            System.out.println(++a);
        }while( a==0 );



        // for & for-each

        // for
        /* for(initialization; loop-continuation condition; increment/decrement exp) {
            statement(s);
        }*/
        for ( int i = 1 ; i<=5 ; i++ ){
            for (int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //  for-each
        /* for ( initialization : array ){
         * statement(s);
           }*/
        int[] aa = { 1 , 2 , 3 , 4 , 5 };//初始化数组aa
        int[] b = { 2 , 4 , 6 , 8 , 10 };
        for ( int i : aa ){
            System.out.println( "" );
            System.out.print( i + ":" );
            for ( int j : b ){
                System.out.print( j + " ,");
            }
        }



        // continue 和 break 的用法及区别
        /*
            1)只作用于最内层的循环（想作用于外层循环就要加标记）
            2）continue 只结束当前这一轮循环，如果有下一轮循环就会进入下一轮循环，
            而break就会直接结束整个循环，跳出循环。
        */
        // break
        label:for( int i = 1 ; i<=9 ; i ++) {
// 用label作为标签添加，标签不一定要是label。
            System.out.println();
            for (int j = 1; j <= i; j++) {
                if (j > 4) {
                    break label;//这样可以直接break标签处的循环。
                }
                System.out.print("*");
            }
        }
        // continue
        label:for( int i = 1 ; i<=9 ; i ++) {
// 用label作为标签添加，标签名不一定要是label。
            System.out.println();
            for (int j = 1; j <= i; j++) {
                if (j > 4) {
                    continue label;// 这样可以直接break标签处的循环。
                }
                System.out.print("*");
            }
        }




    }
}
