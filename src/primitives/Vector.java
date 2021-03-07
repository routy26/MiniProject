package primitives;

import static primitives.Point3D.ZERO;

public class Vector {
    final Point3D _head;


    public Vector(Point3D head) {
        if(head.equals(ZERO)){
            throw new IllegalArgumentException("head of vector cannot be Point(0,0,0)");
        }
        _head = new Point3D(head._x, head._y, head._z);
    }
}
