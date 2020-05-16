package pl.sda.fileconveter;

import java.util.List;
import java.util.Map;

public class Converter {

    public void convert(String sourceFilePath, String outputFilePath) {

        ReaderFactory readerFactory = new ReaderFactory();
        Reader reader = readerFactory.produce(sourceFilePath);
        /*reader.read(sourceFilePath);*/
        List<Map<String, Object>> json = reader.read(sourceFilePath);

        if (reader instanceof JSONReader) {
            System.out.println(json);
            System.out.println("Działa nam obiekt JSONReader");
        }


    }
}
