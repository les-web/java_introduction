package inheritance.abstraction;

public class Smartphone implements Computer, Phone {

    @Override
    public void sendSms(int number, String content) {
        System.out.println("Sending sms to "+ number + " with content "+ content +" using smartphone");

    }
    @Override
    public void sendEmail(String address, String content) {
        System.out.println("Sending email " + content + " to address "+ address+ "using smartphone");

    }

    @Override
    public void browseInternet() {
        System.out.println("Browsing internet using smartphone");

    }
    @Override
    public void makeCall(int number) {
        System.out.println("Calling to "+ number + " using smartphone");
    }






}
