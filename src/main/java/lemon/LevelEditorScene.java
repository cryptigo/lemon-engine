package lemon;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import components.FontRenderer;
import components.Sprite;
import components.SpriteRenderer;
import components.Spritesheet;
import imgui.ImGui;
import org.joml.Vector4f;
import org.lwjgl.BufferUtils;

import org.joml.Vector2f;
import renderer.Shader;
import renderer.Texture;
import util.AssetPool;
import util.Settings;
import util.Time;

import static org.lwjgl.opengl.GL30.*;
import static org.lwjgl.opengl.GL20.*;

public class LevelEditorScene extends Scene {
    private GameObject obj1;
    private Spritesheet sprites;

    public LevelEditorScene() {

    }

    @Override
    public void init() {
        loadResources();

        this.camera = new Camera(Settings.DEFAULT_CAMERA_POS);

        sprites = AssetPool.getSpritesheet("assets/images/spritesheet.png");

        obj1 = new GameObject("Object 1", new Transform(new Vector2f(200, 100),
                new Vector2f(256, 256)), 2);
        obj1.addComponent(new SpriteRenderer(new Vector4f(1, 0, 0, 1)));
        this.addGameObjectToScene(obj1);
        this.activeGameObject = obj1;

        GameObject obj2 = new GameObject("Object 2",
                new Transform(new Vector2f(400, 100), new Vector2f(256, 256)), 3);
        obj2.addComponent(new SpriteRenderer(new Sprite(
                AssetPool.getTexture("assets/images/blendImage2.png")
        )));
        this.addGameObjectToScene(obj2);
    }

    private void loadResources() {
        AssetPool.getShader("assets/data/shaders/default.glsl");
        AssetPool.addSpritesheet("assets/images/spritesheet.png", new Spritesheet(AssetPool.getTexture("assets/images/spritesheet.png"),16, 16, 26, 0));
    }

    @Override
    public void update(float dt) {
        for (GameObject go : this.gameObjects) {
            go.update(dt);
        }

        this.renderer.render();
    }

    @Override
    public void imgui() {
        ImGui.begin("Test window");
        ImGui.text("blah blah");
        ImGui.end();
    }
}
