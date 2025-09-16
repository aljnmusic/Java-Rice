package arraylistbasicoperations;

import java.util.ArrayList;

public class fruitClass {
    public ArrayList<String> fruits = new ArrayList();
    

    public fruitClass() {
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Mango");
        fruits.add("Pineapple");
        fruits.add("Peach");
        fruits.add("Strawberry");
        fruits.add("Watermelon");
        fruits.add("Kiwi");
    }

    public void firstLastFruit() {
        System.out.println("The first fruit is " + fruits.get(0) + " and the last fruit is " + fruits.get(fruits.size() - 1));
    }
    
    public void changeSecondFruit(){
        System.out.println("The old second fruit is: " + fruits.get(1) + ", while the new second fruit is: " + fruits.set(1, "Plum"));
    }
    
    public void newList(){
        System.out.println("The new fruit list after removing the last element is: " + fruits.remove(9));
    }
    
    public void printFruits(){
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
