/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createframe;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
/**
 *
 * @author toyosio
 */
public class CreateFrame 
    implements ActionListener{
    Frame f1;

    public CreateFrame()
    {
        f1 = new Frame("Welcome to GUI Java");
        f1.setLayout(new GridLayout(2,1));
        f1.setSize(600,400);
        f1.setVisible(true);
        
        MenuBar mb = new MenuBar();
        
        Menu m = new Menu("File");
        mb.add(m);
        MenuItem m9= new MenuItem("New");
        m.add(m9);
        MenuItem m1= new MenuItem("Open");
        m.add(m1);
        MenuItem m2= new MenuItem("Save");
        m.add(m2);
        MenuItem m3= new MenuItem("Save As");
        m.add(m3);
        
        
    
        Menu e = new Menu("Edit");
        mb.add(e);
        MenuItem m4= new MenuItem("Cut");
        e.add(m4);
        MenuItem m5= new MenuItem("Copy");
        e.add(m5);
        MenuItem m6= new MenuItem("Paste");
        e.add(m6);
        MenuItem m7= new MenuItem("Select");
        e.add(m7);
    
        Menu v = new Menu("View");
        mb.add(v);
    
        Menu h = new Menu("Help");
        mb.add(h);
        MenuItem m8= new MenuItem("About");
        h.add(m8);
        
        Button b= new Button("done");
        f1.add(b);
        b.setSize(20, 30);
        TextField t1= new TextField("Welcome");
        f1.add(t1, BorderLayout.CENTER);
        
        f1.setMenuBar(mb);
        
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);
        m5.addActionListener(this);
        m6.addActionListener(this);
        m7.addActionListener(this);
        m8.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent ae){
        Object source = ae.getSource();
        if(source == m9){
            clearText();
            fileName = null;
            setTitle("JavaEdit");
        }
        else if(source == m2){
            doSave();
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CreateFrame f2 = new CreateFrame();
    }
    
}
