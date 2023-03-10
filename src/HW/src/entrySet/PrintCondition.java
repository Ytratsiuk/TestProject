package HW.src.entrySet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintCondition
{
    public static void main(String[] args) {
        Map<String, Double> fruitMap= new HashMap<>();
        fruitMap.put("Soap",12.5);
        fruitMap.put("Banana",4.9);
        fruitMap.put("Dragon Fruit",5.6);
        fruitMap.put("pear",16.5);
        fruitMap.put("Orange",15.5);
        fruitMap.put("Mango",10.6);
        Set<Map.Entry<String,Double>> allKV= fruitMap.entrySet();
        for (Map.Entry<String,Double> fruit : allKV){
           if( fruit.getKey().contains("a")||fruit.getKey().contains("e")){
               if(fruit.getValue()>8){
                   System.out.println(fruit);
               }
           }
        }

    }
}
