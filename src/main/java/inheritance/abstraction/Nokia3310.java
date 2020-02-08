package inheritance.abstraction;

public class Nokia3310 implements Phone {

    private int batteryLevel;

    public Nokia3310(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void sendSms(int number, String content) {
        System.out.println("Sending sms to "+ number + " with content "+ content +" using Nokia3310");

    }

    @Override
    public void makeCall(int number) {
        System.out.println("Calling to "+ number + " using Nokia3310");
    }

    public void playSnake() {
        System.out.println("Playing snake on Nokia3310");
    }
}
