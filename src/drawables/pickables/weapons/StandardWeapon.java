package drawables.pickables.weapons;

import drawables.characters.Hero;
import drawables.pickables.Weapon;
import drawables.pickables.weapons.bullets.Bullet;

import java.awt.*;

public abstract class StandardWeapon implements Weapon{


    private Point position;
    private int ammo;
    private int maxMagazineCapacity;
    private Bullet weaponBullet;
    private Bullet shotBullet;

    @Override
    public void shoot(int direction, Point initialPosition) {

        if(ammo != 0){
            shotBullet = (Bullet) weaponBullet.cloneBullet();
            shotBullet.startMotionAfterShooting(initialPosition,direction);
            ammo--;
        }
    }

    @Override
    public void addToHandler(Hero hero) {
        hero.addWeapon(this);
    }



    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public void reload() {
        ammo = maxMagazineCapacity;
    }

    protected void setBulletType() {
        weaponBullet = getBulletType();
    }

    protected void setMaxMagazineCapacity(){
        maxMagazineCapacity = getMaxMagazineCapacity();
    }

    protected abstract int getMaxMagazineCapacity();
    protected abstract Bullet getBulletType();

}