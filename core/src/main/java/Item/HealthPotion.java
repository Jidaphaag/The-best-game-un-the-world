package Item;
import Characters.Player;
import com.badlogic.gdx.graphics.Texture;

public class HealthPotion extends Item {
    private static Texture sharedTexture;

    public static void loadTexture() {
        if (sharedTexture == null) {
            sharedTexture = new Texture("potion.png");
        }
    }

    public HealthPotion(float x, float y) {
        super(x, y, sharedTexture != null ? sharedTexture : (sharedTexture = new Texture("potion.png")));
    }

    @Override
    public void applyEffect(Player player) {
        player.heal(20);
        this.isCollected = true;
        System.out.println("Blood health!");
    }
}
