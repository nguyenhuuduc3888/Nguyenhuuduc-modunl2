package ss4_Class_Ojb.Fan;

public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "Xanh da trời";

    /**
     * Tạo các setter và getter cho các trường...
     */
    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Phương thức khởi tạo không tham số tạo đối tượng fan mặc định
     */
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    @Override //Đánh dấu phương thức ghi đè
    public String toString() {
        String status = " ";
        if (this.on) {
            status += ("Quạt đang bật\n");
            status += ("Tốc độ của quạt là " + this.speed + "\n");
        } else {
            status += ("Quạt đang tắt\n");
        }
        status += ("Màu sắc " + this.color + "\n");
        status += ("Bán kinh " + this.radius + "\n");
        return status;
    }

}
