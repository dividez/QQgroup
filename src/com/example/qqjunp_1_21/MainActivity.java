package com.example.qqjunp_1_21;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button bt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bt=(Button) findViewById(R.id.bt);
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				/****************
				*
				* 发起添加群流程。群号：燃烧吧，青春！(521197317) 的 key 为： bESwXmuP5CGxEhRs4-TFuIVKVMOBkDEI
				* 调用 joinQQGroup(bESwXmuP5CGxEhRs4-TFuIVKVMOBkDEI) 即可发起手Q客户端申请加群 燃烧吧，青春！(521197317)
				*
				* @param key 由官网生成的key
				* @return 返回true表示呼起手Q成功，返回fals表示呼起失败
				******************/
					String key="bESwXmuP5CGxEhRs4-TFuIVKVMOBkDEI";
				    Intent intent = new Intent();
				    intent.setData(Uri.parse("mqqopensdkapi://bizAgent/qm/qr?url=http%3A%2F%2Fqm.qq.com%2Fcgi-bin%2Fqm%2Fqr%3Ffrom%3Dapp%26p%3Dandroid%26k%3D" + key));
				   // 此Flag可根据具体产品需要自定义，如设置，则在加群界面按返回，返回手Q主界面，不设置，按返回会返回到呼起产品界面    //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
				    try {
				        startActivity(intent);
				        return ;
				    } catch (Exception e) {
				        // 未安装手Q或安装的版本不支持
				        return ;
				    }
				}

			
		});
	}

}
