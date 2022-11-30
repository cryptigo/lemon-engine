package renderer;

import components.SpriteRenderer;

public class RenderBatch {

    // - VERTEX -
    // ┌───────────────────┬────────────────────────────┐
    // │ Position          │ Color                      │
    // ├───────────────────┼────────────────────────────┤
    // │ float, float      │ float, float, float, float │
    // └───────────────────┴────────────────────────────┘
    private final int POS_SIZE = 2;
    private final int COLOR_SIZE = 4;

    private final int POS_OFFSET = 0;
    private final int COLOR_OFFSET = POS_OFFSET + POS_SIZE * Float.BYTES;
    private final int VERTEX_SIZE = 6;
    private final int VERTEX_SIZE_BYTES = VERTEX_SIZE * Float.BYTES;

    private SpriteRenderer[] sprites;
    private int numSprites;
    private boolean hasRoom;
    private float[] vertices;

    private int vaoID, vboID;
    private int maxBatchSize;
    private Shader shader;

    public RenderBatch(int maxBatchSize) {
        shader = new Shader("assets/data/shaders/default.glsl")
    }
}
