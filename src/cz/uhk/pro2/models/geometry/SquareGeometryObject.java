package cz.uhk.pro2.models.geometry;

public class SquareGeometryObject extends GeometryObject {
    private int c;
    public SquareGeometryObject(int a, int b) {
        super(a, b);
    }
    public SquareGeometryObject(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }
    @Override
    public void draw() {
        System.out.println("drawing square");
    }
}
