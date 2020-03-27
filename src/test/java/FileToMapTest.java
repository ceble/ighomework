import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class FileToMapTest {
    @Test
    public void shouldMapFromFileLines() throws IOException {
        FileToMap fileToMap = new FileToMap();

        assert (fileToMap.prepareMap()).containsKey("A");
        assert (fileToMap.prepareMap()).get("A").containsAll(List.of("1", "33"));
    }

}
