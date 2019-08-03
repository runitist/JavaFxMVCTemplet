package application.model.dao;

import java.util.List;

import application.model.vo.LoginTestVO;

public class UserInfo {
	List<LoginTestVO> lltv = null;
	
	public void setUserInfo(LoginTestVO ltv) {
		lltv.add(ltv);
	}
	
	public List<LoginTestVO> getUserInfo() {
		return lltv;
	}

}
