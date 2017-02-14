package rjptest;


import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

public class Executer{
	//スレットの表示
	public ArrayList<ThreadBean> getThreads(){
		DBAccessor DBA=new DBAccessor();
		//データベースに接続
		DBA.createConnection();
		
		//DBAccessorからスレットを取得
		return DBA.readThreads();
	}

	public ArrayList<ResBean> getRes(String threadid){
		//DBAccessorをインスタンス化して接続
		DBAccessor DBA=new DBAccessor();
		//データベースに接続
		DBA.createConnection();
		
		
		return DBA.readRes(threadid);
	}
	
	
}