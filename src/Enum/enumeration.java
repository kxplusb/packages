package Enum;

enum Size {
    //枚举是一种具有固定的可能值集的类型。我们使用 enum 关键字来声明枚举
    //在 Java 中，枚举类型被认为是类的一种特殊类型
    //枚举类可以像常规类一样包含方法和字段
    //枚举常量始终默认为 public static final
    SMALL, MEDIUM, LARGE, EXTRALARGE;

    //枚举类中有一些预定义的方法可以随时使用

}
class Main{
    public static void main(String[] args) {
        System.out.println(Size.SMALL);
        System.out.println(Size.MEDIUM);
        Size s = Size.EXTRALARGE;
        System.out.println(s);
    }
}
