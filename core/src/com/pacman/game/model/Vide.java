package com.pacman.game.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.pacman.game.view.TextureFactory;

public class Vide extends GameElement{

    public Vide(Vector2 position, World world){
        super(position,world);
    }

    @Override
    public World getWorld() {
        return null;
    }

    @Override
    public String toString() {
        return "Vide [position=" + _pos + ", world=" + _world + "]";
    }

    @Override
    public Vector2 getPosition() {
        return _pos;
    }

    @Override
    public Vector2 getVelocity() {
        return null;
    }

    @Override
    public void setVelocity(Vector2 v) {

    }

    @Override
    public void setPosition(Vector2 v) {
        _pos = v;
    }

    @Override
    public int getWidth() {
        return 1;
    }

    @Override
    public int getHeight() {
        return 1;
    }


}