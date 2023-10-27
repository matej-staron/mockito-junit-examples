import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import org.example.ExampleRecord;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class GenericMockPassingTest {

  // there is no issue with Mocks, only Spies
  @Mock
  private List<String> genericMock;

  @Spy
  private ExampleRecord exampleRecord = new ExampleRecord("some value");

  @Test
  void exampleRecordShouldBeInitialized() {
    assertNotNull(exampleRecord.someParameter());
  }
}
