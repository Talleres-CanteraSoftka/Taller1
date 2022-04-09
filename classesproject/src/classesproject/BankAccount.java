package classesproject;

/**
 * la clase BankAccount representa una cuenta bancaria, la cual tiene como atributos accountNumber y activated.
 * accountNumber almacena el numero de cuenta bancaria y activated almacena si la cuenta esta activa o no.
 * @author Jhon Dorado
 */
public class BankAccount {
    private int accountNumber;
    protected  boolean activated;

    /**
     *
     * @return nos retorna el numero de cuenta bancaria
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @param accountNumber nos permite establecer el numero de cuenta bancaria
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     *
     * @return nos retorna si la cuenta bancaria esta activada o no
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     *
     * @param activated nos permite establece si la cuenta se encuentra activada o no
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
