package net.javis.poc.service;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import net.javis.poc.cache.UserCdData;
import net.javis.poc.cache.UserCdDataCacheRepository;
import net.javis.poc.cache.UserCdListDTO;

@Service
@Slf4j
public class CacheDataLoadService {

		
	@Autowired
	private UserCdDataCacheRepository userCdDataCacheRepository;
	
	
	@PostConstruct
	void saveData() {
		log.debug("save Cache Data!!");

	}
	
	public UserCdListDTO getUserCdData(String sysCdGroupId) {
		String redisKey = net.javis.poc.cache.CacheAvailableKeys.userCdDataKey(sysCdGroupId);
		UserCdListDTO userCdListDTO = new UserCdListDTO();
		// if(userCdListDTO == null || userCdListDTO.getUserCdOutDto() == null) {
		// 	return null;
		// }
		UserCdData userCdData = new UserCdData(redisKey, userCdListDTO, LocalDateTime.now());
		Optional<UserCdData> savedData = Optional.ofNullable(userCdDataCacheRepository.save(userCdData));
		log.debug("userCdListDTO = {}", userCdListDTO);
		return userCdListDTO;
	}
	
}
