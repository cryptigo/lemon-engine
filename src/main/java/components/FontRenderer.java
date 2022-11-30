package components;

import lemon.Component;

public class FontRenderer extends Component {
    @Override
    public void start() {
        if (gameObject.getComponent(SpriteRenderer.class) != null) {
            System.out.println("Found FontRenderer!");
        }
    }

    @Override
    public void update(float dt) {

    }
}
