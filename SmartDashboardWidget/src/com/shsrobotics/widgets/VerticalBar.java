package com.shsrobotics.widgets;

import edu.wpi.first.smartdashboard.gui.Widget;
import edu.wpi.first.smartdashboard.properties.Property;
import edu.wpi.first.smartdashboard.types.DataType;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;



public class VerticalBar extends Widget {
    
    public static final DataType[] TYPES = { DataType.NUMBER };
    private double value = 0.0;
    
    @Override
    public void setValue(Object o) {
       this.value = ((Number) value).doubleValue();
       repaint();
    }

    @Override
    public void init() {
        this.setPreferredSize(new Dimension(60,200));
        repaint();
    }

    @Override
    public void propertyChanged(Property prprt) {
        
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        Dimension size = this.getSize();
        g.setColor(Color.BLACK);
        g.fillRect(0,0,size.width,size.height);
        
        int barHeight = (int) (size.height * value / 100.0);
        g.setColor(Color.GREEN);
        g.fillRect(0, size.height - barHeight, size.width, barHeight);
    }
    
}
