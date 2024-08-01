package net.javis.poc.cache;

import org.springframework.data.repository.CrudRepository;

public interface UserCdDataCacheRepository extends CrudRepository<UserCdData, String> {
	
}
