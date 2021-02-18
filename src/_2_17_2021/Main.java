package _2_17_2021;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String>map=new HashMap<>();
        map.put("ice cream","cherry");
        map.put("spinach","dirt");
        System.out.println(topping(map));
    }
    /*
    Given a map of food keys and their topping values, modify and return the map as follows:
     if the key "ice cream" has a value, set that as the value for the key "yogurt" also.
     If the key "spinach" has a value, change that value to "nuts".
topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
     */
    public static Map<String, String> topping(Map<String, String> map) {
        for (String s : map.keySet()) {
            if (s=="ice cream")
                map.put("yogurt",map.get("ice cream"));
            if (s=="spinach")
                map.replace("spinach","nuts");
        }
        return map;

    }


}
