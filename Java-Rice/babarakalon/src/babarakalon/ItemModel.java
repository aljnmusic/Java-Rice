/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package babarakalon;


public class ItemModel {
    private String name;
    private String price;

    public ItemModel(){
        this.name = "";
        this.price = "";
    }

    public ItemModel(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public void setBakalonName(String name) {
        if(name.equals("")){
            System.out.println("Bakalon Name is Empty");
            return;
        }

        this.name = name;
    }

}
