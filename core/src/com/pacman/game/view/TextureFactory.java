package com.pacman.game.view;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.pacman.game.model.GameElement;
import com.pacman.game.model.Pacman;
import com.pacman.game.model.Block;

import java.util.HashMap;

public class TextureFactory
{
    static private TextureFactory _instance = null;
    private HashMap<Class<?>, Texture> _textures;

    private TextureFactory()
    {
        _textures = new HashMap<Class<?>, Texture>();
        _textures.put(Pacman.class, new Texture(Gdx.files.internal("images/pacman.png")));
        _textures.put(Block.class, new Texture(Gdx.files.internal("images/bloc.png")));
    }

    static public void reset()
    {
        _instance = null;
    }

    static public TextureFactory getInstance()
    {
        if (_instance == null)
            _instance = new TextureFactory();
        return _instance;
    }

    public Texture getTexture(Class<? extends GameElement> aClass) {
        return null;
    }
}