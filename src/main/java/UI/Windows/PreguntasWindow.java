package UI.Windows;

import UI.VM.ExamenesModel;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import Model.Examen;

public class PreguntasWindow extends Dialog<ExamenesModel> {

    public PreguntasWindow(WindowOwner parent) {
        super(parent, new ExamenesModel());
    }

    @Override
    protected void addActions(Panel panelActions) {
        new Button(panelActions).setCaption("Siguiente").onClick(this::siguiente);
        new Button(panelActions).setCaption("Finalizar").onClick(this::finalizar);
    }


    protected void createFormPanel(Panel formPanel) {
        this.setTitle("Examen:" + ExamenesModel().getExamenSeleccionado().getNombre());

        formPanel.setLayout(new VerticalLayout());

        new Label(formPanel).setText( ExamenesModel().getExamenSeleccionado().getNombre());


        Table tableVentas = new Table<>(formPanel, Examen.class);
        Column<Examen> columnaFecha = new Column<Examen>(tableVentas);
        columnaFecha.setTitle("Fecha");

        Column<Examen> columnaPrenda = new Column<Examen>(tableVentas);
        columnaPrenda.setTitle("Prenda");

        Column<Examen> columnaUnidades = new Column<Examen>(tableVentas);
        columnaUnidades.setTitle("Prenda");

        tableVentas.setHeight(300);
        tableVentas.setWidth(600);
    }

    public void siguiente()
    {

    }

    public void finalizar() {
        this.close();
    }

}
