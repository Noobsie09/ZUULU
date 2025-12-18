
/**
 * Diese Klasse ist Teil der Anwendung "Die Welt von Zuul".
 * "Die Welt von Zuul" ist ein sehr einfaches textbasiertes 
 * Adventure-Game.
 * 
 * Diese Klasse h?lt eine Aufz?hlung aller Befehlsw?rter, die dem
 * src.Spiel bekannt sind. Mit ihrer Hilfe werden eingetippte Befehle
 * erkannt.
 *
 * @author  Michael K?lling und David J. Barnes
 * @version 2016.02.29
 */

class Befehlswoerter
{
    // ein konstantes Array mit den gültigen Befehlswörtern
    private static final String gueltigeBefehle[] = {
        "go", "quit", "help"
    };

    /**
     * Konstruktor - initialisiere die Befehlswörter.
     */
    public Befehlswoerter()
    {
        // nichts zu tun momentan ...
    }

    /**
     * Prüfe, ob eine gegebene Zeichenkette ein g?ltiger
     * src.Befehl ist.
     * @return 'true', wenn die gegebene Zeichenkette ein gültiger
     * src.Befehl ist, 'false' sonst.
     */
    public boolean istBefehl(String eingabe)
    {
        for(int i = 0; i < gueltigeBefehle.length; i++) {
            if(gueltigeBefehle[i].equals(eingabe))
                return true;
        }
        // Wenn wir hierher gelangen, wurde die Eingabe nicht
        // in den Befehlswörter gefunden.
        return false;
    }
}
