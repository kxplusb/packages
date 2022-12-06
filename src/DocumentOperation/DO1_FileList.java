package DocumentOperation;

import java.io.File;
import java.io.IOException;

public class DO1_FileList {
    public static void main(String a[]) throws IOException {
        String s = "D:\\祝超\\";
        File file = new File("D:\\祝超\\");
        for(String x : file.list()){
            s += x;s += "\\";
            String[] f = FileNames(s);
            System.out.println(x);
            if(f != null) {
                for (String s1 : f) {
                    System.out.println(" " + s1);
                }
            }
            s = "D:\\祝超\\";
        }
//        Subtitle(s);

    }

    public static void Subtitle(String pathname)throws IOException {
        String s = pathname;
        String[] list = FileNames(pathname);
        for (String name : list) {
            System.out.println(name);
            pathname += name;
            pathname += "\\";
            try {
                Subtitle(pathname);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            pathname = s;
        }
    }

    public static String[] FileNames(String address){
        File file = new File(address);
        if(file.isDirectory()) {
            return file.list();
        }
        return null;
    }
}
