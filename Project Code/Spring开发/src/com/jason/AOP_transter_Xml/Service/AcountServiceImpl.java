package com.jason.AOP_transter_Xml.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.jason.AOP_transter_Xml.dao.UserDao;




public class AcountServiceImpl implements AcountService {

/*	@Autowired()
	@Qualifier("UserDao_ID")*/
	private UserDao userdao;
	
   
   
	public UserDao getUserdao() {
		return userdao;
	}



	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}



	@Override
	public void transfer_acount(String user_out, String user_in, int money) {
     
			userdao.outer(user_out, money);
			//int i=3/0;
			userdao.inner(user_in, money);
			
	
	}




	

}
