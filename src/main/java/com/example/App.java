package com.example;
import com.google.common.collect.ImmutableList;
import org.apache.commons.io.FileUtils;
import java.io.File;
public class App {
    public static void main(String[] args) throws Exception {
        ImmutableList<String> fruits =
                ImmutableList.of("APPLE", "BANANA", "Cherry");
        System.out.println(fruits);
        FileUtils.copyFile(
                new File("source.txt"),
                new File("dest.txt")
        );
        System.out.println("File copied successfully!");
    }
}
