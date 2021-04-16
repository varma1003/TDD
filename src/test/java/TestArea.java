import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestArea {
    private static Area st;

    @BeforeClass
    public static void setup() {
        st = new Area();
    }

    @Test
    public void test_circle_area(){
        assertEquals(50,st.circle_area(4));
    }
}
