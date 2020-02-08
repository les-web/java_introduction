package inheritance.bank;

public class DebitBankAccount extends AbstractBankAccount {
 private int debit;

    public DebitBankAccount(String owner, int cashAmount, int debit) {
        super(owner, cashAmount);
        this.debit = debit;
    }


    @Override
    protected int getMaxAmount() {
        return cashAmount + debit;
    }
}
