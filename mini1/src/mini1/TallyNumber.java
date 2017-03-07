package mini1;

import com.sun.deploy.util.StringUtils;

public class TallyNumber {

    //integer representation of the tally stuff
    private int intRep;
    //string representation of the tally stuff
    private String strRep;

    private int num5;
    private int num1;

    private int numSpace;

    public TallyNumber(int givenValue) {
        intRep = givenValue;
        num5 = givenValue / 5;
        num1 = givenValue % 5;
        //strRep = str5.repeat(num5) + str1.repeat(num1);
        strRep = repeat("*", num5) + repeat("|", num1);
    }


    public TallyNumber(String givenString) {
        strRep = givenString;
        countSpaces();
        int sum =0;
        for (int i = 0; i < strRep.length(); i++) {
            if (strRep.charAt(i) == '|') {
                sum += 1;
            } else if (strRep.charAt(i) == '*') {
                sum += 5;
            }
            //else if (strRep.charAt(i) == ' '){}
        }

    }

    public String getStringValue() {
        return strRep;
    }

    public int getIntValue() {
        return intRep;
    }

    public static void add(TallyNumber other) {

    }

    public static void combine(TallyNumber other) {

    }

    public void normalize() {

    }
    //found this method, allows me to make a string that has a character repeated, some number of times
    public static String repeat(String str, int times){
        return new String(new char[times]).replace("\0", str);
    }
    private void countSpaces(){
        for (int i =0; i <strRep.length(); i++) {
            if (strRep.charAt(i) == ' '){
                numSpace +=1;
            }
        }
    }
}

