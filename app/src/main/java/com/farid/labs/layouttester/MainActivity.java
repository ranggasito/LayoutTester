package com.farid.labs.layouttester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayout layLinearHorizontal;
    LinearLayout layLinearVertical;
    Button  btnClearHorizontalChilds;
    Button btnAddChild2Horizontal;
    HorizontalScrollView sv1;
    ScrollView sv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btnAddChild2Horizontal = (Button) findViewById(R.id.btnAddNewChild2Horizontal);
       btnClearHorizontalChilds = (Button) findViewById(R.id.btnClearHorizontalChilds);
       layLinearHorizontal = (LinearLayout)findViewById(R.id.layHorizontal);
        layLinearVertical = (LinearLayout)findViewById(R.id.layVertical);
       sv1 = (HorizontalScrollView) findViewById(R.id.sv1);
       sv2 = (ScrollView) findViewById(R.id.sv2);
    }

    ArrayList<TextView> txs = new ArrayList<TextView>();
    public void btnHorizontalClick(View view){
        TextView tx = new TextView(this);
        txs.add(tx);
        tx.setText("TextField ke " + (txs.size()));
        tx.setPadding(10,10,10,10);
        tx.setFocusable(true);
        layLinearHorizontal.addView(tx);
        sv1.fullScroll(View.FOCUS_RIGHT);
    }

    public void btnClearHorizontalClick(View view){
        layLinearHorizontal.removeAllViews();
        txs.clear();
    }
    ArrayList<TextView> txs2 = new ArrayList<TextView>();
    public void btnVerticalClick(View view){
        TextView tx = new TextView(this);
        txs2.add(tx);
        tx.setText("TextField ke " + (txs2.size()));
        tx.setPadding(10,10,10,10);
        tx.setFocusable(true);
        layLinearVertical.addView(tx);
        sv2.fullScroll(View.FOCUS_DOWN);
    }

    public void btnClearVerticalClick(View view){
        layLinearVertical.removeAllViews();
        txs2.clear();
    }
}
