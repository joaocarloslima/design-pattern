import ui.Player;
import ui.Ui;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        Ui ui = new Ui(player);
        ui.init();
    }
}
