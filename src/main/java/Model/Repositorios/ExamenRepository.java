package Model.Repositorios;

import Model.Examen;
import Model.Usuario;

import java.util.LinkedList;
import java.util.List;

public class ExamenRepository
{
    private List<Examen> examenes = new LinkedList<>();

    public void agregar(Examen examen) {
        this.examenes.add(examen);
    }

    public List<Examen> all() {
        return examenes;
    }
}
