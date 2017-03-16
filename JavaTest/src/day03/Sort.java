package day03;
import java.util.Scanner;
/**
 * Created by jinhua.chen on 17/3/15.
 */
public class Sort {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请依次输入三个整数:a,b,c(以空格隔开)");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("您输入的是:"+"\n"+"a="+a+",b="+b+",c="+c);

        int temp;
        if(a > b){
            // 追尾并绕圈
            temp = a;a = b;b =temp;
        }
        if (a > c){
            temp = a;a = c;c = temp;
        }
        if (b > c){
            temp = b;b = c;c = temp;
        }

        System.out.println("升序排列后,结果为:"+"\n"+"a="+a+", b="+b+", c="+c);

    }
}
