package com.iamnbty.training.backend.api;

import com.iamnbty.training.backend.business.TestBusiness;
import com.iamnbty.training.backend.exception.BaseException;
import com.iamnbty.training.backend.model.MRegisterRequest;
import com.iamnbty.training.backend.model.TestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestApi {

    private final TestBusiness business;

    @GetMapping
    public TestResponse test() {
        TestResponse response = new TestResponse();
        response.setName("Piyapat");
        response.setFood("KFC");

        return response;
    }

    @PostMapping
    @RequestMapping("/register")
    public ResponseEntity<String> register(@RequestBody MRegisterRequest request) throws BaseException {
        String response = business.register(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<String> uploadProfilePicture(@RequestPart MultipartFile file) throws BaseException {
        String response = business.uploadProfilePicture(file);
        return ResponseEntity.ok(response);
    }

}