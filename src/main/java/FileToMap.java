import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileToMap {

    public Map<String, List<String>> prepareMap() throws IOException {
        String filePath = "src/main/resources/file.txt";
        BufferedReader reader;
        Map<String, List<String>> map = new HashMap<>();
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            while (line != null) {
                List<String> lineList = Arrays.asList(line.split(","));
                if (!map.containsKey(lineList.get(0))) {
                    List<String> entryValue = new ArrayList<>();
                    entryValue.add(lineList.get(1));
                    map.put(lineList.get(0), entryValue);
                } else {
                    List<String> existingValues = map.get(lineList.get(0));
                    existingValues.add(lineList.get(1));
                    map.replace(lineList.get(0), existingValues);
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
