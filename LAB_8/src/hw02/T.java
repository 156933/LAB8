package hw02;

import java.util.Scanner;
import java.util.regex.Pattern;

public class T {
    public static void main(String[] args) {
        System.out.println("请输入需要判断的手机号:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "^1[3-5|7-8]\\d{9}$";
        if(Pattern.matches(regex,input))
        {
            System.out.println("合法手机号");
        }else{
            System.out.println("不合法手机号");
        }
    }
}
