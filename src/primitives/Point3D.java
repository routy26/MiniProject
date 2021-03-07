package primitives;

import java.util.Objects;

public class Point3D {
    final Coordinate _x;
    final Coordinate _y;
    final Coordinate _z;

    public static final Point3D ZERO = new Point3D (0d,0d,0d);

    public Point3D(Double x, Double y, Double z) {
        _x = new Coordinate(x);
        _y = new Coordinate(y);
        _z = new Coordinate(z);
    }

    public Point3D(Coordinate x, Coordinate y, Coordinate z) {
        this(x.coord,y.coord, z.coord);
    }

    public Point3D(Point3D head) {
        this(head._x, head._y, head._z);
    }

    public Coordinate getX() {
        return _x;
    }

    public Coordinate getY() {
        return _y;
    }

    public Coordinate getZ() {
        return _z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return _x.equals(point3D._x) && _y.equals(point3D._y) && _z.equals(point3D._z);
    }

    @Override
    public String toString() {
        return "{" + _x + "," + _y + "," + _z + '}';
    }

    /** squared distance between 2 3D points
     * @param point3D the other point
     * @return the distance
     */
    public double distanceSquared(Point3D point3D){
        final double x1= _x.coord;
        final double y1= _y.coord;
        final double z1= _z.coord;
        final double x2= point3D._x.coord;
        final double y2= point3D._y.coord;
        final double z2= point3D._z.coord;

        return ((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)+(z2-z1)*(z2-z1));

    }

    public double distance (Point3D pt){
        return Math.sqrt(distanceSquared(pt));
    }

    public Point3D add(Vector vector){
        return new Point3D (
                _x.coord + vector._head._x.coord,
                _y.coord + vector._head._y.coord,
                _z.coord + vector._head._z.coord);
    }
}



