package com.fileupload.File.Upload.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service
public interface StorageService {
    String uploadFile(MultipartFile file);
    byte[] downloadFile(String fileName);
}
