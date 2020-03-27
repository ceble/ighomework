import org.junit.Test;

import java.io.IOException;

public class FileToMapTest {
    @Test
    public void shouldMapFromFileLines() throws IOException {
        FileToMap fileToMap = new FileToMap();

        assert (fileToMap.prepareMap()).containsKey("A");
    }
}
