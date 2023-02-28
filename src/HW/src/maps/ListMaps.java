package HW.src.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ListMaps {
    public static void main(String[] args) {
        // Step 1: Create a list of Map
        List<Map<String, Object>> dataList = new ArrayList<>();

        // Step 2: Create appleMap and add pairs to it
        Map<String, Object> appleMap = new HashMap<>();
        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity", 10);

        // Step 3: Add appleMap to dataList
        dataList.add(appleMap);

        // Step 4: Create orangeMap and add pairs to it
        Map<String, Object> orangeMap = new HashMap<>();
        orangeMap.put("Items", "Orange");
        orangeMap.put("Price", 21.99);
        orangeMap.put("Quantity", 10);

        // Step 5: Add orangeMap to dataList
        dataList.add(orangeMap);

        // Step 6: Create a loop from dataList
        double totalPurchase = 0.0;
        for (Map<String, Object> item : dataList) {

            // Step 7: Retrieve each Key and store is in a variable
            String items = (String) item.get("Items");
            double price = (double) item.get("Price");
            int quantity = (int) item.get("Quantity");

            // Step 8: calculate the subtotal of each object
            double subtotal = price * quantity;

            // Step 9: Print the values of each Iteration same as shown below in Output example
            System.out.println("Items: " + items + ", Price: " + price + ", Quantity: " + quantity + ", Subtotal: " + subtotal);

            // Step 10: Calculate the Sum of subtotal and store it in variable called totalPurchase
            totalPurchase += subtotal;
        }

        // Step 11: After Loop Print the value of Total Purchase.
        System.out.println("Total Purchase: " + totalPurchase);
    }
}
