package lemon;

import com.google.gson.*;
import components.Component;
import util.Log;

import java.lang.reflect.Type;

public class GameObjectDeserializer implements JsonDeserializer<GameObject> {
    @Override
    public GameObject deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Log.lemon("GameObjectDeserializer", "deserialize()");
        JsonObject jsonObject = json.getAsJsonObject();
        String name = jsonObject.get("name").getAsString();
        JsonArray components = jsonObject.getAsJsonArray("components");


        GameObject go = new GameObject(name);
        for (JsonElement e : components) {
            Component c = context.deserialize(e, Component.class);
            go.addComponent(c);
        }
        go.transform = go.getComponent(Transform.class);
        return go;
    }
}
