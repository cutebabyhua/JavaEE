package day03;
import java.util.Scanner;

/**
 * Created by jinhua.chen on 17/3/15.
 */
public class Max {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("请依次输入两个整数:a,b(以空格隔开)");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = (a>b)? a:b;
        System.out.println("最大值为"+c);
    }
}
