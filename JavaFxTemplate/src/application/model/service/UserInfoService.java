package application.model.service;

import java.util.List;

import application.model.dao.UserInfo;
import application.model.vo.LoginTestVO;

public class UserInfoService {
	UserInfo ui = new UserInfo();
	
	public List<LoginTestVO> getltv(){
		return ui.getUserInfo();
	}
	
	public void setltv(LoginTestVO ltv) {
		ui.setUserInfo(ltv);
	}

}
