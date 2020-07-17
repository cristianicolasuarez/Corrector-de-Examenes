package UI.Windows;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import Model.Examen;
import UI.VM.ExamenesModel;

public class ExamenWindow extends Dialog<ExamenesModel> {

    WindowOwner propietario;

    public ExamenWindow(WindowOwner owner) {
        super(owner,new ExamenesModel());
        this.propietario=owner;
    }

    @Override
    protected void createFormPanel(Panel mainPanel) {

        this.setTitle("Examenes Disponibles");

        Panel form = new Panel(mainPanel);
        form.setLayout(new ColumnLayout(2));

        new Label(form).setText("Examenes");
        Selector<Examen> selectorExamen = new Selector<Examen>(form).allowNull(true);
        selectorExamen.bindItemsToProperty("examenes");
        selectorExamen.bindValueToProperty("examenSeleccionado");

        new Label(form).setText("Examene Seleccionado");
        new Label(form).setText("");

        new Label(form).setText("Nombre");
        new Label(form).bindValueToProperty("examenSeleccionado.nombre");
    }

    @Override
    protected void addActions(Panel actions) {
        new Button(actions).setCaption("Completar").onClick(this::contestarPreguntas).setAsDefault();
        new Button(actions).setCaption("Cancelar").onClick(this::cancel);
    }

    public void contestarPreguntas() {
        Dialog<?> dialog = new PreguntasWindow(propietario);
        dialog.open();
        dialog.onAccept(() -> {});
    }

    public void cancel()
    {
        this.close();
    }

}