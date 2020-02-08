package inheritance.abstraction;

public class Test {
    public static void main(String[] args) {
        Phone nokia = new Nokia3310(5);
        nokia.makeCall(123456789);
        nokia.sendSms(23456789, "Hello Chiny! Co słychać w Azji ????");
        Computer pc = new PC();
        pc.browseInternet();
        pc.sendEmail("jasiu@a.pl", "Jak tam z koronowirusem");

        Smartphone smartphone3 = new Smartphone();
        Phone smartPhone = smartphone3;
        smartPhone.sendSms(1234566, "Hello Kitty");
        smartPhone.makeCall(567890);

        Computer smartPhone2 = smartphone3;
        smartPhone2.sendEmail("jasinek@sss.uk", " Cześć");
        smartPhone2.browseInternet();


    }
}
