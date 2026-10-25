package io.github.Jidaphaag;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.audio.Music;

public class Main extends Game {
    public SpriteBatch batch;
    private Music backgroundMusic;

    @Override
    public void create() {
        batch = new SpriteBatch();
        backgroundMusic = Gdx.audio.newMusic(
            Gdx.files.internal("Ancient Egyptian Music – Pharaoh Ramses II.mp3"));
        backgroundMusic.setLooping(true);
        backgroundMusic.play();
        this.setScreen(new MainMenuScreen(this));
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        batch.dispose();
        backgroundMusic.dispose();
    }
}
