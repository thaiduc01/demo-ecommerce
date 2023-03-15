package springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.entity.ImageEntity;
import springmvc.repository.ImageRepository;

@Service
public class ImageService {

	@Autowired
	ImageRepository imageRepository;
	
	public void save(ImageEntity image) {
		imageRepository.save(image);
	}
	public List<ImageEntity> getAllImage(){
		return	imageRepository.getAllImage();
	}
}