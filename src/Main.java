import java.awt.*;
import java.awt.event.*;

import static java.awt.event.KeyEvent.*;

public class Main extends Frame implements KeyListener{
    private View view = new View();
    private Field field = new Field();

    public static void main(String[] args) {
        new Main();
    }

    Main(){
        super ("Main");
        setSize(500,500);
        setVisible(true);
        addKeyListener(this);
    }

    @Override
    public void paint(Graphics g) {
        view.render(g, field.getFieldState());
    }

    public void keyPressed(KeyEvent event) {
        field.updatePoint(event.getKeyCode());
        repaint();
    }

    public void keyReleased(KeyEvent event) {
    }

    public void keyTyped(KeyEvent event) {
    }

}