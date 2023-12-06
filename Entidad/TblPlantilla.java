package Entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_plantilla")
@NamedQueries({
    @NamedQuery(name = "TblPlantilla.findAll", query = "SELECT t FROM TblPlantilla t"),
    @NamedQuery(name = "TblPlantilla.findByCedula", query = "SELECT t FROM TblPlantilla t WHERE t.cedula = :cedula"),
    @NamedQuery(name = "TblPlantilla.findByNombres", query = "SELECT t FROM TblPlantilla t WHERE t.nombres = :nombres"),
    @NamedQuery(name = "TblPlantilla.findByApellidos", query = "SELECT t FROM TblPlantilla t WHERE t.apellidos = :apellidos"),
    @NamedQuery(name = "TblPlantilla.findBySeniores", query = "SELECT t FROM TblPlantilla t WHERE t.seniores = :seniores"),
    @NamedQuery(name = "TblPlantilla.findByFecha", query = "SELECT t FROM TblPlantilla t WHERE t.fecha = :fecha")})
public class TblPlantilla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cedula")
    private Integer cedula;
    @Basic(optional = false)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
    @Column(name = "apellidos")
    private String apellidos;
    @Basic(optional = false)
    @Column(name = "seniores")
    private String seniores;
    @Basic(optional = false)
    @Column(name = "fecha")
    private String fecha;

    public TblPlantilla() {
    }

    public TblPlantilla(Integer cedula) {
        this.cedula = cedula;
    }

    public TblPlantilla(Integer cedula, String nombres, String apellidos, String seniores, String fecha) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.seniores = seniores;
        this.fecha = fecha;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSeniores() {
        return seniores;
    }

    public void setSeniores(String seniores) {
        this.seniores = seniores;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
