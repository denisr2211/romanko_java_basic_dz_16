public class Iphones implements Smartphones, Ios{
    public static void main(String[] args) {
        Iphones iphone1 = new Iphones();
        iphone1.sms();
        iphone1.operationSystem();
    }
    @Override
    public void call() {
        System.out.println("calls on iphone");
    }
    @Override
    public void sms() {
        System.out.println("sms on iphone");
    }
    @Override
    public void internet() {
        System.out.println("you've entered the internet on iphone");
    }
}

