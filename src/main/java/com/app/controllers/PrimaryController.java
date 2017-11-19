package com.app.controllers;

import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.state.StateManager;
import com.gluonhq.particle.view.ViewManager;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javax.inject.Inject;

import javafx.scene.layout.FlowPane;
import org.controlsfx.control.action.Action;
import org.controlsfx.control.action.ActionMap;
import org.controlsfx.control.action.ActionProxy;

public class PrimaryController {

    @FXML private FlowPane primary;
    
    @Inject private ViewManager viewManager;

    @Inject private StateManager stateManager;
    
    private boolean first = true;
    
    @FXML
    private ResourceBundle resources;
    
    private Action actionSignin;
    
    public void initialize() {
        ActionMap.register(this);
        
    }
    
    public void postInit() {
        if (first) {
            first = false;
        }
    }
    
    public void dispose() { }
    
}