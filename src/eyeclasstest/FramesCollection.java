
package eyeclasstest;

public  class FramesCollection implements methods {
    static final int number = 10;
    int total = 0;
    Frames[] frame;

    public FramesCollection() {
        frame = new Frames[number];

        addShape("Oval in All Sizes");
        addShape("Hexagon in Small and medium Size");
        addShape("Square in All Sizes");
        addShape("Rectangular in All Sizes");
        addShape("Circular in Large Size Only");
       
    }

    public void addShape(String name) {
        Frames f = new Frames(name);
        if (total >= number)
            System.out.println("Stock is Full Now, no Space Left");
        else {
            frame[total] =  f;
            total++;
        }
    }

    public Iterator createIterator() {
        return new ShapeIterator(frame);
    }

    @Override
    public java.util.Iterator getIterator() {
   
        return null;
    }

    
}
