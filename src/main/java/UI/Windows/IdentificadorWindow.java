package UI.Windows;

import UI.VM.IdentificadorModel;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.TextBox;

public class IdentificadorWindow extends Dialog<IdentificadorModel>
{
    WindowOwner propietario;

    public IdentificadorWindow(WindowOwner owner) {
        super(owner, new IdentificadorModel());
        propietario=owner;
    }

    protected void addActions(Panel panel)
    {
//        panel.("Campus Virtual");
//
//        panel.setLayout(new VerticalLayout());
//        new Label(panel).setText("Ingrese su usuario.");
//
//        new TextBox(panel).bindValueToProperty("usuario").toString();
//
        new Button(panel).setCaption("Ingresar").onClick(() -> IdentificadorModel.validar(propietario));

    }

    @Override
    protected void createFormPanel(Panel panel) {

       this.setTitle("Campus Virtual");

        panel.setLayout(new VerticalLayout());

        new Label(panel).setText("Ingrese su usuario.                                                                  ");

        new TextBox(panel).bindValueToProperty("usuario").toString();

//        new Button(panel).setCaption("Ingresar").onClick(() -> IdentificadorModel.validar(propietario));
//
//        new Button(panel).setCaption("Ver Examenes").onClick(this::completarExamen);
    }
}
