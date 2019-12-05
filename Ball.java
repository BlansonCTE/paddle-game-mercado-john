import java.awt.Graphics2D;
class Ball {
    //Initialize ball position
    int x = 0, y = 0, xd = 1, yd = 1;
    int width = 300, height = 400;
    // Create ball size
    private static final int DIAMETER = 30;
    private Game game;

    public Ball (Game game) {
        this.game = game;
    }

    void moveBall() {
        x = x + xd;
        if (x >= width) {
            xd = -1;
        }
        else if (x <= 0) {
            xd = +1;
        }

        y = y + yd;
        if (y >= height) {
            yd = -1;
        }
        else if (y <= 0) {
            yd = +1;
        }
    }

    public void paint(Graphics2D g) {
        g.fillOval(x, y, DIAMETER, DIAMETER);
    }
}