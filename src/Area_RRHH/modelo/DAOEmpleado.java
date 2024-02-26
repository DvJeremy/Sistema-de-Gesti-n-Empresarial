/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Area_RRHH.modelo;

/**
 *
 * @author 51939
 */
public interface DAOEmpleado {
    public void registrar(Empleado empleado);
    public void modificar(Empleado empleado);
    public void eliminar(Empleado empleado);
    public void buscar(Empleado empleado);
}
