package pl.sda.fileconveter;

public class ReaderFactory {

    public JSONReader produce(String filePath){

        if(filePath.endsWith(".json")){
            return new JSONReader();
        }

        return null;
    }

}
