/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

/**
 *
 * @author tnealo01
 */
public class MyMap {  //implements SimpleMap {
    
    MapItem entry = null;
    
    public String put(int key, String name) {
        if(this.get(key) != "NOT_FOUND") {
            if(entry==null) {
                entry = new MapItem(key, name);
            } else {
                MapItem temp = new MapItem(key, name);
                temp.next = entry;
                entry = temp;
            }

            return name;
        } else {
            return "key already exists";
        }

    }
    
    public String get(int key) {
        boolean finished = false;
        MapItem currentItem = this.entry;
        do{
            if(currentItem.next == null) {
                return "NOT_FOUND";
            } else if(currentItem.key == key) {
                finished = true;
            }
            currentItem = currentItem.next;
        } while (!finished);
        return currentItem.value;

    }
    
    public void launch() {
        this.put(221, "banana");
        this.put(245, "apple");
        this.put(536, "cherry");
        
        System.out.println(this.get(245));
        
        //System.out.println(this.put(536, "pineapple"));
    }
    
    public static void main(String[] args) {
        new MyMap().launch();
    }
}
