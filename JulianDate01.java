import java.util.*;

public class JulianDate01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        System.out.println(dateFormat(date));
    }

    public static String dateFormat(String date) {
        String st = "";
        String[] dateArray = date.split("-");

        int dd = Integer.parseInt(dateArray[0]);
        int mon = convertMMMtoMM(dateArray[1]);
        int yyyy = Integer.parseInt(dateArray[2]);

        st += yyyy + julianDate(dd,mon);

        return st;
    }

    public static String julianDate(int dd, int mon) {
        String newSt = "";
        int[] month = {0, 31, 59, 90, 120, 152, 181, 212, 243, 273, 304, 334, 365};
        int jd = month[mon-1] + dd;

        if(jd <= 9) {
            newSt += "00" + jd;
        }
        else if(jd >= 10 && jd <= 99) {
            newSt += "0" + jd;
        }
        else {
            newSt += jd;
        }

        return newSt;
    }

    public static int convertMMMtoMM(String mon) {
        String months = "JANFEBMARAPRMAYJUNJULAUGSEPOCTNOVDEC";
        mon = mon.substring(0,3);
        mon = mon.toUpperCase();

        int monthNumber = (months.indexOf(mon)/3) + 1;
        return monthNumber;
    }
}
