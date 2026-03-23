/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.Objects;
/**
 *
 * @author abrah
 */
public class MostraGenetica {
    private String idMostra;
    private String Organismo;
    private int longitudCadena;

    public MostraGenetica(String idMostra, String Organismo, int longitudCadena) {
        this.idMostra = idMostra;
        this.Organismo = Organismo;
        this.longitudCadena = longitudCadena;
    }

    public MostraGenetica() {
    }

    public String getIdMostra() {
        return idMostra;
    }

    public String getOrganismo() {
        return Organismo;
    }

    public int getLongitudCadena() {
        return longitudCadena;
    }

    public void setIdMostra(String idMostra) {
        this.idMostra = idMostra;
    }

    public void setOrganismo(String Organismo) {
        this.Organismo = Organismo;
    }

    public void setLongitudCadena(int longitudCadena) {
        this.longitudCadena = longitudCadena;
    }

 

    @Override
    public String toString() {
        return "MostraGenetica{" + "idMostra=" + idMostra + ", Organismo=" + Organismo + ", longitudCadena=" + longitudCadena + '}';
    }

   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof MostraGenetica) {
            return false;
        }
        final MostraGenetica other = (MostraGenetica) obj;
        return Objects.equals(this.idMostra, other.idMostra);
    }
    
}
