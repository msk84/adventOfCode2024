package net.msk.adventOfCode;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class BaseTest {
    List<String> getDataFromFileAsList(final String fileName) throws IOException, URISyntaxException {
        final Path path = Paths.get(Objects.requireNonNull(getClass().getClassLoader()
                .getResource(fileName)).toURI());

        return Files.readAllLines(path);
    }
}
