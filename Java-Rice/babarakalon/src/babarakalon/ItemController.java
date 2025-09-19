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

        System.out.print("Input updated name: ");
        String name = sc.nextLine();

        System.out.print("Input updated price: ");
        String price = sc.nextLine();

        items.get(index).setGroceryName(name);
        items.get(index).setGroceryPrice(price);

        return 0;
    }

    public int searchItem(ItemModel item){
        for(int i = 0;  i < this.items.size(); i++){
            if(items.get(i).getGroceryName().equals(item.getGroceryName())){
                return i;
            }
        }

        return -1;
    }

    public void printStatus(int opcode){
        if(opcode == 0){
            System.out.print("Operation sucessfull.");
        } else if(opcode == 1){
            System.out.print("Operation failed.");
        } else{
            System.out.print("Unrecognized operation");
        }
    }

    void initialize(){
        boolean running = true;

        do{
            int option = view.showMenu();
            int opcode = 0;

            switch (option){
                case 1:
                    option = addItem(view.addItemView());
                    printStatus(opcode);
                    break;

                case 2:
                    option = updateItem(view.updateItemView());
                    printStatus(opcode);
                    break;

                case 3:
                    option = deleteItem(view.deleteItemView());
                    printStatus(opcode);
                    break;

                case 4:
                    view.printItemView(items);
                    printStatus(opcode);
                    break;

                case 0:
                    System.out.println("Operation terminated.");
                    break;

                default:
                    System.out.println("Unrecognized operation");
            }

        } while(running);
    }
}
