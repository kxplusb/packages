package specialClasses;

import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        //创建一个可变数组
        /*
         * 基本方法：ArrayList<Type> name = new ArrayList<>();
         *
         * 例：
         * 创建整数类型 arraylist
         * ArrayList<Integer> arrayList = new ArrayList<>();
         *
         * 创建字符串类型 arraylist
         * ArrayList<String> arrayList = new ArrayList<>();
         *
         * 注意：这里的Type指的是相应的包装类，例如如果写的是int而不是Integer，编译器就会报错
         */
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> integer = new ArrayList<>();

        //还可以使用 List 接口创建 ArrayList，这是因为 ArrayList 类实现了 List 接口
        List<String> list = new ArrayList<>();


        //用.add()添加元素
        integers.add(10);
        integers.add(1);
        list.add(0,"10");
        list.add(0,"1");
        //注意：.add(index,element)的方法不能跳跃添加，只能一个一个来
        //但是可以向上面那样写，效果就是index后面的元素整体往后移了一位（不是取代index上的element）
        integer.addAll(integers);//用addAll全部添加
        System.out.println(integers);
        System.out.println(list);
        System.out.println("----------------------------");

        //用.asList()初始化数组列表
        Integer[] i = {1,2,3};
        ArrayList<Integer> inte = new ArrayList<>(Arrays.asList(1,1,2,3,4));//括号里其实就是一个对应的数组
        ArrayList<Integer> I = new ArrayList<>(Arrays.asList(i));
        System.out.println(inte);
        System.out.println(I);
        System.out.println("----------------------------");


        //访问arraylist里面的元素
        //1、使用.get()方法
        String str = list.get(0);
        System.out.println("索引 0 处的元素: " + str);
        System.out.println("----------------------------");

        //2、使用.iterator() 方法 (???)
        Iterator<String> iterate = list.iterator();//创建一个 Iterator 对象
        System.out.print("ArrayList: ");
        //使用 Iterator 的方法访问元素
        while(iterate.hasNext()){
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        System.out.println();
        /*
         * 注意：
         * hasNext() - 如果数组列表中有下一个元素，则返回 true
         * next() - 返回数组列表中的下一个元素
         */
        System.out.println("----------------------------");


        //更改arraylist元素
        list.set(0,"  ");
        System.out.println(list);
        System.out.println("----------------------------");


        //删除arraylist元素
        //删除特定位置的元素
        list.remove(0);
        System.out.println(list);
        String s = list.remove(0);
        System.out.println(list);
        System.out.println(s);
        System.out.println("----------------------------");

        //删除所有元素
        System.out.println(inte);
        inte.removeAll(inte);//其实也可以只删除一部分,括号内填数组或者列表都可以
        System.out.println(inte);
        System.out.println(integer);
        integer.clear();
        System.out.println(integer);
        //如果要全部删除，clear()要比removeAll()高效很多
        System.out.println("----------------------------");


        //其他功能

        //遍历arraylist：
        //for或者for-each（增强for循环）都可以

        //获取长度  .size()方法
        System.out.println("长度为"+integers.size());
        System.out.println("----------------------------");

        //对列表进行排序
        ArrayList<String> animals= new ArrayList<>();
        animals.add("Horse");
        animals.add("Zebra");
        animals.add("Dog");
        animals.add("Cat");
        System.out.println("未排序的 ArrayList: " + animals);
        //用.sort()方法进行排序
        Collections.sort(animals);//也可以对String列表进行排序
        System.out.println("排序后的 ArrayList: " + animals);
        System.out.println("----------------------------");

        //将列表转化为数组
        String[] arr = new String[animals.size()];
        //用.toArray()方法将列表转化为数组
        animals.toArray(arr);
        System.out.print("Array: ");
        for(String item:arr) {
            System.out.print(item+", ");
        }
        System.out.println("----------------------------");
        

        /*
         * 其他arrayList方法
         * .toString()-将整个数组列表转换为单个 String
         * 表达式：String str = name.toString();
         *
         * clone()-创建具有相同元素、大小和容量的新数组列表
         * 表达式： ArrayList<Integer> name2 = (ArrayList<Integer>)name1.clone();
         *
         * contains()-在数组列表中搜索指定的元素并返回一个布尔值,用来检查arraylist中是否存在指定的元素
         * 表达式：arraylist.contains(Object obj)  (返回布尔值)
         *
         * ensureCapacity()-指定数组列表最少包含的总元素
         * 表达式：arraylist.ensureCapacity(int minCapacity)  (minCapacity - ArrayList的指定最小容量)
         *
         * isEmpty()-检查数组列表是否为空
         * 表达式：arraylist.isEmpty()   (返回布尔值)
         *
         * indexOf()-返回指定元素在arraylist中的位置,如果同一元素obj存在于多个位置，则返回arraylist中第一个出现的元素的位置
         * 表达式：arraylist.indexOf(Object obj)  (返回int，如果列表中不存在指定的元素，则该indexOf()方法返回 -1)
         *
         * trimToSize()-将数组列表的容量减少到当前大小
         * 表达式：arraylist.trimToSize();  (仅改变arraylist容量，无返回值)
         */
    }
}