/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

/**
 *
 * @author tnealo01
 */
public class HashUtilities {
    
    static int shortHash(int i) {
        return Math.abs(1000%i);
    }
    
    public static void main(String[] args) {
        System.out.println(HashUtilities.shortHash(9));
        
        String str = new String("Bananas!");
        int hash = str.hashCode();
        System.out.println(hash);
        int smallHash = HashUtilities.shortHash(hash);
        System.out.println("0 < " + smallHash + " < 1000");
    }
    
}
