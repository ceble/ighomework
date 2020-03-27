import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FileToMap {

    public Map<String, List<String>> prepareMap() throws IOException {
        String filePath = "src/main/resources/file.txt";

        Path path = FileSystems.getDefault().getPath(filePath);

        return Files.lines(path)
                .filter(s -> s.matches("^\\w+,\\w+")).skip(1)
                .collect(Collectors.toMap(k -> k.split(",")[0], Collectors.toList(v -> v.split(",")[1])));
    }
}
