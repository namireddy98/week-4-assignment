/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eyeclasstest;


public class Glasses {
    FramesCollection frame;

    public Glasses(FramesCollection frame) {
        this.frame = frame;
    }

    public void DisplayFrameShapes_Sizes() {
        
        Iterator iterator = frame.createIterator();
        
        System.out.println(" Available Glasses Frames ");
      
        
        while (iterator.hasNext()) {
        
            Frames list = (Frames)iterator.nextElement();
            
            System.out.println(list.getFrame());
       
        }
    }
}
