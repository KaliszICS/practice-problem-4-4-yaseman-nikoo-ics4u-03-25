/**
 * It includde methods to convert a vlue to string, or convert meters to centimeters. It also contains a method to remove any non-letter characters in an string.
 * @authod Yaseman
 * @version 0.29.0
 */
public final class CampbellClass{
    /**
     * To denied access to the users to make object.
     */
    private CampbellClass(){
    }
    /**
     * convert any integer to string
     * @param num
     * @return num as a string
     */
    public static String convertString(int num){
        return Integer.toString(num);
    }
    /**
     * convert any double to string
     * @param a
     * @return a as a string
     */
    public static String convertString(double a){
        return Double.toString(a);
    }
    /**
     * convert character to string
     * @param l
     * @return l as a string
     */
    public static String convertString(char l){
        return Character.toString(l);
    }
    /**
     * convert boolean to string
     * @param f
     * @return return f as a string
     */
    public static String convertString(boolean f){
        return Boolean.toString(f);
    }
    /**
     * convert meters to centimeters 
     * @param num
     * @return the value of num in centimeters as integer
     */
    public static int convertMetersToCenti(int num){
        return num*100;
    }
    /**
     *convert meters to centimeters 
     * @param num
     * @returnthe value of num in centimeters as dobule
     */
    public static double convertMetersToCenti(double num){
        return num*100.0;
    }

/**
 * remove any non-letter character from the word
 * @param word
 * @param caseL
 * @return mthe word in lower or upper case letter depeending caseL
 */
    public static String removeNonAlpha(String word){
    word= word.replaceAll("[^a-zA-z]", "");
    return word;
    }
    public static String removeNonAlpha(String word, boolean caseL){
        word= word.replaceAll("[^a-zA-z]", "");
        if (caseL){
            return word.toUpperCase();
        }
        return word.toLowerCase();
    }
}