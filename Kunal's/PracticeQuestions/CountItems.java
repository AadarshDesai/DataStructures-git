package PracticeQuestions;
import java.util.ArrayList;
import java.util.List;

public class CountItems {
    public static void main(String[] args){
        List<List<String>> items = new ArrayList<>();
        items.add(new ArrayList<>());
        items.add(new ArrayList<>());
        items.add(new ArrayList<>());
        items.get(0).add("phone");
        items.get(0).add("blue");
        items.get(0).add("pixel");
        items.get(1).add("computer");
        items.get(1).add("silver");
        items.get(1).add("lenovo");
        items.get(2).add("phone");
        items.get(2).add("gold");
        items.get(2).add("iphone");

        System.out.println(countMatches(items, "color", "silver"));
    }
    

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int count = 0;
        if(ruleKey.equals("type")){
            for(int i=0; i<items.size(); i++){
                if(items.get(i).get(0).equals(ruleValue)){
                    count++;
                }
            }
        }
        if(ruleKey.equals("color")){
            for(int i=0; i<items.size(); i++){
                if(items.get(i).get(1).equals(ruleValue)){
                    count++;
                }
            }
        }
        if(ruleKey.equals("name")){
            for(int i=0; i<items.size(); i++){
                if(items.get(i).get(2).equals(ruleValue)){
                    count++;
                }
            }
        }
        
        return count;
    }
}
