import java.awt.*;
import java.awt.event.*;

public class Main extends Frame implements KeyListener {
    public static void main(String [] args) {
        new Main();
    }

    Main() {
        super("Main");
        setSize(500, 500);
        setVisible(true);
        addKeyListener(this);

        Graphics g = this.getGraphics();
        g.setColor(Color.RED);
        g.fillOval(0, 25, 50, 50);
        g.dispose();
    }

    public void keyPressed(KeyEvent event) {
    }

    public void keyReleased(KeyEvent event) {
    }

    public void keyTyped(KeyEvent event) {
    }
}

