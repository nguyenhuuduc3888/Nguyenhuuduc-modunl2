package castudy_modul2.until;
import castudy_modul2.models.Booking;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDate1 = LocalDate.parse(o1.getDayStart(), formatter);
        LocalDate startDate2 = LocalDate.parse(o2.getDayStart(), formatter);
        LocalDate stopDate1 = LocalDate.parse(o1.getDaySop(), formatter);
        LocalDate stopDate2 = LocalDate.parse(o2.getDaySop(), formatter);
        if (startDate1.compareTo(startDate2) > 0) {
            return 1;
        } else if (startDate1.compareTo(startDate2) < 1) {
            return -1;
        }else {
            if(stopDate1.compareTo(stopDate2)>0){
                return 1;
            }else  if(stopDate1.compareTo(startDate2)<0){
                return -1;
            }else return 0;
        }
    }
}
