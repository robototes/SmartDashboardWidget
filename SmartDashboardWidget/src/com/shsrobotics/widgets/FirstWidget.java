package com.shsrobotics.widgets;

import edu.wpi.first.smartdashboard.gui.StaticWidget;
import edu.wpi.first.smartdashboard.properties.Property;
import javax.swing.JLabel;




public class FirstWidget extends StaticWidget{
    
    JLabel label;
    
    @Override
    public void init() {
        label = new JLabel("HELLO WORLD");
        this.add(label);
    }

    @Override
    public void propertyChanged(Property prprt) {
        
    }
    
}
