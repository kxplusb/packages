package Basics;

public class Basic5_LogicOperation {
    public static void main(String[] args) {
        // 逻辑运算符 && 和 & 的异同
        //同：都是“与门”
        //异：&&若前一个为false，则不会判断后一个语句，而&会。例：
        int a = 0 , c = 0  , b = 0 ;
        if ( a != 0 && c==(b=6)){
            System.out.println("&&");
        }
        System.out.printf( "%d  " , b);
        if ( a != 0 & c==(b=6)){
            System.out.println("&");
        }
        System.out.println(b);
        //print出0  6 ，说明第一句没有执行“c==（b=6）”而第二句执行了“c==（b=6）”
        System.out.println("===============");


        //逻辑运算符 | 和 || 和 ^ 的异同
        // | 和 || 都表示或门，区别参考 & 和 && 。
        // ^ 仅在两个语句有且仅有一个为true时输出true
        boolean bool1,bool2,bool3,bool4,bool5,bool6 ;
        b = 0 ;
        bool1 = a==0 | b==(c=6) ;
        System.out.printf( "%d  " , c );
        c = 0 ;
        bool2 = a==0 || b==(c=6) ;
        System.out.printf( "%d\n" , c );
        bool3 = a==0 | b==0 ;
        bool4 = a==0 ^ b==0 ;
        bool5 = a==0 | b!=0 ;
        bool6 = a==0 ^ b!=0 ;
        System.out.print(bool1);System.out.print(" , ");
        System.out.print(!bool1);System.out.print(" , ");
        System.out.print(bool2);System.out.print(" , ");
        System.out.print(bool3);System.out.print(" , ");
        System.out.print(bool4);System.out.print(" , ");
        System.out.print(bool5);System.out.print(" , ");
        System.out.print(bool6);System.out.println();
        System.out.println("===============");


        //优先级：& > ^ > | > && > || > ?: > = , += , -= ，*= ，/= ，%=

    }
}
