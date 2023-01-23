package com.iamnbty.training.backend.business;

import com.iamnbty.training.backend.exception.BaseException;
import com.iamnbty.training.backend.exception.FiletException;
import com.iamnbty.training.backend.exception.UserException;
import com.iamnbty.training.backend.model.MRegisterRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class TestBusiness {

    public String register(MRegisterRequest request) throws BaseException {
        if (request == null) {
            throw UserException.requestNull();
        }

        // validate email
        if (Objects.isNull(request.getEmail())) {
            throw UserException.emailNull();
        }

        // validate...

        return "";
    }

    public String uploadProfilePicture(MultipartFile file) throws BaseException {
        //validate file
        if (file == null) {
            throw FiletException.fileNull();
        }

        //validate size
        if (file.getSize() > 1048576 * 2) {
            throw FiletException.fileMaxSize();
        }

        String contentType = file.getContentType();
        if (contentType == null) {
            throw FiletException.unsupported();
        }

        List<String> supportedTypes = Arrays.asList("image/jpeg", "image/png");
        if (supportedTypes.contains(contentType)) {
            throw FiletException.unsupported();
        }

        // TODO: upload file File Storage (AWS, S3, etc ...)
        try {
            byte[] bytes = file.getBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return "";
    }

}
