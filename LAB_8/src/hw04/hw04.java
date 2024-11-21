package hw04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hw04 {
    public static void main(String[] args) {
        String s = "请登陆我们的网站www.yy.com,登陆成功后,可以购买商品";
        System.out.println(s);
        String regex = "登陆";
        Pattern compile = Pattern.compile("登陆");
        Matcher matcher = compile.matcher(s);
        while(matcher.find())
        {
            String group = matcher.group();
            System.out.println(matcher.start());
            System.out.println(group);
        }
        System.out.println(s.replace(regex, "登录"));

    }
}
