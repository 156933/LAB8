package hw05;

public class hw05 {
    public static void changeSignal(Signal color){
        switch (color)
        {
            case RED:
                System.out.println("红灯禁止通行");
                break;
            case GREEN:
                System.out.println("绿灯允许通行");
                break;
            case YELLOW:
                System.out.println("黄灯快速通行");
                break;
        }
    }
    public static void main(String[] args) {
        changeSignal(Signal.GREEN);
        changeSignal(Signal.RED);
        changeSignal(Signal.YELLOW);
    }
}
