package Classes_n_Methods;

public class CnM0_types {//这便是一个类

    //private
    /* 需要关键字private
     * 只有同类的方法可以引用，一般用于保护内部变量不被外部破坏
     * 外部类可以通过该类的setter和getter方法对该变量进行读写
     */
    private int pri = 0;
    private String s = "int";

    public void setPri (int p){
        this.pri = p;
        //it's the same if it is written as" pri = p; "
    }
    public int getPri (){
        return pri;
    }


    //public
    /* 定义时默认为public
     * 对所有类可见
     */
    int pub = 1;

    //protected

    car car = new car();
}

class car{
    private int car = 1;
}//只能有一个和文件名一样的class ,且仅有那个class可以是public的
