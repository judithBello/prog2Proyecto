package edu.ub.prog2.BelloJudithOrnaqueOriol.vista;

import edu.ub.prog2.utils.Menu;
import java.util.Scanner;

public class AplicacioUB1 {
    
    
    
    //Constructor
    public AplicacioUB1(){
        System.out.println("Objeto aplicacioub1 creado");
    }
    
    
    
    public void gestioAplicacioUB(){
        System.out.println("Hello");
        String titol = "Titulo";
        enum OpcionsMenuPrincipal {MENU_PRINCIPAL_OPCIO1,MENU_PRINCIPAL_OPCIO2,MENU_PRINCIPAL_SUBMENU1,MENU_PRINCIPAL_SORTIR};
        Menu menu = new Menu(titol, OpcionsMenuPrincipal);
        menu.mostrarMenu();
        
    }

}
