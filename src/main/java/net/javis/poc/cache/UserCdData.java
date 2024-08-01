package net.javis.poc.cache;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Builder;
import lombok.Getter;

@Getter
@RedisHash(value="userCdData", timeToLive=600L )
public class UserCdData implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String key;
	
	private UserCdListDTO userCdListDto;
	
    private LocalDateTime refreshTime;

    
    @Builder
    public UserCdData(
    		String key, 
    		UserCdListDTO userCdListDto, 
    		LocalDateTime refreshTime) {
        this.key = key;
        this.userCdListDto = userCdListDto;
        this.refreshTime = refreshTime;
    }

    public void refresh(UserCdListDTO userCdListDto, LocalDateTime refreshTime){
        if(refreshTime.isAfter(this.refreshTime)){ // 저장된 데이터보다 최신 데이터일 경우
        	this.userCdListDto = userCdListDto;
            this.refreshTime = refreshTime;
        }
    }
    

}
