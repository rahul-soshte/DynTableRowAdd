package com.example.hunter.tabletut;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DigitalClock;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    /** Called when the activity is first created. */
    Button btn;
    int counter=0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.Button01);
        btn.setOnClickListener( this);

    }

    public void onClick(View view){
        TableLayout tl=(TableLayout)findViewById(R.id.TableLayout01);
        TableRow tr=new TableRow(this);
        counter++;
        TextView tv= new TextView(this);
        tv.setText("text"+counter);
        CheckBox cb=new CheckBox(this);
        DigitalClock dc= new DigitalClock(this);
        ImageView ib=new ImageView(this);
        ib.setImageResource(R.drawable.icon);
        tr.addView(tv);
        tr.addView(ib);
        tr.addView(dc);
        tr.addView(cb);
        tl.addView(tr,new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT));

    }

}