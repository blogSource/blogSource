package bestellgenerator.cli;

import bestellgenerator.core.Operation;
import bestellgenerator.core.Usage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParameterParserTest {

  @Test
  public void InvalidParameterIsParsedAsUsageOperation() {
    ParameterParser parser = new ParameterParser();
    Operation operation = parser.parse("arg0", "arg1");
    assertEquals(Usage.class, operation.getClass());
  }
}
