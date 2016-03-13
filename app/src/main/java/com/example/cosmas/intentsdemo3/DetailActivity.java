package com.example.cosmas.intentsdemo3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by cosmas on 3/13/2016.
 */
public class DetailActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);
    }

    public void buttonPressed(View view)
    {
        Button button = (Button) view;
        String buttontxt=button.getText().toString();
        Intent data=getIntent();
        data.putExtra("choice",buttontxt);
        this.setResult(Activity.RESULT_OK,data);
        finish();
    }
}
