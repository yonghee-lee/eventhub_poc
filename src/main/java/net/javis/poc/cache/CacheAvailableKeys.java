package net.javis.poc.cache;

public class CacheAvailableKeys {


	public static String userCdDataKey(String sysCdGroupId) {
		return CacheUtil.key("userCd", sysCdGroupId);
	}

}
