package gooey;

/***********************************************************
This is my first gui program and this is the main driver.
N. Gattuso  -- 01/13/2014
******************************************************** */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyWindow {

   public static void main(String[] args) {

       // Create application frame.
       MyWindowFrame frame = new MyWindowFrame();
       // Show frame.
       frame.setVisible(true);
       frame.setResizable(false);

   }
}
