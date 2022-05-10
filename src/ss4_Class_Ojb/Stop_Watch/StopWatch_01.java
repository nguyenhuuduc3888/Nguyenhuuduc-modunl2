package ss4_Class_Ojb.Stop_Watch;

public class StopWatch_01 {
    private long startTime, endTime;

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public StopWatch_01() {// phương thức khởi tạo không tham số...
        startTime = System.currentTimeMillis();//khởi taọ startTime bằng với thời gian hệ thống..
    }

    public void start() {//Phương thức start() để reset startTime về thời gian hiện tại của hệ thống
        startTime = System.currentTimeMillis();
    }

    public void stop() {//Phương thức stop() để thiết đặt endTime về thời gian hiện tại của hệ thống.
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}


