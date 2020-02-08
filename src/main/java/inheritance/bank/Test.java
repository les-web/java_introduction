package inheritance.bank;

public class Test {
    public static void main(String[] args) {
        AbstractBankAccount account = new DebitBankAccount("Paweł", 200,100);
        System.out.println("Pobrałem :" +account.withdraw(50) + " zł. Pozostało: " + account.getCashAmount());
        System.out.println("Pobrałem :" +account.withdraw(30) + " zł. Pozostało: " + account.getCashAmount());
        System.out.println("Pobrałem :" +account.withdraw(90) + " zł. Pozostało: " + account.getCashAmount());
        System.out.println("Pobrałem :" +account.withdraw(70) + " zł. Pozostało: " + account.getCashAmount());
        System.out.println("Pobrałem :" +account.withdraw(50) + " zł. Pozostało: " + account.getCashAmount());
        System.out.println("Pobrałem :" +account.withdraw(30) + " zł. Pozostało: " + account.getCashAmount());

    }
}
