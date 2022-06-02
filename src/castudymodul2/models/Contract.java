package castudymodul2.models;

public class Contract {
    private int someContracts;//so hop dong ...
    private int bookingCode;// ma booking ...
    private int moneyDeposit;//so tien coc truoc...
    private int sumMoney;// tong tien thanh toan...
    private int customerCode;//ma khach hang...

    public Contract() {
    }

    public Contract(int someContracts, int bookingCode, int moneyDeposit, int sumMoney, int customerCode) {
        this.someContracts = someContracts;
        this.bookingCode = bookingCode;
        this.moneyDeposit = moneyDeposit;
        this.sumMoney = sumMoney;
        this.customerCode = customerCode;
    }

    public int getSomeContracts() {
        return someContracts;
    }

    public void setSomeContracts(int someContracts) {
        this.someContracts = someContracts;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getMoneyDeposit() {
        return moneyDeposit;
    }

    public void setMoneyDeposit(int moneyDeposit) {
        this.moneyDeposit = moneyDeposit;
    }

    public int getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(int sumMoney) {
        this.sumMoney = sumMoney;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "Contract có số hợp đồng là: " + someContracts +
                " Mã booking là: " + bookingCode +
                " Tiền cọc trước là: " + moneyDeposit +
                " Tổng tiền thanh toán là: " + sumMoney +
                " Mã khách hàng là: " + customerCode;
    }
}
