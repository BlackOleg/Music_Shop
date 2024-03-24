package musicshop.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import musicshop.model.Song;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

@Slf4j
@Service
@RequiredArgsConstructor
public class SongService {

    @Service
    public class Mp3FileService {

        public void uploadMp3File(MultipartFile file) throws IOException {
            String fileName = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));

            // Parsing filename to extract name and extension
            String[] fileNameParts = fileName.split("\\.");
            String name = fileNameParts[0]; // Extracting name
            String extension = fileNameParts[1]; // Extracting extension

            // Save file details to the database using JPA repository
//            Mp3File mp3File = new Mp3File();
//            mp3File.setName(name);
//            mp3File.setExtension(extension);
//            mp3File.setData(file.getBytes()); // Assuming 'data' is a field to store the file content
//            mp3FileRepository.save(mp3File);
        }
    }
}

