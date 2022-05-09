package ss4_Class_Ojb.practice;

public class Tho_Lam_Banh_Mi {//tạo class và khai thuộc tính của class 1...
    private String tên;
    private int tuổi;
    private Bột bột;//tạo ra đối tượng bột để người nhào bột gì...

    public void nhồiBột(Bột bột) {// tạo phương thức 1 để nhồi bột ...truyền vào bột
        System.out.println(" Đưc làm bánh bằng " + bột.getTênbột());
    }

    // tạo setter và gọi getter của các thuộc tính của class 1...
    public void setTên(String tên) {
        this.tên = tên;
    }

    public String getTên() {
        return tên;
    }

    public void setTuổi(int tuổi) {
        this.tuổi = tuổi;
    }

    public int getTuổi() {
        return tuổi;
    }

    public void setBột(Bột bột) {
        this.bột = bột;
    }

    public Bột getBột() {
        return bột;
    }
}

class Bột {//tạo class và các thuộc tính của class 2....
    private String tênbột;
    private int khốilượng;

    // setter và gọi getter của các thuộc tính class 2....
    public void setTênbột(String tênbột) {
        this.tênbột = tênbột;
    }

    public String getTênbột() {
        return tênbột;
    }

    public void setKhốilượng(int khốilượng) {
        this.khốilượng = khốilượng;
    }

    public int getKhốilượng() {
        return khốilượng;
    }
}

class Mainn{// tạo class  main để chạy chương trình...

    public static void main(String[] args) {
        Tho_Lam_Banh_Mi người = new Tho_Lam_Banh_Mi();//tạo đối tượng 'người'...
        người.setTên("Đức");//set tên cho đối tượng người...
        người.setTuổi(25);// set tuổi cho đối tượng người...
        Bột bột = new Bột();//tạo đối tượng 'bột'...
        bột.setTênbột("Bột mì");//set tên cho đối tượng bột...
        bột.setKhốilượng(1);//set khối lượng cho đối tượng bột...
        người.setBột(bột);//set bột cho người...
        người.nhồiBột(bột);// người sẻ nhồi bột ...truyền tên bột vào
    }
}