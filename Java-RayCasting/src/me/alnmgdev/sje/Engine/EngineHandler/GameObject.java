package me.alnmgdev.sje.Engine.EngineHandler;

public abstract class GameObject {

    private double posX;
    private double posY;


    public GameObject(double posX, double posY){
        this.posX = posX;
        this.posY = posY;
    }


    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }
}
