package CodingTestList;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Complete the function below.
 */
public class RomeNumberConverter {

    static String[] getSortedList(String[] names) {

        for (int i = 0; i < names.length; i++) {
            String[] nameAndOrder = names[i].split(" ");
            String name = nameAndOrder[0];
            String order = getOrder(20);
            System.out.println(order);
        }
        return null;
    }

    static String getOrder(int orderNum) {
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<String, Integer>();

        numbers.put("I", 1);
        numbers.put("V", 5);
        numbers.put("IV", 4);
        numbers.put("IX", 9);
        numbers.put("XX", 20);
        numbers.put("XXX", 30);
        numbers.put("XL", 40);
        numbers.put("L", 50);

        String result = "";
        for (Map.Entry<String, Integer> entry : numbers.entrySet()) {
            int temp = orderNum / entry.getValue();
            result += repeat(entry.getKey(), temp);
            orderNum = orderNum % entry.getValue();

        }
        return result;
    }

    static String repeat(String str, int n) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);

        }
        return sb.toString();
    }

    static int getOrderValue(String order) {
        if (order.contains("X")) {
            String temp = order.substring(1);
            if (temp.contains("X")) {
                String temp2 = temp.substring(1);
                if (temp2.contains("X")) {
                    return 30;
                }
                return 20;
            } else if (temp.contains("L")) {
                return 40;
            }
            return 10;
        }
        return 50;
    }
}