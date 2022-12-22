package com.sdp.controller;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

	void uploadFile(MultipartFile file,String uname);
}