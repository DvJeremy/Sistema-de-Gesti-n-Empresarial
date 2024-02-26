
package Entrada.modelo;

import java.util.List;


public interface IDAOusuario {
    public boolean registrar(Usuario x);
    public boolean modificar(Usuario x);
    public List<Usuario> recorrer();
}
