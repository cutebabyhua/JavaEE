package day02;
import java.util.Scanner;
/**
 * Created by jinhua.chen on 17/3/15.
 */
public class LeapYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = scanner.nextInt();
        boolean flag = (year % 4 == 0) &&(year % 100 != 0) || (year % 400 ==0);
        if (flag){
            System.out.println(year+"是闰年");
        }else {
            System.out.println(year+"不是闰年");
        }
    }
}
