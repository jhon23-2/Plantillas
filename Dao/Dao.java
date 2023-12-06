package Dao;

import Controlador.TblPlantillaJpaController;
import Entidad.TblPlantilla;

public class Dao {

    private TblPlantilla plantilla = new TblPlantilla();
    private TblPlantillaJpaController controlador = new TblPlantillaJpaController();
    private String mensaje = "";

    public String insertDatos(int cedula, String nombres, String apellidos, String seniores, String fecha) {

        try {
            plantilla.setCedula(cedula);
            plantilla.setNombres(nombres);
            plantilla.setApellidos(apellidos);
            plantilla.setSeniores(seniores);
            plantilla.setFecha(fecha);

            controlador.create(plantilla);
            mensaje = "Trabajador Insertado a la plantilla Correctamente";
        } catch (Exception e) {
            mensaje = "Error Insertar " + e.getMessage();
        }

        return mensaje;
    }

}
