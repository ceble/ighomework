import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.stream.Collectors;

public class FileToMap {

    public  Map<String, String> prepareMap() throws IOException {
        String filePath = "src/main/resources/file.txt";

        Path path = FileSystems.getDefault().getPath(filePath);

        return Files.lines(path)
                .filter(s -> s.matches("^\\w+:\\w+"))
                .collect(Collectors.toMap(k -> k.split(",")[0], v -> v.split(",")[1]));

    }

}
