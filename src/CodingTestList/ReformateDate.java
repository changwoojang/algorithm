package CodingTestList;

import java.util.HashMap;

public class ReformateDate {
    static HashMap<String, String> monthHashMap = new HashMap<String, String>();
    static HashMap<String, String> dayHashMap = new HashMap<String, String>();

    /*
     * Complete the function below.
     */
    static String[] reformatDate(String[] dates) {
        String[] eachDate = null;
        String[] result = new String[dates.length];

        makeDay();
        makeMonth();
        for (int i = 0; i < dates.length; i++) {

            eachDate = dates[i].split(" ");
            result[i] = getYear(eachDate[2]) + "-" + monthHashMap.get(eachDate[1]) + "-" + dayHashMap.get(eachDate[0]);

        }
        return result;
    }

    static String getYear(String year) {
        return year;
    }

    static void makeDay() {

        dayHashMap.put("1st", "01");
        dayHashMap.put("2nd", "02");
        dayHashMap.put("3rd", "03");

        for (int i = 4; i <= 30; i++) {
            if (i < 10) {
                dayHashMap.put(i + "th", "0" + i);
            } else {
                dayHashMap.put(i + "th", "" + i);
            }
        }
        dayHashMap.put("31st", "31");

    }

    static void makeMonth() {
        monthHashMap.put("Jan", "01");
        monthHashMap.put("Feb", "02");
        monthHashMap.put("Mar", "03");
        monthHashMap.put("Apr", "04");
        monthHashMap.put("May", "05");
        monthHashMap.put("Jun", "06");
        monthHashMap.put("Jul", "07");
        monthHashMap.put("Aug", "08");
        monthHashMap.put("Sep", "09");
        monthHashMap.put("Oct", "10");
        monthHashMap.put("Nov", "11");
        monthHashMap.put("Dec", "12");
    }
}