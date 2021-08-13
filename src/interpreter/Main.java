package interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import interpreter.command.StartCommand;

public class Main {
    public static void main(String[] args) {
        Code code = new Code();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("./src/interpreter/sample.txt"), StandardCharsets.UTF_8)) {
            for (String line; (line = reader.readLine()) != null;) {
                code.addLine(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        StartCommand startCommand = new StartCommand();
        startCommand.parse(code);
        startCommand.execute();
    }
}
