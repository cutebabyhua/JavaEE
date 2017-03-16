package day03;
import java.util.Scanner;
/**
 * Created by jinhua.chen on 17/3/15.
 */
public class DayOfMonth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份(例如:2012)");
        int year = scanner.nextInt();
        System.out.println("请输入月份(例如:1)");
        int month = scanner.nextInt();

        int day =0;

        switch (month){

            // 如下可表达或的关系
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day =31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0)){
                    day = 29;
                }
                else {
                    day =28;
                }
                break;
        }
        System.out.println(year+"年"+month+"月有"+day+"天");
    }
}
