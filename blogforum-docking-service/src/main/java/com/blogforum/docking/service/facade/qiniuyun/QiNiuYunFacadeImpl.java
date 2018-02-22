package com.blogforum.docking.service.facade.qiniuyun;

import com.blogforum.common.model.Result;
import com.blogforum.docking.facade.qiniuyun.QiNiuYunFacade;
import com.qiniu.util.Auth;

public class QiNiuYunFacadeImpl implements QiNiuYunFacade {

	private String accessKey;
	
	private String secretKey;
	
	private String bucket;
	
	
	@Override
	public Result<String> getUpToken() {
		Auth auth = Auth.create(accessKey, secretKey);
		String upToken = auth.uploadToken(bucket);
		return new Result<String>(true, upToken);
	}


	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}


	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}


	public void setBucket(String bucket) {
		this.bucket = bucket;
	}
	
	

}
