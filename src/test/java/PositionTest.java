import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Björn Forsberg
 */
class PositionTest {

    Position position = new Position(0,0);

    @Test
    void x() {
        assertEquals(0, position.x());
    }

    @Test
    void y() {
        assertEquals(0, position.y());
    }

    @Test
    void testToString() {
        assertEquals("0,0", position.toString());
    }
}