import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import org.example.ExampleRecord;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class GenericSpyFailingTest {

  @Spy
  private final List<String> genericSpy = List.of("item A", "item B");

  @Spy
  private ExampleRecord exampleRecord = new ExampleRecord("some value");

  @Test
  void exampleServiceUsesDependency() {
    assertNotNull(exampleRecord.someParameter());
  }
}
