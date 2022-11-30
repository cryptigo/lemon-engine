package util;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileLogger extends LogBase {
    public Path filePath = Paths.get("logs/latest.llog");

    @Override
    public void Log(String message) {
        try {
            FileWriter writer = new FileWriter(filePath.toString());
            writer.write(message + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            assert false : "";
        }
    }
}
