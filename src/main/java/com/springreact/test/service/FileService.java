package com.springreact.test.service;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {

	// guardar un archivo
	public void save(MultipartFile file) throws Exception;
	
	//guardar muchos archivos
	public void save(List<MultipartFile> file) throws Exception;
	// cargar un archivo
	public Resource load (String name) throws Exception;
	// 
	public Stream<Path> loadAll() throws Exception;
}	
