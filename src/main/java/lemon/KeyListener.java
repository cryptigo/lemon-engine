package lemon;

import util.Log;

import static org.lwjgl.glfw.GLFW.GLFW_PRESS;
import static org.lwjgl.glfw.GLFW.GLFW_RELEASE;

public class KeyListener {
    // TODO: Implement an enum for keycodes
    private static KeyListener instance;
    private boolean keyPressed[] = new boolean[350];

    private KeyListener() {
        Log.lemon("KeyListener", "KeyListener()");
    }

    public static KeyListener get() {
        if (KeyListener.instance == null) {
            KeyListener.instance = new KeyListener();
        }
        return KeyListener.instance;
    }

    public static void keyCallback(long window, int key, int scancode, int action, int mods) {
        if (action == GLFW_PRESS) {
            Log.lemon("KeyListener", "keyPressed: [" + key + "]");
            get().keyPressed[key] = true;
        } else if (action == GLFW_RELEASE) {
            Log.lemon("KeyListener", "keyReleased: [" + key + "]");
            get().keyPressed[key] = false;
        }
    }

    public static boolean isKeyPressed(int keyCode) {
        return get().keyPressed[keyCode];
    }

}
