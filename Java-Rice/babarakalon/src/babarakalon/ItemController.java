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
}
