/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

/**
 *
 * @author tnealo01
 */
public class MapItem {
    public Integer key;
    public String value;
    public MapItem next;
    
    public MapItem (int key, String value) {
        this.key = key;
        this.value = value;
        next = null;
    }
    
}
