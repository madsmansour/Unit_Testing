import static org.junit.Assert.*;

public class SquareTest {
    Square s = new Square();

    @org.junit.Test
    public void getAreaTest() {
        int result = s.getArea();
        assertEquals(1,result);
        s.a = 5;
        s.b = 10;
        assertEquals(50,s.getArea());
        s.a = 10000;
        s.b = 0;
        assertEquals(0,s.getArea());
        s.a = 6;
        s.b = 4;
        assertEquals(24,s.getArea());
    }

    @org.junit.Test
    public void getPerimeterTest() {
        int result1 = s.getPerimeter();
        assertEquals(4, result1);
        s.a = 5;
        s.b = 10;
        assertEquals(30,s.getPerimeter());
        s.a = 10000;
        s.b = 0;
        assertEquals(20000,s.getPerimeter());
        s.a = 6;
        s.b = 4;
        assertEquals(20,s.getPerimeter());

    }


}