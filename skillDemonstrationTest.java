import static org.junit.Assert.*;
import org.junit.*;

public class skillDemonstrationTest {
  @Test
  public void add(){
    assertEquals(3, skillDemonstration.add(1, 2));//suppose to fail
  }
}
