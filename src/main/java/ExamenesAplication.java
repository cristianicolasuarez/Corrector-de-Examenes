import UI.Windows.IdentificadorWindow;
import org.uqbar.arena.Application;

public class ExamenesAplication extends Application {

    public static void main(String[] args) {
        Fixture.initialize();
        new ExamenesAplication().start();
    }

    @Override
    protected IdentificadorWindow createMainWindow() { return new IdentificadorWindow(this); }
}