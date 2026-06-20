public class LeapYear {
    public static void main(String[] args) {
        int year = 2028;
        String category = "Leap Year"; 
        
        
        boolean confirm = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
        
        
        String result = confirm ? (year + " is a " + category + ".") : (year + " is NOT a Leap Years.");
        
        System.out.println(result);
    }
}