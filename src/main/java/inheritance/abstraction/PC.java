package inheritance.abstraction;

public class PC implements Computer {
    @Override
    public void sendEmail(String address, String content) {
        System.out.println("Sending email " + content + " to address "+ address+ "using PC");

    }

    @Override
    public void browseInternet() {
        System.out.println("Browsing internet using PC");

    }
}
