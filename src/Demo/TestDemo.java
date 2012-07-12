/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

/**
 *
 * @author Mrunal
 */
public class TestDemo {
    
    String str = "Mrunal";
    int strLength = str.length();
    
    char arr[] = str.toCharArray();
    
    public static void main(String args[]){
        TestDemo tm = new TestDemo();
        System.out.println(tm.strLength);
        System.out.println(tm.arr[0]);
        System.out.println(tm.arr[1]);
        System.out.println(tm.arr[2]);
        
    }
    
    
    
}
