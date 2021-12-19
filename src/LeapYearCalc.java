public class LeapYearCalc {
    public static boolean isLeapYear(int year){

        if (year > 9999 || year <= 0){
            return false;
        } else return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
