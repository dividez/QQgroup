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
				* �������Ⱥ���̡�Ⱥ�ţ�ȼ�հɣ��ഺ��(521197317) �� key Ϊ�� bESwXmuP5CGxEhRs4-TFuIVKVMOBkDEI
				* ���� joinQQGroup(bESwXmuP5CGxEhRs4-TFuIVKVMOBkDEI) ���ɷ�����Q�ͻ��������Ⱥ ȼ�հɣ��ഺ��(521197317)
				*
				* @param key �ɹ������ɵ�key
				* @return ����true��ʾ������Q�ɹ�������fals��ʾ����ʧ��
				******************/
					String key="bESwXmuP5CGxEhRs4-TFuIVKVMOBkDEI";
				    Intent intent = new Intent();
				    intent.setData(Uri.parse("mqqopensdkapi://bizAgent/qm/qr?url=http%3A%2F%2Fqm.qq.com%2Fcgi-bin%2Fqm%2Fqr%3Ffrom%3Dapp%26p%3Dandroid%26k%3D" + key));
				   // ��Flag�ɸ��ݾ����Ʒ��Ҫ�Զ��壬�����ã����ڼ�Ⱥ���水���أ�������Q�����棬�����ã������ػ᷵�ص������Ʒ����    //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
				    try {
				        startActivity(intent);
				        return ;
				    } catch (Exception e) {
				        // δ��װ��Q��װ�İ汾��֧��
				        return ;
				    }
				}

			
		});
	}

}
