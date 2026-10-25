package Item;
import Characters.Player;
import com.badlogic.gdx.graphics.Texture;
import io.github.Jidaphaag.GameSave;

public class Coin extends Item {
    private static Texture sharedTexture;


    public static void loadTexture() {
        if (sharedTexture == null) {
            sharedTexture = new Texture("coin.png");
        }
    }

    public Coin(float x, float y) {
        super(x, y, sharedTexture != null ? sharedTexture : (sharedTexture = new Texture("coin.png")));
    }

    @Override
    public void applyEffect(Player player) {
        player.addCoin(1);
        GameSave.addCoins(1);
        this.isCollected = true;
        System.out.println("Coin collected! Wallet: " + GameSave.getCoins());
    }
}
