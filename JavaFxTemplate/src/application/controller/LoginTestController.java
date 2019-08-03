package application.controller;

import java.util.List;

import application.LoginTestMain;
import application.model.service.UserInfoService;
import application.model.vo.LoginTestVO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginTestController {
	@FXML
	private Button check;
	@FXML
	private TextField testpw;
	@FXML
	private TextField testid;
	
	UserInfoService uis;
	
	 // 메인 애플리케이션 참조
    private LoginTestMain mainApp;
    
    /**
     * 생성자.
     * initialize() 메서드 이전에 호출된다.
     */
    public LoginTestController() {
    }

    /**
     * 컨트롤러 클래스를 초기화한다.
     * fxml 파일이 로드되고 나서 자동으로 호출된다.
     */
    @FXML
    private void initialize() {
    	uis = new UserInfoService();
    	
        // 초기화 로직
    	testid.setPromptText("아이디를 입력해 주세요.");
    	testpw.setPromptText("비밀번호를 입력해 주세요");
        
    }
    
    @FXML
    private void LoginBtnclick() {
    	LoginTestVO ltv = new LoginTestVO();
    	List<LoginTestVO> lltv = uis.getltv();
    	if(testpw.getText().length() > 0 && testid.getText().length() >0) {
    		ltv.setId(testid.getText());
    		ltv.setPw(testpw.getText());
    		uis.setltv(ltv);
    	}
    }

    /**
     * 참조를 다시 유지하기 위해 메인 애플리케이션이 호출한다.
     * Main을 기반으로 다른 화면과의 정보 전달이 가능해진다.
     * setMainApp(...) 메서드는 반드시 MainApp 클래스에서 호출해야 한다.
     *
     * @param mainApp
     */
    public void setMainApp(LoginTestMain mainApp) {
        this.mainApp = mainApp;
    }
    
}
