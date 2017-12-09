package drawables.obstacles.walls;

import drawables.obstacles.Wall;
import javafx.scene.canvas.Canvas;

import java.awt.*;

public class Tree implements Wall {

    private int wallHealth;
    private Point position;

    public void Tree() {
        this.wallHealth = 50;
    }

    @Override
    public void takeBullet(int bulletDamage) {
        this.wallHealth -= bulletDamage;
        if (this.wallHealth <= 0) {
            this.destroy();
        }
    }

    @Override
    public void drawOnCanvas(Canvas canvas) {
        //TODO
    }

    @Override
    public Point getPosition() {
        return this.position;
    }

    @Override
    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public void destroy() {
        //TODO
    }
}