package Assignment_Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

// import java.util.ArrayList;
// import java.util.List;

public class Easy_11 {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        
        // Add items to the ArrayList
        items.add(List.of("phone", "blue", "pixel"));
        items.add(List.of("computer", "silver", "phone"));
        items.add(List.of("phone", "gold", "iphone"));

        System.out.println(countMatches(items, "type", "phone"));
    }

   static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    int count = 0;
    if(ruleKey.equals("type")){
        for(int row=0; row<items.size(); row++){
            if(items.get(row).get(0).equals(ruleValue)){
                count++;
            }
        }
    }
    if(ruleKey.equals("color")){
        for(int row=0; row<items.size(); row++){
            if(items.get(row).get(1).equals(ruleValue)){
                count++;
            }
        }
    }
    if(ruleKey.equals("name")){
        for(int row=0; row<items.size(); row++){
            if(items.get(row).get(2).equals(ruleValue)){
                count++;
            }
        }
    }
    return count;
    }
}