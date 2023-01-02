/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scrable;

import java.awt.Component;

/**
 *
 * @author user
 */
public class MyJPanel extends javax.swing.JPanel{
    private boolean sameTurn;
    private boolean is_used;

    
    public void setSameTurn(boolean sameTurn) {
        this.sameTurn = sameTurn;
    }
    public boolean getSameTurn() {
        return sameTurn;
    }
    
    public void setIs_used(boolean is_used) {
        this.is_used = is_used;
    }
    public boolean getIs_used() {
        return is_used;
    }
    
    
    public MyJPanel()
    {
        super();
        setIs_used(false);
        setSameTurn(false);
    }
    
    public MyJPanel(boolean sameTurn, boolean is_used)
    {
        super();
        setSameTurn(sameTurn);
        setIs_used(is_used);
    }
    
    public MyJPanel(MyJPanel obj)
    {
        this(obj.getSameTurn(), obj.getIs_used());
    }

    
}
