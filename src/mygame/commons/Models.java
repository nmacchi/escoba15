/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame.commons;

import com.jme3.asset.AssetManager;
import com.jme3.scene.Spatial;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nicolas
 */
public class Models {
    
    private AssetManager assetManager;
    private static Map<String, Spatial> modelMap = new HashMap<String, Spatial>();
    
    
    /**
     * Constructors
     */
    Models(){
   
    }
    
    Models(AssetManager assetManager){
        this.assetManager = assetManager;
        
        modelMap.put("Espada1", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Espada2", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Espada3", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Espada4", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Espada5", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Espada6", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Espada7", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Espada10", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Espada11", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Espada12", assetManager.loadModel("Models/Cards/"));
        
        modelMap.put("Oro1", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Oro2", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Oro3", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Oro4", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Oro5", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Oro6", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Oro7", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Oro10", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Oro11", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Oro12", assetManager.loadModel("Models/Cards/"));
        
        modelMap.put("Basto1", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Basto2", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Basto3", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Basto4", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Basto5", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Basto6", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Basto7", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Basto10", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Basto11", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Basto12", assetManager.loadModel("Models/Cards/"));
        
        modelMap.put("Copa1", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Copa2", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Copa3", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Copa4", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Copa5", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Copa6", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Copa7", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Copa10", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Copa11", assetManager.loadModel("Models/Cards/"));
        modelMap.put("Copa12", assetManager.loadModel("Models/Cards/"));
        
    }
    
    
    /**
     * GETTERS AND SETTERS
     */
    
    /**
     * 
     * @param name
     * @return 
     */
    public static Spatial getModel(String name){
        return modelMap.get(name);
    }
    
    
    
}
