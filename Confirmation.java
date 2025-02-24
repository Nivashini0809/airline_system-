public class Confirmation {
    private String custName;
    private String confNumber;
    private boolean isAlohaMember;

    public Confirmation(String custName, String confNumber, boolean isAlohaMember) {
        if (confNumber.length() != 6) {
            throw new IllegalArgumentException("Confirmation code must be 6 characters!");
        }
        this.custName = custName;
        this.confNumber = confNumber;
        this.isAlohaMember = isAlohaMember;
    }

    public String getName() { return custName; }
    public String getConfNumber() { return confNumber; }
    public boolean isAlohaMember() { return isAlohaMember; }

    public String toString() {
        return "Confirmation: " + confNumber + " for " + custName + " (Aloha Member: " + isAlohaMember + ")";
    }
}
