package renderer;

import components.SpriteRenderer;
import lemon.GameObject;
import util.Log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Renderer {
    private final int MAX_BATCH_SIZE = 1000;
    private List<RenderBatch> batches;
    private static Shader currentShader;

    public Renderer() {
        Log.renderer("Renderer", "Renderer()");

        this.batches = new ArrayList<>();
    }

    public void add(GameObject go) {
        //Log.renderer("Renderer", "add()");
        SpriteRenderer spr = go.getComponent(SpriteRenderer.class);
        if (spr != null) {
            add(spr);
        }
    }

    private void add(SpriteRenderer sprite) {
        //Log.renderer("Renderer", "add()");
        boolean added = false;
        for (RenderBatch batch : batches) {
            if (batch.hasRoom() && batch.zIndex() == sprite.gameObject.transform.zIndex) {
                Texture tex = sprite.getTexture();
                if (tex == null || (batch.hasTexture(tex) || batch.hasTextureRoom())) {
                    batch.addSprite(sprite);
                    added = true;
                    break;
                }
            }
        }

        if (!added) {
            RenderBatch newBatch = new RenderBatch(MAX_BATCH_SIZE, sprite.gameObject.transform.zIndex);
            newBatch.start();
            batches.add(newBatch);
            newBatch.addSprite(sprite);
            Collections.sort(batches);
        }
    }

    public static void bindShader(Shader shader) {
        //Log.renderer("Renderer", "bindShader()");
        currentShader = shader;
    }

    public static Shader getBoundShader() {
        return currentShader;
    }

    public void render() {
        currentShader.use();
        for (RenderBatch batch : batches) {
            batch.render();
        }
    }
}