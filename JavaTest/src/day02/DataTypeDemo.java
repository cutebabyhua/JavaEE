package day02;

/**
 * Created by jinhua.chen on 17/3/15.
 */
public class DataTypeDemo {
    public static void main(String[] args){
        int a = 250;
        long b = 10000000000L;
        System.out.println(5/2f); // 2.5
        System.out.println(2/5f); // 0.4
        int c = 2147483647;
        long c1 = c+1;
        System.out.println(c1); // 2147483648

        long d = 10000000000L;
        long e = 10000000000L;
        long f = 1000000000*2*10L;
        System.out.println(f); //200亿
        long g = 1000000000*3*10L;
        System.out.println(g); //溢出
        long h = 1000000000L*3*10;
        System.out.println(h); //300亿
        long i = System.currentTimeMillis();
        System.out.println(i);
        double j = 3.14;
        double k=6.0,l=4.9;
        System.out.println(k-l); // 1.00000000000000009

        boolean b1 = true;
        boolean b2 = false;
        int b3 = 250;
        char c11 = '女';
        char c2 = 'f';
        char c3 = 6;
        char c4 = ' ';
        char c7 = 65;
        System.out.println(c7);
        System.out.println(2+2);

        // '0'对应的值是48,所以'2'对应的值是50,所以这里告诉我们char实质是码int
        System.out.println(2+'2'); //52
        System.out.println('2'+'2');
        char c8 = '\\';
        System.out.println(c8);

        int a111 = 250;
        long b111 = a;
        int c111 = (int)b111;
        long d111 = 250;
        double e1 = 250;
        System.out.println(e1); //250.0

        long f1 = 10000000000L;
        int g1 = (int)f1;
        double h1 = 25.98;
        int i1 = (int)h1;
        System.out.println(i1);

        byte b11 = 5;
        byte b12 = 6;
        byte b13 = (byte)(b11+b12);

    }
}
