package day03;
import java.util.Scanner;
/**
 * Created by jinhua.chen on 17/3/15.
 */
public class TaxOfPerson {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的工资的税前金额($):");
        double salary = scanner.nextInt();
        double taxSalary = salary - 3500;
        double tax;
        if (taxSalary <= 0 ){
            tax = 0.0;
        }
        else if (taxSalary <= 1500){
            tax = taxSalary * 3 / 100;
        }
        else if (taxSalary> 1500 && taxSalary <= 4500){
            tax =taxSalary * 10 /100 -105;
        }
        else if (taxSalary> 4500 && taxSalary <= 9000){
            tax = taxSalary * 20 /100 -555;
        }
        else if (taxSalary >9000 && taxSalary<= 35000){
            tax =taxSalary *25 /100 -1005;
        }

        else if (taxSalary >35000 && taxSalary<= 55000){
            tax =taxSalary *30 /100 -2755;
        }
        else if (taxSalary >55000 && taxSalary<= 80000){
            tax =taxSalary *35 /100 -5505;
        }
        else {
            tax =taxSalary *45 /100 -13505;
        }
        System.out.println("您应该缴纳的个人所得税是:$"+tax);

    }
}

