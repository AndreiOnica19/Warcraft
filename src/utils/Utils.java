package utils;

public class Utils {
    public static void waitInSeconds(double seconds) {
       try {
           Thread.sleep((long) (seconds * 1000));
       } catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
}
