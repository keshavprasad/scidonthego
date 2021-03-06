package org.scid.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class ImportPgnActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pgnimport);
		String pgnFileName = getIntent().getAction();
		new ImportPgnTask(this, pgnFileName).execute();
	}

	public void onOkClick(View view) {
		setResult(RESULT_OK);
		finish();
	}
}
