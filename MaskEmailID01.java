import java.util.*;

public class MaskEmailID01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        System.out.println(maskMailID(email));
    }

    public static String maskMailID(String email) {
        int index = email.indexOf("@");
        String[] emailArray = email.split("@");
        String maskID = "";
        String XX = "";

        int size = emailArray[0].substring(2,index).length();

        for(int i=0; i<size; i++) {
            XX += "X";
        }

        maskID += emailArray[0].substring(0,2) + XX + "@" + emailArray[1];

        return maskID;
    }

}
