package inheritance.bank;

public class StandardBankAccount extends AbstractBankAccount {


    public StandardBankAccount(String owner, int cashAmount) {
        super(owner, cashAmount);
    }

//    @Override
//    public int withdraw(int amount) {
//
//        if (cashAmount >= amount) {
//            cashAmount -= amount;
//            return amount;
//        } else  {
//            System.out.println("Nie masz dość środków. Pozostało: "+ cashAmount);
//            return 0;
//        }
//
//    }
    @Override
    protected int getMaxAmount() {
        return cashAmount;
    }
}
