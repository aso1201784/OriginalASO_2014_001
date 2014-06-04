package jp.ac.st.originalaso2014001;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	


	
	Button btn = (Button)findViewById(R.id.btnOK);
	btn.setOnClickListener(new View.OnClickListener() {
	public void onClick(View v){
		//TODO 自動作成されたメソッド・スタブ
		//switch(v.getId()){//どのボタンが押されたが判定
		//case R.id.btnOK: //btnMsgが押された
			//エディットテキストから入力内容を取り出す
			EditText etv = (EditText)findViewById(R.id.editname);
			String inputMsg = etv.getText().toString();
			
			//Randomクラスのインスタンスを作る
			Random rnd = new Random();
			//0～から3の4パターンの数字をranに取得
			int ran = rnd.nextInt(4);
			
			//生成して代入用のIntentインスタンス変数を用意
			Intent intent = null;
			//ranの値によって処理をわける
			switch(ran){
				case 0:
					//0なら大吉のページに飛ばす
					//インテントのインスタンス生成
					intent = new Intent(MainActivity.this,DaikichiActivity.class);
					//次画面のアクティビティ起動
					startActivity(intent);
					break;
					
				case 1:
					//1なら中吉のページに飛ばす
					//インテントのインスタンス生成
					intent = new Intent(MainActivity.this,ChuukichiActivity.class);
					//次画面のアクティビティ起動
					startActivity(intent);
					break;
					
				case 2:
					//2なら凶のページに飛ばす
					//インテントのインスタンス生成
					intent = new Intent(MainActivity.this,KyouActivity.class);
					//次画面のアクティビティ起動
					startActivity(intent);
					break;
					
				case 3:
					//3なら大吉のページに飛ばす
					//インテントのインスタンス生成
					intent = new Intent(MainActivity.this,DakyouActivity.class);
					//次画面のアクティビティ起動
					startActivity(intent);
					break;
			

					
				
					
			}
			intent.putExtra("name", inputMsg);
			//次画面のアクティビティ画面
			startActivity(intent);
		}
	});
	
	}
}


