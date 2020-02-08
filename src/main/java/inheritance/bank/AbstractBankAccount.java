package inheritance.bank;

public abstract class AbstractBankAccount {

    protected  String owner;
    protected int cashAmount;

    public AbstractBankAccount(String owner, int cashAmount) {
        this.owner = owner;
        this.cashAmount = cashAmount;
    }

//    public abstract int withdraw(int amount);

    public int withdraw(int amount) {
        int returnCash = 0;
        if (getMaxAmount() >= amount) {
            cashAmount -= amount;
            returnCash = amount;
        } else {
            System.out.println("Nie masz dość środków. Pozostało: " + cashAmount +" zł.");
        }
        return returnCash;
    }

    protected abstract int getMaxAmount();

    public String getOwner() {
        return owner;
    }

    public int getCashAmount() {
        return cashAmount;
    }
}
