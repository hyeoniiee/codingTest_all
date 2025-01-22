import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] fullFood = br.readLine().split(" ");
        String[] usedFood = br.readLine().split(" ");

        Map<String, Integer> foodCount = new HashMap<>();

        for (String food : fullFood) {
            foodCount.put(food, foodCount.getOrDefault(food, 0) + 1);
        }

        for (String food : usedFood) {
            foodCount.put(food, foodCount.get(food) - 1);
        }

        for (String food : foodCount.keySet()) {
            if (foodCount.get(food) == 1) {
                System.out.println(food);
                break; 
            }
        }
    }
}
