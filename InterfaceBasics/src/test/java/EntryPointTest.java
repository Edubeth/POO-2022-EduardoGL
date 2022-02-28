import mx.uv.fiee.iinf.poo.Draw;
import mx.uv.fiee.iinf.poo.Rectangle;
import mx.uv.fiee.iinf.poo.Circle;
import org.junit.Assert;
import org.junit.Test;

public class EntryPointTest {

    @Test
    public void RectangleTest() {
        Rectangle rec1 = new Rectangle(4, 10);
        Rectangle rec2 = new Rectangle(2, 20);

        int expected = rec1.compareTo(rec2);
        Assert.assertEquals(expected, 0);
    }

    @Test
    public void CircleTest() {
        Circle cir1 = new Circle(4);
        Circle cir2 = new Circle(5);

        int expected = cir1.compareTo(cir2);
        Assert.assertEquals(expected, -1);
    }

}
