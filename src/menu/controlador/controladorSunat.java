
package menu.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;
import menu.vista.Sunat;


public class controladorSunat implements ActionListener{

    private Sunat sn;

    public controladorSunat(Sunat sn) {
        this.sn = sn;
        this.sn.setSize(1010,560);
        this.sn.btnruc.addActionListener(this);
        this.sn.btnsunat.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == sn.btnruc) {
            if (java.awt.Desktop.isDesktopSupported()) {
                java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

                if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                    try {
                        java.net.URI uri = new java.net.URI("https://e-consultaruc.sunat.gob.pe/cl-ti-itmrconsruc/jcrS00Alias");
                        desktop.browse(uri);
                    } catch (URISyntaxException | IOException ex) {
                        System.out.println(ex);
                    }
                }
            }
        }
        if (ae.getSource() == sn.btnsunat) {
            if (java.awt.Desktop.isDesktopSupported()) {
                java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

                if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                    try {
                        java.net.URI uri = new java.net.URI("https://www.sunat.gob.pe/");
                        desktop.browse(uri);
                    } catch (URISyntaxException | IOException ex) {
                        System.out.println(ex);
                    }
                }
            }
        }
    }
    
}
