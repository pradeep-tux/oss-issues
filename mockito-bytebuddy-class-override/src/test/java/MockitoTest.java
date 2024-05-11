import java.sql.Connection;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MockitoTest {

  @Test
  void test() {
    Mockito.mock(Connection.class);
  }
}
