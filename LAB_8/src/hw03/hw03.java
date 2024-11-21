package hw03;

public class hw03 {
    public static void main(String[] args) {
        String s = "18-22-40-65";
        String regex = "\\D+";
        String[] split = s.split(regex);
        System.out.println("分割后的数字");
        for (int i = 0; i < split.length; i++) {
            System.out.print(split[i]);
        }
    }

}
