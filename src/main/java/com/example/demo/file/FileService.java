package com.example.demo.file;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@CrossOrigin("http://localhost:3000/")
@Service
public class FileService {
    public void uploadFile(MultipartFile file) {

        if (!file.isEmpty()) {
            try {
                String uploadDir = "/home/hoang/Downloads/demo/src/main/java/com/example/demo/test/"; // Thay thế bằng đường dẫn thư mục bạn muốn lưu tệp tin vào
                Path filePath = Path.of(uploadDir, file.getOriginalFilename());


                Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Tệp tin đã được lưu trữ thành công.");
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
