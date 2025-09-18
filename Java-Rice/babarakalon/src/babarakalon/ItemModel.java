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

    public void setGroceryName(String name) {
        if(name.equals("")){
            System.out.println("Grocery name is empty");
            return;
        }

        this.name = name;
    }

    public String getGroceryName() {
        return this.name;
    }

    public void setGroceryPrice(String price) {
        if(price.equals("")){
            System.out.println("Grocery Price is Empty");
            return;
        }

        this.price = price;
    }

    public String getGroceryPrice() {
        return this.price;
    }

    @Override
    public String toString(){
        return "{ \"name\": " + this.name + ", \"price\":" + this.price + "}";
    }

}
