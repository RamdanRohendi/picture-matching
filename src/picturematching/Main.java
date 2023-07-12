/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package picturematching;

import picturematching.controllers.PermainanController;
import picturematching.views.Home;
import picturematching.models.User;

/**
 *
 * @author Ramdan Rohendi
 */
public class Main {
    public static PermainanController permainanController;
    public static boolean is_login;
    public static User userlogin;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        permainanController = new PermainanController();
        userlogin = new User();
        is_login = false;
        
        Home home = new Home();
        home.setVisible(true);

        System.out.println("Program Sedang Berjalan...");
    }
    
}
