package rjptest;


import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

public class Executer{
	//�X���b�g�̕\��
	public ArrayList<ThreadBean> getThreads(){
		DBAccessor DBA=new DBAccessor();
		//�f�[�^�x�[�X�ɐڑ�
		DBA.createConnection();
		
		//DBAccessor����X���b�g���擾
		return DBA.readThreads();
	}

	public ArrayList<ResBean> getRes(String threadid){
		//DBAccessor���C���X�^���X�����Đڑ�
		DBAccessor DBA=new DBAccessor();
		//�f�[�^�x�[�X�ɐڑ�
		DBA.createConnection();
		
		
		return DBA.readRes(threadid);
	}
	
	
}