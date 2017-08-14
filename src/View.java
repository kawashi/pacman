import java.awt.*;

public  class View {
    public void render(Graphics g, int[][] fieldstate) {
        for (int y = 50; y <= 200; y +=50) {
            g.drawLine(50, y, 250, y);
        }
        for(int x = 50; x<=250; x +=50){
            g.drawLine(x,50,x,200);
        }

        for(int x = 0; x <= 3; x++){
            for(int y = 0; y<= 2; y++){
                if(fieldstate[x][y]== 1){
                    g.setColor(Color.RED);
                    g.fillOval(50*(x+1), 50*(y+1), 50, 50);
                    g.dispose();
                }
            }
        }
    }
}