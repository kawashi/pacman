import java.awt.*;
import java.awt.event.*;

import static java.awt.event.KeyEvent.*;

public class Main extends Frame implements KeyListener {
    int x = 0;
    int y = 25;

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
        g.fillOval(x, y, 50, 50);
        g.dispose();
    }

    public void keyPressed(KeyEvent event) {
        Graphics g = this.getGraphics();
        g.clearRect(x, y, 50, 50);

        if ( event.getKeyCode() == VK_DOWN ) {
            y += 50;
        }
        if ( event.getKeyCode() == VK_RIGHT ) {
            x += 50;
        }
        if ( event.getKeyCode() == VK_LEFT ) {
            x -= 50;
        }
        if ( event.getKeyCode() == VK_UP ) {
            y -= 50;
        }

        g.setColor(Color.RED);
        g.fillOval(x, y, 50, 50);
        g.dispose();
    }

    public void keyReleased(KeyEvent event) {
    }

    public void keyTyped(KeyEvent event) {
    }
}

