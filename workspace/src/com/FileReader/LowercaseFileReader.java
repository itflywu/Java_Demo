package com.FileReader;

import java.nio.file.Path;

/**
 * @author flywu
 * @date 2023/1/13 16:03
 */
class LowercaseFileReader extends BaseFileReader {
    protected LowercaseFileReader(Path filePath) {
        super(filePath);
    }

    @Override
    protected String mapFileLine(String line) {
        return line.toLowerCase();
    }
}
