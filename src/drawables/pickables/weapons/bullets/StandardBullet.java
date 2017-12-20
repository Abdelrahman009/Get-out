package drawables.pickables.weapons.bullets;

import View.Graphics.ImagesMaps.MazeMap;
import drawables.pickables.Weapon;
import drawables.pickables.weapons.bullets.bulletDirectionStates.ShootingDirectionState;
import javafx.scene.canvas.GraphicsContext;
import maze.Maze;

import java.awt.*;

public abstract class StandardBullet implements Bullet {

    private int damage;
    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void startMotionAfterShooting(Point initialPosition, ShootingDirectionState state, Weapon weapon) {
        state.startMotion(initialPosition,this, weapon);
    }

    @Override
    public void drawOnCanvas(GraphicsContext gc, int x, int y, int width, int height) {
        MazeMap map = MazeMap.getInstance();
        gc.drawImage(map.getBufferedImage("ShootingBullet"),
                x, y, width, height);
    }

    protected void setDamage(){
        damage = getTypeDamage();
    }
    protected abstract int getTypeDamage();
}
