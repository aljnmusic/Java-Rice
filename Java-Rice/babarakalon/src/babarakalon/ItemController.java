/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package babarakalon;

import java.util.Scanner;
import java.util.ArrayList;

public class ItemController {
    private ItemView view;
    private ArrayList<ItemModel> items;

    public ItemController(){
        this.view = new ItemView();
        this.items = new ArrayList<>();
    }

    public int addItem(ItemModel item){
        items.add(item);
        return 0;
    }

    public int deleteItem(ItemModel item){
        items.remove(item);
        return 3;
    }

    public int updateItem(ItemModel item){
        int index = searchItem(item);

        if(index == -1){
            return 1;
        }

        Scanner sc = new Scanner(System.in);


    }

    public int searchItem(ItemModel item){
        for(int i = 0;  i < this.items.size(); i++){
            if(items.get(i).getGroceryName().equals(item.getGroceryName())){
                return i;
            }
        }

        return -1;
    }
}
