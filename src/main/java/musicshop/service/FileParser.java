package musicshop.service;

import musicshop.model.Song;

import java.io.File;


    public class FileParser {
        public static void main(String[] args) {
            String directoryPath = "path/to/your/directory";

            File directory = new File(directoryPath);
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        String fileName = file.getName();
                        String[] fileNameParts = fileName.split("\\.");
                        String name = fileNameParts[0]; // Extracting name
                        String extension = fileNameParts[1]; // Extracting extension
                        var song1= new Song();


                        // Perform parsing logic on the file name
                        // Example: split the file name by a specific character
                        String[] parts = fileName.split("_");
                        // Do something with the parsed parts
                        for (String part : parts) {
                            System.out.println(part);
                        }
                    }
                }
            }
        }
    }

