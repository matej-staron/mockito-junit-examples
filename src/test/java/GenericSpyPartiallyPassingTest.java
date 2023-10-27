import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import org.example.ExampleRecord;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class GenericSpyPartiallyPassingTest {

  @Spy
  private ExampleRecord exampleRecord = new ExampleRecord("some value");

  // It seems that order is significant - here, at least the first test will have correct setup
  @Spy
  private final List<String> genericSpy = List.of("item A", "item B");

  @Test
  void exampleRecordShouldBeInitialized() {
    assertNotNull(exampleRecord.someParameter());
  }

  @Test
  void exampleRecordShouldStillBeInitialized() {
    assertNotNull(exampleRecord.someParameter());
  }
}
