/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

/**
 *
 * @author tnealo01
 */
public class MyMap implements SimpleMap {
    
    MapItem entry = null;
    
    public String put(int key, String name) {
        
        return retString;
    }
    
    public String get(int key) {
        boolean finished = false;
        MapItem currentItem = this.entry;
        do{
            if(currentItem.key == key) {
                finished= true;
            }
            currentItem = currentItem.next;
        } while (!finished);
        return currentItem.value;

    }
}
