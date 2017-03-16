package day02;
import java.util.Scanner; //1

/**
 * Created by jinhua.chen on 17/3/15.
 */
public class ScannerDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int age = scanner.nextInt(); // 2
        System.out.println("请输入你的金额");
        double price = scanner.nextDouble(); // 3
        System.out.println(age);
        System.out.println(price);

//      java里不能这样写,得用逻辑关系  if (18<=age<=50){}
        if (age<=50 && age >=18){
        }
    }
}
