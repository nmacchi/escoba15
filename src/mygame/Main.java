package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.light.DirectionalLight;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Spatial;


/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class Main extends SimpleApplication {
    
//    Geometry card;
    Spatial card;
    
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        //Box b = new Box(1, 1, 1);
        //Geometry geom = new Geometry("Box", b);

//        card = (Geometry) ((Node) assetManager.loadModel("Models/Cards/Cube.mesh.xml")).getChild(0);
//        
//        Material material = new Material(assetManager, "Common/MatDefs/Light/Lighting.j3md");
//        material.setTexture("ColorMap", assetManager.loadTexture("Textures/1e_text.png"));
//        card.setMaterial(material);
        
        card = assetManager.loadModel("Models/Cards/Cube.mesh.xml");
        
        card.setLocalTranslation(0.0f, -5.0f, -2.0f);
        rootNode.attachChild(card);
        
        DirectionalLight sun = new DirectionalLight();
        sun.setDirection(new Vector3f(-0.1f, -0.5f, -1.0f));
        rootNode.addLight(sun);
    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
        card.rotate(tpf, 0.0f, 0.0f);
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
