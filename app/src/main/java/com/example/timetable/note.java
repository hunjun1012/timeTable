package com.example.timetable;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

//https://apphappy.tistory.com/88

public class note extends AppCompatActivity {

    EditText mMemoEdit = null;
    TextFileManager mTextFileManager = new TextFileManager(this);

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notepage);

        mMemoEdit = (EditText)findViewById(R.id.memo);

    }

    public void onClick(View v){
        switch(v.getId()){

            case R.id.load:{
                String memoData = mTextFileManager.load();
                mMemoEdit.setText(memoData);

                Toast.makeText(this,"불러오기 완료",Toast.LENGTH_LONG).show();
                break;
            }

            case R.id.save:{
                String memoData = mMemoEdit.getText().toString();
                mTextFileManager.save(memoData);
                mMemoEdit.setText("");

                Toast.makeText(this,"저장 완료",Toast.LENGTH_LONG).show();
                break;
            }

            case R.id.delete:{
                mTextFileManager.delete();
                mMemoEdit.setText("");

                Toast.makeText(this,"삭제 완료",Toast.LENGTH_LONG).show();
            }

        }

    }

}
