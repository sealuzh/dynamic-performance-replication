package ch.uzh.ifi.seal.PerfAwareUnitTestsEval;

import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;

public class FileWriter extends java.io.FileWriter {

    public FileWriter(String fileName) throws IOException {
        super(fileName);
    }

    public FileWriter(String fileName, boolean append) throws IOException {
        super(fileName, append);
    }

    public FileWriter(File file) throws IOException {
        super(file);
    }

    public FileWriter(File file, boolean append) throws IOException {
        super(file, append);
    }

    public FileWriter(FileDescriptor fd) {
        super(fd);
    }
}
