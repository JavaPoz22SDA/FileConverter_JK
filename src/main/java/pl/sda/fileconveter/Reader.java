package pl.sda.fileconveter;

import java.util.List;
import java.util.Map;

public interface Reader {
    List<Map<String, Object>> read(String inputFilePath);
}