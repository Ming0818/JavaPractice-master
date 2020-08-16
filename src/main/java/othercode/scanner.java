package othercode;

import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*if (scan.hasNext()) {
            String input = scan.next();
            System.out.println("输入的数据为：" + input);
        }
        scan.close();*/

        String input = scan.next();
        System.out.println("输入数据为: " + input);
        scan.close();

    }
}
