package jp.ac.st.originalaso2014001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ChuukichiActivity extends Activity {

	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chuukichiactivity);
		
		//渡ってきたIntetntを取得
		Intent intent = getIntent();
		//intentに混入していたEtraから、キーワードを先に値を取得
		String name =intent.getStringExtra("name");
		
		TextView tv = (TextView)findViewById(R.id.txvMsg);
		tv.setText(name + "さんの今日の運勢は・・・");	}
}
