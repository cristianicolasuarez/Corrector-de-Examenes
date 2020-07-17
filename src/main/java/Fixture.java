import Model.Examen;
import Model.Preguntas.Preguntas.Concreta;
import Model.Preguntas.Preguntas.MultipleChoice;
import Model.Preguntas.Preguntas.Pregunta;
import Model.Preguntas.Preguntas.VerdaderoOFalso;
import Model.Repositorios.Repositorios;

import java.util.ArrayList;
import java.util.List;

public class Fixture
{
    public static void initialize() {
        Examen dds= new Examen("Diseño de Sistemas", null);
        Examen sisop= new Examen("Sistemas Operativos", null);

        Pregunta concreta= new Concreta("Es esta una pregunta concreta?");
        List<String> respuestasPosibles=new ArrayList<>();
        respuestasPosibles.add("SI");
        respuestasPosibles.add("NO");
        Pregunta multiple= new MultipleChoice("Es esta una pregunta multiple choice?",respuestasPosibles);
        Pregunta vof= new VerdaderoOFalso("Es esta una pregunta de verdadero o falso?");

        Repositorios.examenes.agregar(dds);
        Repositorios.examenes.agregar(sisop);
    }
}
