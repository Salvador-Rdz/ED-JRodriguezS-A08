/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.list;

/**
 *
 * @author Salvador
 */
public class EDList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        myList <String> lista = new  myList();
        lista.insertFirst("10");
        lista.insertFirst("30");
        lista.insertFirst("50");
        lista.insertLast("20");
        lista.insertFirst("40");
        lista.showlist();
        lista.deleteNode("10");
        lista.showlist();
        lista.deleteNode("30");
        lista.showlist();
        lista.deleteNode("20");
        lista.showlist();
        lista.deleteNode("40");
        lista.showlist();
        lista.deleteNode("50");
        lista.showlist();
    }
    
}
