package com.springreact.test.service.impl;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.springreact.test.service.FileService;

@Service
public class FileServiceImpl implements FileService {
	
	private final Path rootFolder = Paths.get("uploads");

	@Override
	public void save(MultipartFile file) throws Exception {
		Files.copy(file.getInputStream(), this.rootFolder.resolve(file.getOriginalFilename()));
	}

	@Override
	public void save(List<MultipartFile> files) throws Exception {
		for (MultipartFile file : files) {
			this.save(file);
		}
		
	}

	@Override
	public Resource load(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Path> loadAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
