package Basics;

//使用scanner输入
import java.util.Scanner;//引入Scanner

public class Basic1_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//定义input（不一定要写input，只是个名字而已）

        int a = input.nextInt();//获取输入值（第一个值，且必须是int类型）并保存至变量a
        int b = input.nextInt();//获取第二个输入值，必须是int类型
/*  如果程序写成上面这样
    若输入“1 2”，则程序会使a=1，b=21
    注意不能输入“1，2”或“1；2”等
    在前两个位置输入非int类型就会报错，但如果在第三个或以后的位置输入其他类形的数据是可以的（因为scanner不会去识别）*/

        //不同类型的输入指令
        int c = input.nextInt();//int类型
        byte d = input.nextByte();//Byte类型
        double e = input.nextDouble();//double类型
        float f = input.nextFloat();//float类型
        String s = input.next();//字符串类型

        /*注意这里（用string时）不管你输入什么都可以，因为你输入的肯定是字符串，但是哪怕输入的是数字也不能进行运算
          例：   String j = input.next();
                s = s + j ;
                System.out.print(s);
                如果输入“1 2”，则会打印出“12”
         */
        //同时注意不能直接输入char类型的字符，必须先输入string类型再转为char类型（因为char只能代表一个字符）
        char cr = s.charAt(a);//这句可以把string类型的第a+1个字符存为char类型并赋值给cr

        long g = input.nextLong();//long类型

        input.close();//我们使用close()方法关闭对象。建议一旦输入，就关闭scanner对象。


    }
}
