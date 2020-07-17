package Model;

import Model.Preguntas.Preguntas.Concreta;
import org.uqbar.commons.utils.Observable;

import java.util.List;

@Observable
public class Examen
{
    String nombre;
    List<Concreta> preguntas;

    public Examen (String nombre, List<Concreta> preguntas)
    {
        this.nombre=nombre;
        this.preguntas=preguntas;
    }
    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }
}
