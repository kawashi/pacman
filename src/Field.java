import static java.awt.event.KeyEvent.*;

public class Field {git
    private int[][] fieldState = {
            {1,0,0},
            {0,0,0},
            {0,0,0},
            {0,0,0}
    };

    public int[][] getFieldState() {
        return fieldState;
    }

    public void updatePoint(int keyCode){
        for(int x=0 ; x<=3 ; x++ ) {
            for(int y=0; y<=2; y++) {
                if(fieldState[x][y] == 1) {
                    if ( keyCode == VK_DOWN && y + 1 <= 2 ) {
                        fieldState[x][y+1] = 1;
                        fieldState[x][y] = 0;
                        return;
                    }
                    if ( keyCode == VK_RIGHT && x + 1 <= 3 ) {
                        fieldState[x+1][y] = 1;
                        fieldState[x][y] = 0;
                        return;
                    }

                    if ( keyCode == VK_LEFT && x - 1 >= 0 ) {
                        fieldState[x-1][y] = 1;
                        fieldState[x][y] = 0;
                        return;
                    }
                    if ( keyCode == VK_UP && y - 1 >= 0 ) {
                        fieldState[x][y-1] = 1;
                        fieldState[x][y] = 0;
                        return;
                    }
                }
            }
        }
    }
}