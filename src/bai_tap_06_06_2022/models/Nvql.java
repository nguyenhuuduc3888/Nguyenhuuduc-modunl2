package bai_tap_06_06_2022.models;

public class Nvql extends Person {
    private String salaryCb;
    private String numSalary;

    public Nvql() {
    }

    public Nvql(String salaryCb, String numSalary) {
        this.salaryCb = salaryCb;
        this.numSalary = numSalary;
    }

    public Nvql(int id, String codePerson, String fullName, String dayOfBirth, String address, String salaryCb, String numSalary) {
        super(id, codePerson, fullName, dayOfBirth, address);
        this.salaryCb = salaryCb;
        this.numSalary = numSalary;
    }

    public String getSalaryCb() {
        return salaryCb;
    }

    public void setSalaryCb(String salaryCb) {
        this.salaryCb = salaryCb;
    }

    public String getNumSalary() {
        return numSalary;
    }

    public void setNumSalary(String numSalary) {
        this.numSalary = numSalary;
    }

    @Override
    public String inFor() {
         return String.format("%s,%s,%s,%s,%s,%s,%s",
                super.getId(),
                super.getCodePerson(),
                super.getFullName(),
                super.getDayOfBirth(),
                super.getAddress(),
                getSalaryCb(),
                getNumSalary()
        );
    }

    @Override
    public String toString() {
        return "Nvql{" + super.toString() +
                "salaryCb=" + salaryCb +
                ", numSalary=" + numSalary +
                '}';
    }
}
