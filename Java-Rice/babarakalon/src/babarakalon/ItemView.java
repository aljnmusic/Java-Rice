/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package babarakalon;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemView {

    private Scanner sc = new Scanner(System.in);

    public int showMenu(){
        System.out.println("\nBakalon Manager");
        System.out.println("[A] Add New Item\n[U] Update Item\n[D] Delete Item\n[S] Show all Items\n[Q] Quit");
        System.out.print("Enter choice: ");
        String option = sc.nextLine();

        int optionCode;

        switch (option){
            case "A":
            case "a":
                optionCode = 1;
                break;

            case "U":
            case  "u":
                optionCode = 2;
                break;

            case "D":
            case  "d":
                optionCode = 3;
                break;

            case "S":
            case "s":
                optionCode = 4;
                break;

            case "Q":
            case "q":
                optionCode = 0;
                break;

            default:
                optionCode = -1;
        }

        return optionCode;
    }

    public ItemModel addItemView(){
        System.out.println("Add New Item");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        String price = sc.nextLine();

        if(name.equals("") || price.equals("")){
            System.out.println("Invalid Input");
            return null;
        }

        return new ItemModel(name, price);
    }

    public ItemModel updateItemView(){
        System.out.println("Update Item");
        System.out.print("Name: ");
        String name = sc.nextLine();

        return new ItemModel(name, "");
    }

    public ItemModel deleteItemView(){
        System.out.println("Delete Item");
        System.out.print("Name: ");
        String name = sc.nextLine();

        return new ItemModel(name, "");
    }

    public ItemModel printItemView(ArrayList<ItemModel> items){
        for(ItemModel item : items){
            System.out.println("Item Name: " + item.getGroceryName() + " Price: " + item.getGroceryPrice());
        }

        System.out.println("--------------------");
        return null;
    }
}
