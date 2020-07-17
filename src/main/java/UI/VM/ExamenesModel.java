package UI.VM;

import java.util.List;

import Model.Repositorios.Repositorios;
import org.uqbar.commons.utils.Observable;

import Model.Examen;
//import Model.repositories.Repositorios;

@Observable
public class ExamenesModel extends  AlgoViewModel
{

    private String nombre;
    private List<Examen> examenes;
    private Examen examenSeleccionado;
    private AlgoViewModel instance;

    public ExamenesModel() { this.examenes = Repositorios.examenes.all(); }

    public AlgoViewModel getInstance()
    {
        if (instance==null)
        {
            instance=new ExamenesModel();
        }
        else
        {
            return this;
        }
    }
    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public Examen getExamenSeleccionado() {
        return examenSeleccionado;
    }

    public void setExamenSeleccionado(Examen examenSeleccionado) {
        this.examenSeleccionado = examenSeleccionado;
    }

    public List<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(List<Examen> examenes) { this.examenes = examenes; }
}
