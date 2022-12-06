package DocumentOperation;

import java.io.*;

public class DO2_ReadnWriteFiles {
    private int x,y;


    //读文件

    //方法1
    //优势：在其他方法中可以直接调用reader对象
    BufferedReader reader;//从BufferedReader类中创建一个reader对象
    {
        try {
            reader = new BufferedReader(new FileReader("src/DocumentOperation/IN.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }//防止“找不到对象”
    }
    public void ReadFile(){
        try{
            this.x = reader.read();//按字符读取，以万国码形式存储,一次只读一个字符
        } catch (Exception e) {
            throw new RuntimeException(e);
        }//read这个方法签名是一定要有exception
    }

    //方法2
    //优势：代码比较短，便于阅读
    public void ReadFile(String address){
        try{
            BufferedReader in=new BufferedReader(new FileReader(address));
            this.y = in.read();//一次只读一个字符，以万国码形式存储
            in.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



    //写文件

    //方法1
    BufferedWriter writer;
    {
        try {
            writer = new BufferedWriter(new FileWriter("src/DocumentOperation/OUT.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void WriteFile(){
        try{
            writer.write(x);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //方法2
    public void WriteFile(String address){
        try{
            BufferedWriter out = new BufferedWriter(new FileWriter(address));//方法2
            out.write(y);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    //测试
    public static void main(String[] args) throws IOException {
        DO2_ReadnWriteFiles a = new DO2_ReadnWriteFiles();//因为前面的那些方法都不是静态的，因此要用的话得先new一个对象
        a.ReadFile();
        a.ReadFile("src/DocumentOperation/input.txt");
        //因为两个方法的输入不一样，所以编译器可以将这两个拥有相同方法签名的方法区分开来
        a.WriteFile();
        a.WriteFile("src/DocumentOperation/output.txt");
    }
}
