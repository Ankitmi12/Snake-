/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snake;

import javax.swing.JFrame;

/**
 *
 * @author ankit
 */
public class GameFrame extends JFrame {
    GameFrame(){
//        GamePanel panel=new GamePanel();
//        this .add(panel);
//************** above code can be shortcut by this method
          this.add(new GamePanel());
          this .setTitle("Snake");
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setResizable(false);
          this.pack();
          this .setVisible(true);
          this.setLocationRelativeTo(null);
          
    }
    
}
