/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eyeclasstest;


public class EyeClassTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Making Object of FrameCollection for passing Information.
        
        FramesCollection frame = new FramesCollection();
      
        //Passing Object to Class Glasses
        
        Glasses frameShape = new Glasses(frame);
        
        //Calling method to Display All Available Shapes And Sizes.
        frameShape.DisplayFrameShapes_Sizes();
    
        
    }
    
}
