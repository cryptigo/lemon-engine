package util;

import org.joml.Vector2f;
import org.joml.Vector4f;

public class Settings {
    // Default settings
    // NOTE: This is a temporary file.

    // Window Settings
    public static final int      DEFAULT_WINDOW_WIDTH = 1920;
    public static final int      DEFAULT_WINDOW_HEIGHT = 1080;
    public static final String   DEFAULT_WINDOW_TITLE = "Lemon Editor";
    public static final Vector4f DEFAULT_WINDOW_COLOR = Color.WHITE;


    // You probably do not need to edit these.
    public static final boolean WINDOW_ENABLE_VSYNC = true;
    public static final boolean WINDOW_RESIZABLE = true;
    public static final int     WINDOW_FPS_LIMIT = 60;

    // Engine Settings
    public static final int     ENGINE_DEFAULT_SCENE = 0;
    public static final String  ENGINE_WELCOME_MSG = "Welcome to Lemon Engine";
    public static final boolean ENGINE_DEBUG_MODE = true;

    // OpenGL Settings
    public static final int     GL_VERSION_MAJOR = 4;
    public static final int     GL_VERSION_MINOR = 6;
    public static final String  GL_PROFILE = "core";
    public static final int     GL_GLSL_VERSION = 440;
    public static final boolean GL_ENABLE_BLENDING = true;

    // Renderer Settings
    public static final Vector2f DEFAULT_CAMERA_POS = new Vector2f(-250, 0);
    public static final int RENDERER_MAX_BATCH_SIZE = 1000;
    public static final String TEXTURE_WRAP_MODE = "REPEAT";
    public static final String TEXTURE_FILTER_MODE = "NEAREST";

    // UI Settings
    public static final String UI_FONT_FILE = "assets/fonts/OpenSans-Regular.ttf";
    public static final int UI_FONT_SIZE = 32;
    public static final String UI_INI_FILE = "assets/data/config/imgui.ini";
    public static final boolean UI_ENABLE_DOCKING = true;

    // Input Settings
    public static final int INPUT_NUM_KEYS = 350;

    // Component Settings
    public static final Vector4f SPRITE_RENDERER_DEFAULT_COLOR = Color.WHITE;


}
