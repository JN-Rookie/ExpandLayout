package com.sjsm.expandlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.img2)
    ImageView    mImg2;
    @BindView(R.id.lyr)
    TextView     mLyr;
    @BindView(R.id.JSR)
    EditText     mJSR;
    @BindView(R.id.SFYZ)
    Button       mSFYZ;
    @BindView(R.id.rq)
    TextView     mRq;
    @BindView(R.id.JSRQ)
    TextView     mJSRQ;
    @BindView(R.id.CZLX)
    EditText     mCZLX;
    @BindView(R.id.BZ)
    EditText     mBZ;
    @BindView(R.id.table1)
    TableLayout  mTable1;
    @BindView(R.id.expandLayout)
    ExpandLayout mExpandLayout;
    @BindView(R.id.img)
    ImageView    mImg;
    @BindView(R.id.select)
    Button       mSelect;
    @BindView(R.id.Summary)
    Button       mSummary;
    @BindView(R.id.lv_sample)
    MyListView   mLvSample;
    @BindView(R.id.UserName)
    TextView     mUserName;
    @BindView(R.id.HZ)
    TextView     mHZ;
    @BindView(R.id.Confirm)
    Button       mConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mExpandLayout.initExpand(true);
        mImg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mExpandLayout.toggleExpand();
            }
        });
    }
}
