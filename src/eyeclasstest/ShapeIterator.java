/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eyeclasstest;


public class ShapeIterator implements Iterator{
   
    //Array by composing Frames Classes and making array for storing data.
    Frames[] frames;
    int list = 0;

    public ShapeIterator(Frames[] frames) {
        this.frames = frames;
    }

    //Check Whether it has next element.
    @Override
    public boolean hasNext() {
        return list < frames.length &&
                frames[list] != null;
    }

    //Returns next Element
    @Override
    public Object nextElement() {
        Frames frame =  frames[list];
        list += 1;
        return frame;
    }
}

