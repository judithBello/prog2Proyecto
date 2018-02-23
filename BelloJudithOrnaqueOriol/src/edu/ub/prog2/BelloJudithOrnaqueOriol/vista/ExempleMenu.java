// package ...;

import edu.ub.prog2.utils.Menu;
import java.util.Scanner;

/**
 * Exemple d'utilitzaciÃ³ de la classe MenÃº. Aquest exemple requereix la llibreria
 * UtilsProg2.jar.
 * @author Xavier BarÃ³
 */
public class ExempleMenu {

    // Declarem les opcions per a referir-se a les opcions del menÃº.
    static private enum OpcionsMenuPrincipal {MENU_PRINCIPAL_OPCIO1,MENU_PRINCIPAL_OPCIO2,MENU_PRINCIPAL_SUBMENU1,MENU_PRINCIPAL_SORTIR};
    static private enum OpcionsSubmenu1 {MENU_S1_OPCIO1,MENU_S1_OPCIO2,MENU_S1_SORTIR};
    
    // Declarem descripcions personalitzades per a les opcions del menÃº principal
    static private String[] descMenuPrincipal={"Primera opciÃ³ del menÃº principal",
                                               "Segona opciÃ³ del menÃº principal",
                                               "Obre un menÃº secundari",
                                               "Sortir de l'aplicaciÃ³"};

    // Declarem descripcions personalitzades per a les opcions del menÃº secundari
    static private String[] descMenu2={"Primera OpciÃ³ del menÃº secundari",
                                                "Segona OpciÃ³ del menÃº secundari",
                                                "MenÃº anterior"};

    /**
     * Fitxer principal. Crea el menÃº principal i un menÃº secundari
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creem un objecte per llegir des del teclat
        Scanner sc=new Scanner(System.in);

        // Creem un objecte principal
        ExempleMenu app = new ExempleMenu();

        // Iniciem la gestiÃ³ del menÃº principal de l'aplicaciÃ³
        app.manager(sc);
    }

    /**
     * MenÃº principal del reproductor d'audio
     * @param sc Objecte de tipus Scanner que permet accedir al teclat
     */
    private void manager(Scanner sc) {

        // Creem l'objecte per al menÃº. Li passem com a primer parÃ metre el nom del menÃº
        Menu<OpcionsMenuPrincipal> menu=new Menu<OpcionsMenuPrincipal>("Menu Principal",OpcionsMenuPrincipal.values());

        // Assignem la descripciÃ³ de les opcions
        menu.setDescripcions(descMenuPrincipal);

        // Obtenim una opciÃ³ des del menÃº i fem les accions pertinents
        OpcionsMenuPrincipal opcio = null;
        do {
            // Mostrem les opcions del menÃº
            menu.showMenu();

            // Demanem una opcio
            opcio=menu.getOpcio(sc);

            // Fem les accions necessÃ ries
            switch(opcio) {
                case MENU_PRINCIPAL_OPCIO1:
                    // Mostrem un missatge indicant que s'ha triat aquesta opciÃ³
                    System.out.println("Has triat la opciÃ³ 1");
                    break;
                case MENU_PRINCIPAL_OPCIO2:
                    // Mostrem un missatge indicant que s'ha triat aquesta opciÃ³
                    System.out.println("Has triat la opciÃ³ 2");
                    break;
                case MENU_PRINCIPAL_SUBMENU1:
                    // Cridem el mÃ¨tode de gestiÃ³ del menÃº secundari
                    gestioMenuSecundari(sc);
                    break;
                
                case MENU_PRINCIPAL_SORTIR:
                    System.out.println("Fins aviat!");
                    break;
            }

        } while(opcio!=OpcionsMenuPrincipal.MENU_PRINCIPAL_SORTIR);
    }

    /**
     * MenÃº secundari
     * @param sc Objecte de tipus Scanner que permet accedir al teclat
     */
    private void gestioMenuSecundari(Scanner sc) {

        // Creem l'objecte per al menÃº. Li passem com a primer parÃ metre el nom del menÃº
        Menu<OpcionsSubmenu1> menu=new Menu<OpcionsSubmenu1>("Menu Secundari",OpcionsSubmenu1.values());

        // Assignem la descripciÃ³ de les opcions
        menu.setDescripcions(descMenu2);

        // Obtenim una opciÃ³ des del menÃº i fem les accions pertinents
        OpcionsSubmenu1 opcio = null;
        do {
            // Mostrem les opcions del menÃº
            menu.showMenu();

            // Demanem una opcio
            opcio=menu.getOpcio(sc);

            // Fem les accions necessÃ ries
            switch(opcio) {
                case MENU_S1_OPCIO1:
                    // Mostrem un missatge indicant que s'ha triat aquesta opciÃ³
                    System.out.println("Has triat la opciÃ³ 1");
                    break;
                case MENU_S1_OPCIO2:
                    // Mostrem un missatge indicant que s'ha triat aquesta opciÃ³
                    System.out.println("Has triat la opciÃ³ 2");
                    break;
                case MENU_S1_SORTIR:
                    System.out.println("Fins aviat!");
                    break;
            }

        } while(opcio!=OpcionsSubmenu1.MENU_S1_SORTIR);
    }

}
