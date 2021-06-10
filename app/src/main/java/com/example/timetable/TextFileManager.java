package com.example.timetable;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//https://apphappy.tistory.com/88

public class TextFileManager {

    private static final String FILE_NAME = "Memo.txt";
    //메모 내용을 저장할 파일 이름

    Context mContext = null;

    public TextFileManager(Context context){
        mContext = context;
    }
    //메모저장함수
    public void save(String strData){
        if(strData ==null || strData.equals("")){
            return;
        }
        FileOutputStream fosMemo = null;
        try{
            //input스트림생성
            fosMemo = mContext.openFileOutput(FILE_NAME,Context.MODE_PRIVATE);

            fosMemo.write(strData.getBytes()); //메모적기
            fosMemo.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //저장된 메모 불러오기
    public String load(){
        try{
            FileInputStream fisMemo = mContext.openFileInput(FILE_NAME);
            byte[]memoData = new byte[fisMemo.available()];
            while(fisMemo.read(memoData)!=-1){}
            return new String(memoData);
        }catch(IOException e){}
        return "";
    }

    public void delete(){
        mContext.deleteFile(FILE_NAME);
    }


}
