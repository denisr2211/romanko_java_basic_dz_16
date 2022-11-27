public class Androids implements Smartphones, LinuxOs{
    public static void main(String[] args) {
        Androids android1 = new Androids();
        android1.internet();
        android1.call();
        android1.operationSystem();
    }
    @Override
    public void call() {
        System.out.println("calls on android");
    }
    @Override
    public void sms() {
        System.out.println("sms on android");
    }
    @Override
    public void internet() {
        System.out.println("internet on android");
    }
}


