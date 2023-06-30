/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package picturematching;

import picturematching.controllers.PermainanController;
import picturematching.views.Home;

/**
 *
 * @author Ramdan Rohendi
 */
public class Main {
    public static PermainanController permainanController;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        permainanController = new PermainanController();
        
        Home home = new Home();
        home.setVisible(true);

        System.out.println("Program Sedang Berjalan...");
    }
    
}
