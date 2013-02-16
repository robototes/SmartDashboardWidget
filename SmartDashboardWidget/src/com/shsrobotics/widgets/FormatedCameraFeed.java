package com.shsrobotics.widgets;

import edu.wpi.first.smartdashboard.properties.ColorProperty;
import edu.wpi.first.smartdashboard.properties.Property;
import edu.wpi.first.smartdashboard.properties.NumberProperty;
import java.awt.*;


/** 
 *  Puts a line over the camera feed.
 * @author Max
 */
public class FormatedCameraFeed extends edu.wpi.first.smartdashboard.camera.WPICameraExtension {
    
    public final NumberProperty horizontalLine = new NumberProperty(this, "Horizontal Axis", this.getBounds().width / 2);
    public final NumberProperty verticalLine = new NumberProperty(this, "Vertical Axis", this.getBounds().height / 2);
    public final NumberProperty axisWidth = new NumberProperty(this, "Pen Size", 2);
    public final ColorProperty lineColor = new ColorProperty(this, "Pen Color", Color.RED);
    
    
    @Override
    public void propertyChanged(Property p) {
        if ( p == horizontalLine || p == verticalLine || p == axisWidth || p == lineColor ) {
            this.repaint();
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        
        Graphics2D g2d = (Graphics2D)g;
        
        Rectangle size = this.getBounds();
        
        g2d.setColor(lineColor.getValue());
        
        g2d.drawRect(0, (int)horizontalLine.getValue() - (int)axisWidth.getValue()/2, size.width, (int)horizontalLine.getValue() + (int)axisWidth.getValue()/2);
        
        g2d.drawRect((int)verticalLine.getValue() - (int)axisWidth.getValue()/2, 0, size.height, (int)verticalLine.getValue() + (int)axisWidth.getValue()/2);
    }
    
}
