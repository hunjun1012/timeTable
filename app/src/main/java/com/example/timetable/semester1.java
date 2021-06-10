package com.example.timetable;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class semester1 extends AppCompatActivity {


    Button mon1, mon2;


    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.semester1);

//월요일
        final int[] temp = {0, 1, 2, 3, 4, 5, 6, 7};
        final Button mon1 = (Button) findViewById(R.id.mon1);
        mon1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (temp[0] == 0) {
                    mon1.setBackgroundColor(Color.RED);
                    temp[0] = 1;
                } else if (temp[1] == 1) {
                    mon1.setBackgroundColor(Color.YELLOW);
                    temp[1] = 2;
                } else if (temp[2] == 2) {
                    mon1.setBackgroundColor(Color.GREEN);
                    temp[2] = 3;
                } else if (temp[3] == 3) {
                    mon1.setBackgroundColor(Color.BLUE);
                    temp[3] = 4;
                } else if (temp[4] == 4) {
                    mon1.setBackgroundColor(Color.GRAY);
                    temp[4] = 5;
                } else if (temp[5] == 5) {
                    mon1.setBackgroundColor(Color.MAGENTA);
                    temp[5] = 6;
                } else if (temp[6] == 6) {
                    mon1.setBackgroundColor(Color.CYAN);
                    temp[6] = 7;
                } else {
                    mon1.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        temp[i] = i;
                    }
                }
            }
        });

        final int[] temp2 = {0, 1, 2, 3, 4, 5, 6, 7};
        final Button mon2 = (Button) findViewById(R.id.mon2);
        mon2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (temp2[0] == 0) {
                    mon2.setBackgroundColor(Color.RED);
                    temp2[0] = 1;

                } else if (temp2[1] == 1) {
                    mon2.setBackgroundColor(Color.YELLOW);
                    temp2[1] = 2;
                } else if (temp2[2] == 2) {
                    mon2.setBackgroundColor(Color.GREEN);
                    temp2[2] = 3;
                } else if (temp2[3] == 3) {
                    mon2.setBackgroundColor(Color.BLUE);
                    temp2[3] = 4;
                } else if (temp2[4] == 4) {
                    mon2.setBackgroundColor(Color.GRAY);
                    temp2[4] = 5;
                } else if (temp2[5] == 5) {
                    mon2.setBackgroundColor(Color.MAGENTA);
                    temp2[5] = 6;

                } else if (temp2[6] == 6) {
                    mon2.setBackgroundColor(Color.CYAN);
                    temp2[6] = 7;
                } else {
                    mon2.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        //System.out.println("color test!!!11   "+i);
                        temp2[i] = i;
                    }
                }
            }
        });

        final int[] temp3 = {0, 1, 2, 3, 4, 5, 6, 7};
        final Button mon3 = (Button) findViewById(R.id.mon3);
        mon3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (temp3[0] == 0) {
                    mon3.setBackgroundColor(Color.RED);
                    temp3[0] = 1;

                } else if (temp3[1] == 1) {
                    mon3.setBackgroundColor(Color.YELLOW);
                    temp3[1] = 2;
                } else if (temp3[2] == 2) {
                    mon3.setBackgroundColor(Color.GREEN);
                    temp3[2] = 3;
                } else if (temp3[3] == 3) {
                    mon3.setBackgroundColor(Color.BLUE);
                    temp3[3] = 4;
                } else if (temp3[4] == 4) {
                    mon3.setBackgroundColor(Color.GRAY);
                    temp3[4] = 5;
                } else if (temp3[5] == 5) {
                    mon3.setBackgroundColor(Color.MAGENTA);
                    temp3[5] = 6;

                } else if (temp3[6] == 6) {
                    mon3.setBackgroundColor(Color.CYAN);
                    temp3[6] = 7;
                } else {
                    mon3.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        //System.out.println("color test!!!11   "+i);
                        temp3[i] = i;
                    }
                }
            }
        });

        final int[] temp4 = {0, 1, 2, 3, 4, 5, 6, 7};
        final Button mon4 = (Button) findViewById(R.id.mon4);
        mon4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (temp4[0] == 0) {
                    mon4.setBackgroundColor(Color.RED);
                    temp4[0] = 1;
                } else if (temp4[1] == 1) {
                    mon4.setBackgroundColor(Color.YELLOW);
                    temp4[1] = 2;
                } else if (temp4[2] == 2) {
                    mon4.setBackgroundColor(Color.GREEN);
                    temp4[2] = 3;
                } else if (temp4[3] == 3) {
                    mon4.setBackgroundColor(Color.BLUE);
                    temp4[3] = 4;
                } else if (temp4[4] == 4) {
                    mon4.setBackgroundColor(Color.GRAY);
                    temp4[4] = 5;
                } else if (temp4[5] == 5) {
                    mon4.setBackgroundColor(Color.MAGENTA);
                    temp4[5] = 6;
                } else if (temp4[6] == 6) {
                    mon4.setBackgroundColor(Color.CYAN);
                    temp4[6] = 7;
                } else {
                    mon4.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        temp4[i] = i;
                    }
                }
            }
        });

        final int[] temp5 = {0, 1, 2, 3, 4, 5, 6, 7};
        final Button mon5 = (Button) findViewById(R.id.mon5);
        mon5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (temp5[0] == 0) {
                    mon5.setBackgroundColor(Color.RED);
                    temp5[0] = 1;
                } else if (temp5[1] == 1) {
                    mon5.setBackgroundColor(Color.YELLOW);
                    temp5[1] = 2;
                } else if (temp5[2] == 2) {
                    mon5.setBackgroundColor(Color.GREEN);
                    temp5[2] = 3;
                } else if (temp5[3] == 3) {
                    mon5.setBackgroundColor(Color.BLUE);
                    temp5[3] = 4;
                } else if (temp5[4] == 4) {
                    mon5.setBackgroundColor(Color.GRAY);
                    temp5[4] = 5;
                } else if (temp5[5] == 5) {
                    mon5.setBackgroundColor(Color.MAGENTA);
                    temp5[5] = 6;
                } else if (temp5[6] == 6) {
                    mon5.setBackgroundColor(Color.CYAN);
                    temp5[6] = 7;
                } else {
                    mon5.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        temp5[i] = i;
                    }
                }
            }
        });

        final int[] temp6 = {0, 1, 2, 3, 4, 5, 6, 7};
        final Button mon6 = (Button) findViewById(R.id.mon6);
        mon6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (temp6[0] == 0) {
                    mon6.setBackgroundColor(Color.RED);
                    temp6[0] = 1;
                } else if (temp6[1] == 1) {
                    mon6.setBackgroundColor(Color.YELLOW);
                    temp6[1] = 2;
                } else if (temp6[2] == 2) {
                    mon6.setBackgroundColor(Color.GREEN);
                    temp6[2] = 3;
                } else if (temp6[3] == 3) {
                    mon6.setBackgroundColor(Color.BLUE);
                    temp6[3] = 4;
                } else if (temp6[4] == 4) {
                    mon6.setBackgroundColor(Color.GRAY);
                    temp6[4] = 5;
                } else if (temp6[5] == 5) {
                    mon6.setBackgroundColor(Color.MAGENTA);
                    temp6[5] = 6;
                } else if (temp6[6] == 6) {
                    mon6.setBackgroundColor(Color.CYAN);
                    temp6[6] = 7;
                } else {
                    mon6.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        temp6[i] = i;
                    }
                }
            }
        });

        final int[] temp7 = {0, 1, 2, 3, 4, 5, 6, 7};
        final Button mon7 = (Button) findViewById(R.id.mon7);
        mon7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (temp7[0] == 0) {
                    mon7.setBackgroundColor(Color.RED);
                    temp7[0] = 1;
                } else if (temp7[1] == 1) {
                    mon7.setBackgroundColor(Color.YELLOW);
                    temp7[1] = 2;
                } else if (temp7[2] == 2) {
                    mon7.setBackgroundColor(Color.GREEN);
                    temp7[2] = 3;
                } else if (temp7[3] == 3) {
                    mon7.setBackgroundColor(Color.BLUE);
                    temp7[3] = 4;
                } else if (temp7[4] == 4) {
                    mon7.setBackgroundColor(Color.GRAY);
                    temp7[4] = 5;
                } else if (temp7[5] == 5) {
                    mon7.setBackgroundColor(Color.MAGENTA);
                    temp7[5] = 6;
                } else if (temp7[6] == 6) {
                    mon7.setBackgroundColor(Color.CYAN);
                    temp7[6] = 7;
                } else {
                    mon7.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        temp7[i] = i;
                    }
                }
            }
        });

        final int[] temp8 = {0, 1, 2, 3, 4, 5, 6, 7};
        final Button mon8= (Button) findViewById(R.id.mon8);
        mon8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (temp8[0] == 0) {
                    mon8.setBackgroundColor(Color.RED);
                    temp8[0] = 1;
                } else if (temp8[1] == 1) {
                    mon8.setBackgroundColor(Color.YELLOW);
                    temp8[1] = 2;
                } else if (temp8[2] == 2) {
                    mon8.setBackgroundColor(Color.GREEN);
                    temp8[2] = 3;
                } else if (temp8[3] == 3) {
                    mon8.setBackgroundColor(Color.BLUE);
                    temp8[3] = 4;
                } else if (temp8[4] == 4) {
                    mon8.setBackgroundColor(Color.GRAY);
                    temp8[4] = 5;
                } else if (temp8[5] == 5) {
                    mon8.setBackgroundColor(Color.MAGENTA);
                    temp8[5] = 6;
                } else if (temp8[6] == 6) {
                    mon8.setBackgroundColor(Color.CYAN);
                    temp8[6] = 7;
                } else {
                    mon8.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        temp8[i] = i;
                    }
                }
            }
        });

        final int[] temp9 = {0, 1, 2, 3, 4, 5, 6, 7};
        final Button mon9= (Button) findViewById(R.id.mon9);
        mon9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (temp9[0] == 0) {
                    mon9.setBackgroundColor(Color.RED);
                    temp9[0] = 1;
                } else if (temp9[1] == 1) {
                    mon9.setBackgroundColor(Color.YELLOW);
                    temp9[1] = 2;
                } else if (temp9[2] == 2) {
                    mon9.setBackgroundColor(Color.GREEN);
                    temp9[2] = 3;
                } else if (temp9[3] == 3) {
                    mon9.setBackgroundColor(Color.BLUE);
                    temp9[3] = 4;
                } else if (temp9[4] == 4) {
                    mon9.setBackgroundColor(Color.GRAY);
                    temp9[4] = 5;
                } else if (temp9[5] == 5) {
                    mon9.setBackgroundColor(Color.MAGENTA);
                    temp9[5] = 6;
                } else if (temp9[6] == 6) {
                    mon9.setBackgroundColor(Color.CYAN);
                    temp9[6] = 7;
                } else {
                    mon9.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        temp9[i] = i;
                    }
                }
            }
        });

        final int[] temp10= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button mon10= (Button) findViewById(R.id.mon10);
        mon10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (temp10[0] == 0) {
                    mon10.setBackgroundColor(Color.RED);
                    temp10[0] = 1;
                } else if (temp10[1] == 1) {
                    mon10.setBackgroundColor(Color.YELLOW);
                    temp10[1] = 2;
                } else if (temp10[2] == 2) {
                    mon10.setBackgroundColor(Color.GREEN);
                    temp10[2] = 3;
                } else if (temp10[3] == 3) {
                    mon10.setBackgroundColor(Color.BLUE);
                    temp10[3] = 4;
                } else if (temp10[4] == 4) {
                    mon10.setBackgroundColor(Color.GRAY);
                    temp10[4] = 5;
                } else if (temp10[5] == 5) {
                    mon10.setBackgroundColor(Color.MAGENTA);
                    temp10[5] = 6;
                } else if (temp10[6] == 6) {
                    mon10.setBackgroundColor(Color.CYAN);
                    temp10[6] = 7;
                } else {
                    mon10.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        temp10[i] = i;
                    }
                }
            }
        });
//화요일
        final int[] temptues1 = {0, 1, 2, 3, 4, 5, 6, 7};
        final Button tues1 = (Button) findViewById(R.id.tues1);
        tues1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (temptues1[0] == 0) {
                    tues1.setBackgroundColor(Color.RED);
                    temptues1[0] = 1;
                } else if (temptues1[1] == 1) {
                    tues1.setBackgroundColor(Color.YELLOW);
                    temptues1[1] = 2;
                } else if (temptues1[2] == 2) {
                    tues1.setBackgroundColor(Color.GREEN);
                    temptues1[2] = 3;
                } else if (temptues1[3] == 3) {
                    tues1.setBackgroundColor(Color.BLUE);
                    temptues1[3] = 4;
                } else if (temptues1[4] == 4) {
                    tues1.setBackgroundColor(Color.GRAY);
                    temptues1[4] = 5;
                } else if (temptues1[5] == 5) {
                    tues1.setBackgroundColor(Color.MAGENTA);
                    temptues1[5] = 6;
                } else if (temptues1[6] == 6) {
                    tues1.setBackgroundColor(Color.CYAN);
                    temptues1[6] = 7;
                } else {
                    tues1.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        temptues1[i] = i;
                    }
                }
            }
        });


        final int[] temptues2 = {0, 1, 2, 3, 4, 5, 6, 7};
        final Button tues2 = (Button) findViewById(R.id.tues2);
        tues2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (temptues2[0] == 0) {
                    tues2.setBackgroundColor(Color.RED);
                    temptues2[0] = 1;
                } else if (temptues2[1] == 1) {
                    tues2.setBackgroundColor(Color.YELLOW);
                    temptues2[1] = 2;
                } else if (temptues2[2] == 2) {
                    tues2.setBackgroundColor(Color.GREEN);
                    temptues2[2] = 3;
                } else if (temptues2[3] == 3) {
                    tues2.setBackgroundColor(Color.BLUE);
                    temptues2[3] = 4;
                } else if (temptues2[4] == 4) {
                    tues2.setBackgroundColor(Color.GRAY);
                    temptues2[4] = 5;
                } else if (temptues2[5] == 5) {
                    tues2.setBackgroundColor(Color.MAGENTA);
                    temptues2[5] = 6;
                } else if (temptues2[6] == 6) {
                    tues2.setBackgroundColor(Color.CYAN);
                    temptues2[6] = 7;
                } else {
                    tues2.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        temptues2[i] = i;
                    }
                }
            }
        });

        final int[] temptues3 = {0, 1, 2, 3, 4, 5, 6, 7};
        final Button tues3 = (Button) findViewById(R.id.tues3);
        tues3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (temptues3[0] == 0) {
                    tues3.setBackgroundColor(Color.RED);
                    temptues3[0] = 1;
                } else if (temptues3[1] == 1) {
                    tues3.setBackgroundColor(Color.YELLOW);
                    temptues3[1] = 2;
                } else if (temptues3[2] == 2) {
                    tues3.setBackgroundColor(Color.GREEN);
                    temptues3[2] = 3;
                } else if (temptues3[3] == 3) {
                    tues3.setBackgroundColor(Color.BLUE);
                    temptues3[3] = 4;
                } else if (temptues3[4] == 4) {
                    tues3.setBackgroundColor(Color.GRAY);
                    temptues3[4] = 5;
                } else if (temptues3[5] == 5) {
                    tues3.setBackgroundColor(Color.MAGENTA);
                    temptues3[5] = 6;
                } else if (temptues3[6] == 6) {
                    tues3.setBackgroundColor(Color.CYAN);
                    temptues3[6] = 7;
                } else {
                    tues3.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        temptues3[i] = i;
                    }
                }
            }
        });

        final int[] temptues4 = {0, 1, 2, 3, 4, 5, 6, 7};
        final Button tues4 = (Button) findViewById(R.id.tues4);
        tues4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (temptues4[0] == 0) {
                    tues4.setBackgroundColor(Color.RED);
                    temptues4[0] = 1;
                } else if (temptues4[1] == 1) {
                    tues4.setBackgroundColor(Color.YELLOW);
                    temptues4[1] = 2;
                } else if (temptues4[2] == 2) {
                    tues4.setBackgroundColor(Color.GREEN);
                    temptues4[2] = 3;
                } else if (temptues4[3] == 3) {
                    tues4.setBackgroundColor(Color.BLUE);
                    temptues4[3] = 4;
                } else if (temptues4[4] == 4) {
                    tues4.setBackgroundColor(Color.GRAY);
                    temptues4[4] = 5;
                } else if (temptues4[5] == 5) {
                    tues4.setBackgroundColor(Color.MAGENTA);
                    temptues4[5] = 6;
                } else if (temptues4[6] == 6) {
                    tues4.setBackgroundColor(Color.CYAN);
                    temptues4[6] = 7;
                } else {
                    tues4.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        temptues4[i] = i;
                    }
                }
            }
        });

        final int[] temptues5 = {0, 1, 2, 3, 4, 5, 6, 7};
        final Button tues5 = (Button) findViewById(R.id.tues5);
        tues5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (temptues5[0] == 0) {
                    tues5.setBackgroundColor(Color.RED);
                    temptues5[0] = 1;
                } else if (temptues5[1] == 1) {
                    tues5.setBackgroundColor(Color.YELLOW);
                    temptues5[1] = 2;
                } else if (temptues5[2] == 2) {
                    tues5.setBackgroundColor(Color.GREEN);
                    temptues5[2] = 3;
                } else if (temptues5[3] == 3) {
                    tues5.setBackgroundColor(Color.BLUE);
                    temptues5[3] = 4;
                } else if (temptues5[4] == 4) {
                    tues5.setBackgroundColor(Color.GRAY);
                    temptues5[4] = 5;
                } else if (temptues5[5] == 5) {
                    tues5.setBackgroundColor(Color.MAGENTA);
                    temptues5[5] = 6;
                } else if (temptues5[6] == 6) {
                    tues5.setBackgroundColor(Color.CYAN);
                    temptues5[6] = 7;
                } else {
                    tues5.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        temptues5[i] = i;
                    }
                }
            }
        });

        final int[] temptues6 = {0, 1, 2, 3, 4, 5, 6, 7};
        final Button tues6 = (Button) findViewById(R.id.tues6);
        tues6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (temptues6[0] == 0) {
                    tues6.setBackgroundColor(Color.RED);
                    temptues6[0] = 1;
                } else if (temptues6[1] == 1) {
                    tues6.setBackgroundColor(Color.YELLOW);
                    temptues6[1] = 2;
                } else if (temptues6[2] == 2) {
                    tues6.setBackgroundColor(Color.GREEN);
                    temptues6[2] = 3;
                } else if (temptues6[3] == 3) {
                    tues6.setBackgroundColor(Color.BLUE);
                    temptues6[3] = 4;
                } else if (temptues6[4] == 4) {
                    tues6.setBackgroundColor(Color.GRAY);
                    temptues6[4] = 5;
                } else if (temptues6[5] == 5) {
                    tues6.setBackgroundColor(Color.MAGENTA);
                    temptues6[5] = 6;
                } else if (temptues6[6] == 6) {
                    tues6.setBackgroundColor(Color.CYAN);
                    temptues6[6] = 7;
                } else {
                    tues6.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        temptues6[i] = i;
                    }
                }
            }
        });

        final int[] temptues7 = {0, 1, 2, 3, 4, 5, 6, 7};
        final Button tues7 = (Button) findViewById(R.id.tues7);
        tues7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (temptues7[0] == 0) {
                    tues7.setBackgroundColor(Color.RED);
                    temptues7[0] = 1;
                } else if (temptues7[1] == 1) {
                    tues7.setBackgroundColor(Color.YELLOW);
                    temptues7[1] = 2;
                } else if (temptues7[2] == 2) {
                    tues7.setBackgroundColor(Color.GREEN);
                    temptues7[2] = 3;
                } else if (temptues7[3] == 3) {
                    tues7.setBackgroundColor(Color.BLUE);
                    temptues7[3] = 4;
                } else if (temptues7[4] == 4) {
                    tues7.setBackgroundColor(Color.GRAY);
                    temptues7[4] = 5;
                } else if (temptues7[5] == 5) {
                    tues7.setBackgroundColor(Color.MAGENTA);
                    temptues7[5] = 6;
                } else if (temptues7[6] == 6) {
                    tues7.setBackgroundColor(Color.CYAN);
                    temptues7[6] = 7;
                } else {
                    tues7.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        temptues7[i] = i;
                    }
                }
            }
        });
//수요일
        final int[] tempwed1 = {0, 1, 2, 3, 4, 5, 6, 7};
        final Button wed1 = (Button) findViewById(R.id.wed1);
        wed1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (tempwed1[0] == 0) {
                    wed1.setBackgroundColor(Color.RED);
                    tempwed1[0] = 1;
                } else if (tempwed1[1] == 1) {
                    wed1.setBackgroundColor(Color.YELLOW);
                    tempwed1[1] = 2;
                } else if (tempwed1[2] == 2) {
                    wed1.setBackgroundColor(Color.GREEN);
                    tempwed1[2] = 3;
                } else if (tempwed1[3] == 3) {
                    wed1.setBackgroundColor(Color.BLUE);
                    tempwed1[3] = 4;
                } else if (tempwed1[4] == 4) {
                    wed1.setBackgroundColor(Color.GRAY);
                    tempwed1[4] = 5;
                } else if (tempwed1[5] == 5) {
                    wed1.setBackgroundColor(Color.MAGENTA);
                    tempwed1[5] = 6;
                } else if (tempwed1[6] == 6) {
                    wed1.setBackgroundColor(Color.CYAN);
                    tempwed1[6] = 7;
                } else {
                    wed1.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempwed1[i] = i;
                    }
                }
            }
        });

        final int[] tempwed2= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button wed2 = (Button) findViewById(R.id.wed2);
        wed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempwed2[0] == 0) {
                    wed2.setBackgroundColor(Color.RED);
                    tempwed2[0] = 1;
                } else if (tempwed2[1] == 1) {
                    wed2.setBackgroundColor(Color.YELLOW);
                    tempwed2[1] = 2;
                } else if (tempwed2[2] == 2) {
                    wed2.setBackgroundColor(Color.GREEN);
                    tempwed2[2] = 3;
                } else if (tempwed2[3] == 3) {
                    wed2.setBackgroundColor(Color.BLUE);
                    tempwed2[3] = 4;
                } else if (tempwed2[4] == 4) {
                    wed2.setBackgroundColor(Color.GRAY);
                    tempwed2[4] = 5;
                } else if (tempwed2[5] == 5) {
                    wed2.setBackgroundColor(Color.MAGENTA);
                    tempwed2[5] = 6;
                } else if (tempwed2[6] == 6) {
                    wed2.setBackgroundColor(Color.CYAN);
                    tempwed2[6] = 7;
                } else {
                    wed2.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempwed2[i] = i;
                    }
                }
            }
        });

        final int[] tempwed3= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button wed3 = (Button) findViewById(R.id.wed3);
        wed3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempwed3[0] == 0) {
                    wed3.setBackgroundColor(Color.RED);
                    tempwed3[0] = 1;
                } else if (tempwed3[1] == 1) {
                    wed3.setBackgroundColor(Color.YELLOW);
                    tempwed3[1] = 2;
                } else if (tempwed3[2] == 2) {
                    wed3.setBackgroundColor(Color.GREEN);
                    tempwed3[2] = 3;
                } else if (tempwed3[3] == 3) {
                    wed3.setBackgroundColor(Color.BLUE);
                    tempwed3[3] = 4;
                } else if (tempwed3[4] == 4) {
                    wed3.setBackgroundColor(Color.GRAY);
                    tempwed3[4] = 5;
                } else if (tempwed3[5] == 5) {
                    wed3.setBackgroundColor(Color.MAGENTA);
                    tempwed3[5] = 6;
                } else if (tempwed3[6] == 6) {
                    wed3.setBackgroundColor(Color.CYAN);
                    tempwed3[6] = 7;
                } else {
                    wed3.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempwed3[i] = i;
                    }
                }
            }
        });

        final int[] tempwed4= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button wed4 = (Button) findViewById(R.id.wed4);
        wed4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempwed4[0] == 0) {
                    wed4.setBackgroundColor(Color.RED);
                    tempwed4[0] = 1;
                } else if (tempwed4[1] == 1) {
                    wed4.setBackgroundColor(Color.YELLOW);
                    tempwed4[1] = 2;
                } else if (tempwed4[2] == 2) {
                    wed4.setBackgroundColor(Color.GREEN);
                    tempwed4[2] = 3;
                } else if (tempwed4[3] == 3) {
                    wed4.setBackgroundColor(Color.BLUE);
                    tempwed4[3] = 4;
                } else if (tempwed4[4] == 4) {
                    wed4.setBackgroundColor(Color.GRAY);
                    tempwed4[4] = 5;
                } else if (tempwed4[5] == 5) {
                    wed4.setBackgroundColor(Color.MAGENTA);
                    tempwed4[5] = 6;
                } else if (tempwed4[6] == 6) {
                    wed4.setBackgroundColor(Color.CYAN);
                    tempwed4[6] = 7;
                } else {
                    wed4.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempwed4[i] = i;
                    }
                }
            }
        });

        final int[] tempwed5= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button wed5 = (Button) findViewById(R.id.wed5);
        wed5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempwed5[0] == 0) {
                    wed5.setBackgroundColor(Color.RED);
                    tempwed5[0] = 1;
                } else if (tempwed5[1] == 1) {
                    wed5.setBackgroundColor(Color.YELLOW);
                    tempwed5[1] = 2;
                } else if (tempwed5[2] == 2) {
                    wed5.setBackgroundColor(Color.GREEN);
                    tempwed5[2] = 3;
                } else if (tempwed5[3] == 3) {
                    wed5.setBackgroundColor(Color.BLUE);
                    tempwed5[3] = 4;
                } else if (tempwed5[4] == 4) {
                    wed5.setBackgroundColor(Color.GRAY);
                    tempwed5[4] = 5;
                } else if (tempwed5[5] == 5) {
                    wed5.setBackgroundColor(Color.MAGENTA);
                    tempwed5[5] = 6;
                } else if (tempwed5[6] == 6) {
                    wed5.setBackgroundColor(Color.CYAN);
                    tempwed5[6] = 7;
                } else {
                    wed5.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempwed5[i] = i;
                    }
                }
            }
        });

        final int[] tempwed6= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button wed6 = (Button) findViewById(R.id.wed6);
        wed6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempwed6[0] == 0) {
                    wed6.setBackgroundColor(Color.RED);
                    tempwed6[0] = 1;
                } else if (tempwed6[1] == 1) {
                    wed6.setBackgroundColor(Color.YELLOW);
                    tempwed6[1] = 2;
                } else if (tempwed6[2] == 2) {
                    wed6.setBackgroundColor(Color.GREEN);
                    tempwed6[2] = 3;
                } else if (tempwed6[3] == 3) {
                    wed6.setBackgroundColor(Color.BLUE);
                    tempwed6[3] = 4;
                } else if (tempwed6[4] == 4) {
                    wed6.setBackgroundColor(Color.GRAY);
                    tempwed6[4] = 5;
                } else if (tempwed6[5] == 5) {
                    wed6.setBackgroundColor(Color.MAGENTA);
                    tempwed6[5] = 6;
                } else if (tempwed6[6] == 6) {
                    wed6.setBackgroundColor(Color.CYAN);
                    tempwed6[6] = 7;
                } else {
                    wed6.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempwed6[i] = i;
                    }
                }
            }
        });

        final int[] tempwed7= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button wed7 = (Button) findViewById(R.id.wed7);
        wed7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempwed7[0] == 0) {
                    wed7.setBackgroundColor(Color.RED);
                    tempwed7[0] = 1;
                } else if (tempwed7[1] == 1) {
                    wed7.setBackgroundColor(Color.YELLOW);
                    tempwed7[1] = 2;
                } else if (tempwed7[2] == 2) {
                    wed7.setBackgroundColor(Color.GREEN);
                    tempwed7[2] = 3;
                } else if (tempwed7[3] == 3) {
                    wed7.setBackgroundColor(Color.BLUE);
                    tempwed7[3] = 4;
                } else if (tempwed7[4] == 4) {
                    wed7.setBackgroundColor(Color.GRAY);
                    tempwed7[4] = 5;
                } else if (tempwed7[5] == 5) {
                    wed7.setBackgroundColor(Color.MAGENTA);
                    tempwed7[5] = 6;
                } else if (tempwed7[6] == 6) {
                    wed7.setBackgroundColor(Color.CYAN);
                    tempwed7[6] = 7;
                } else {
                    wed7.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempwed7[i] = i;
                    }
                }
            }
        });

        final int[] tempwed8= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button wed8 = (Button) findViewById(R.id.wed8);
        wed8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempwed8[0] == 0) {
                    wed8.setBackgroundColor(Color.RED);
                    tempwed8[0] = 1;
                } else if (tempwed8[1] == 1) {
                    wed8.setBackgroundColor(Color.YELLOW);
                    tempwed8[1] = 2;
                } else if (tempwed8[2] == 2) {
                    wed8.setBackgroundColor(Color.GREEN);
                    tempwed8[2] = 3;
                } else if (tempwed8[3] == 3) {
                    wed8.setBackgroundColor(Color.BLUE);
                    tempwed8[3] = 4;
                } else if (tempwed8[4] == 4) {
                    wed8.setBackgroundColor(Color.GRAY);
                    tempwed8[4] = 5;
                } else if (tempwed8[5] == 5) {
                    wed8.setBackgroundColor(Color.MAGENTA);
                    tempwed8[5] = 6;
                } else if (tempwed8[6] == 6) {
                    wed8.setBackgroundColor(Color.CYAN);
                    tempwed8[6] = 7;
                } else {
                    wed8.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempwed8[i] = i;
                    }
                }
            }
        });

        final int[] tempwed9= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button wed9 = (Button) findViewById(R.id.wed9);
        wed9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempwed9[0] == 0) {
                    wed9.setBackgroundColor(Color.RED);
                    tempwed9[0] = 1;
                } else if (tempwed9[1] == 1) {
                    wed9.setBackgroundColor(Color.YELLOW);
                    tempwed9[1] = 2;
                } else if (tempwed9[2] == 2) {
                    wed9.setBackgroundColor(Color.GREEN);
                    tempwed9[2] = 3;
                } else if (tempwed9[3] == 3) {
                    wed9.setBackgroundColor(Color.BLUE);
                    tempwed9[3] = 4;
                } else if (tempwed9[4] == 4) {
                    wed9.setBackgroundColor(Color.GRAY);
                    tempwed9[4] = 5;
                } else if (tempwed9[5] == 5) {
                    wed9.setBackgroundColor(Color.MAGENTA);
                    tempwed9[5] = 6;
                } else if (tempwed9[6] == 6) {
                    wed9.setBackgroundColor(Color.CYAN);
                    tempwed9[6] = 7;
                } else {
                    wed9.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempwed9[i] = i;
                    }
                }
            }
        });

        final int[] tempwed10= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button wed10 = (Button) findViewById(R.id.wed10);
        wed10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempwed10[0] == 0) {
                    wed10.setBackgroundColor(Color.RED);
                    tempwed10[0] = 1;
                } else if (tempwed10[1] == 1) {
                    wed10.setBackgroundColor(Color.YELLOW);
                    tempwed10[1] = 2;
                } else if (tempwed10[2] == 2) {
                    wed10.setBackgroundColor(Color.GREEN);
                    tempwed10[2] = 3;
                } else if (tempwed10[3] == 3) {
                    wed10.setBackgroundColor(Color.BLUE);
                    tempwed10[3] = 4;
                } else if (tempwed10[4] == 4) {
                    wed10.setBackgroundColor(Color.GRAY);
                    tempwed10[4] = 5;
                } else if (tempwed10[5] == 5) {
                    wed10.setBackgroundColor(Color.MAGENTA);
                    tempwed10[5] = 6;
                } else if (tempwed10[6] == 6) {
                    wed10.setBackgroundColor(Color.CYAN);
                    tempwed10[6] = 7;
                } else {
                    wed10.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempwed10[i] = i;
                    }
                }
            }
        });
        //목요일
        final int[] tempthu1= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button thu1 = (Button) findViewById(R.id.thu1);
        thu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempthu1[0] == 0) {
                    thu1.setBackgroundColor(Color.RED);
                    tempthu1[0] = 1;
                } else if (tempthu1[1] == 1) {
                    thu1.setBackgroundColor(Color.YELLOW);
                    tempthu1[1] = 2;
                } else if (tempthu1[2] == 2) {
                    thu1.setBackgroundColor(Color.GREEN);
                    tempthu1[2] = 3;
                } else if (tempthu1[3] == 3) {
                    thu1.setBackgroundColor(Color.BLUE);
                    tempthu1[3] = 4;
                } else if (tempthu1[4] == 4) {
                    thu1.setBackgroundColor(Color.GRAY);
                    tempthu1[4] = 5;
                } else if (tempthu1[5] == 5) {
                    thu1.setBackgroundColor(Color.MAGENTA);
                    tempthu1[5] = 6;
                } else if (tempthu1[6] == 6) {
                    thu1.setBackgroundColor(Color.CYAN);
                    tempthu1[6] = 7;
                } else {
                    thu1.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempthu1[i] = i;
                    }
                }
            }
        });

        final int[] tempthu2= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button thu2 = (Button) findViewById(R.id.thu2);
        thu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempthu2[0] == 0) {
                    thu2.setBackgroundColor(Color.RED);
                    tempthu2[0] = 1;
                } else if (tempthu2[1] == 1) {
                    thu2.setBackgroundColor(Color.YELLOW);
                    tempthu2[1] = 2;
                } else if (tempthu2[2] == 2) {
                    thu2.setBackgroundColor(Color.GREEN);
                    tempthu2[2] = 3;
                } else if (tempthu2[3] == 3) {
                    thu2.setBackgroundColor(Color.BLUE);
                    tempthu2[3] = 4;
                } else if (tempthu2[4] == 4) {
                    thu2.setBackgroundColor(Color.GRAY);
                    tempthu2[4] = 5;
                } else if (tempthu2[5] == 5) {
                    thu2.setBackgroundColor(Color.MAGENTA);
                    tempthu2[5] = 6;
                } else if (tempthu2[6] == 6) {
                    thu2.setBackgroundColor(Color.CYAN);
                    tempthu2[6] = 7;
                } else {
                    thu2.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempthu2[i] = i;
                    }
                }
            }
        });

        final int[] tempthu3= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button thu3 = (Button) findViewById(R.id.thu3);
        thu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempthu3[0] == 0) {
                    thu3.setBackgroundColor(Color.RED);
                    tempthu3[0] = 1;
                } else if (tempthu3[1] == 1) {
                    thu3.setBackgroundColor(Color.YELLOW);
                    tempthu3[1] = 2;
                } else if (tempthu3[2] == 2) {
                    thu3.setBackgroundColor(Color.GREEN);
                    tempthu3[2] = 3;
                } else if (tempthu3[3] == 3) {
                    thu3.setBackgroundColor(Color.BLUE);
                    tempthu3[3] = 4;
                } else if (tempthu3[4] == 4) {
                    thu3.setBackgroundColor(Color.GRAY);
                    tempthu3[4] = 5;
                } else if (tempthu3[5] == 5) {
                    thu3.setBackgroundColor(Color.MAGENTA);
                    tempthu3[5] = 6;
                } else if (tempthu3[6] == 6) {
                    thu3.setBackgroundColor(Color.CYAN);
                    tempthu3[6] = 7;
                } else {
                    thu3.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempthu3[i] = i;
                    }
                }
            }
        });

        final int[] tempthu4= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button thu4 = (Button) findViewById(R.id.thu4);
        thu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempthu4[0] == 0) {
                    thu4.setBackgroundColor(Color.RED);
                    tempthu4[0] = 1;
                } else if (tempthu4[1] == 1) {
                    thu4.setBackgroundColor(Color.YELLOW);
                    tempthu4[1] = 2;
                } else if (tempthu4[2] == 2) {
                    thu4.setBackgroundColor(Color.GREEN);
                    tempthu4[2] = 3;
                } else if (tempthu4[3] == 3) {
                    thu4.setBackgroundColor(Color.BLUE);
                    tempthu4[3] = 4;
                } else if (tempthu4[4] == 4) {
                    thu4.setBackgroundColor(Color.GRAY);
                    tempthu4[4] = 5;
                } else if (tempthu4[5] == 5) {
                    thu4.setBackgroundColor(Color.MAGENTA);
                    tempthu4[5] = 6;
                } else if (tempthu4[6] == 6) {
                    thu4.setBackgroundColor(Color.CYAN);
                    tempthu4[6] = 7;
                } else {
                    thu4.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempthu4[i] = i;
                    }
                }
            }
        });

        final int[] tempthu5= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button thu5 = (Button) findViewById(R.id.thu5);
        thu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempthu5[0] == 0) {
                    thu5.setBackgroundColor(Color.RED);
                    tempthu5[0] = 1;
                } else if (tempthu5[1] == 1) {
                    thu5.setBackgroundColor(Color.YELLOW);
                    tempthu5[1] = 2;
                } else if (tempthu5[2] == 2) {
                    thu5.setBackgroundColor(Color.GREEN);
                    tempthu5[2] = 3;
                } else if (tempthu5[3] == 3) {
                    thu5.setBackgroundColor(Color.BLUE);
                    tempthu5[3] = 4;
                } else if (tempthu5[4] == 4) {
                    thu5.setBackgroundColor(Color.GRAY);
                    tempthu5[4] = 5;
                } else if (tempthu5[5] == 5) {
                    thu5.setBackgroundColor(Color.MAGENTA);
                    tempthu5[5] = 6;
                } else if (tempthu5[6] == 6) {
                    thu5.setBackgroundColor(Color.CYAN);
                    tempthu5[6] = 7;
                } else {
                    thu5.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempthu5[i] = i;
                    }
                }
            }
        });

        final int[] tempthu6= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button thu6 = (Button) findViewById(R.id.thu6);
        thu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempthu6[0] == 0) {
                    thu6.setBackgroundColor(Color.RED);
                    tempthu6[0] = 1;
                } else if (tempthu6[1] == 1) {
                    thu6.setBackgroundColor(Color.YELLOW);
                    tempthu6[1] = 2;
                } else if (tempthu6[2] == 2) {
                    thu6.setBackgroundColor(Color.GREEN);
                    tempthu6[2] = 3;
                } else if (tempthu6[3] == 3) {
                    thu6.setBackgroundColor(Color.BLUE);
                    tempthu6[3] = 4;
                } else if (tempthu6[4] == 4) {
                    thu6.setBackgroundColor(Color.GRAY);
                    tempthu6[4] = 5;
                } else if (tempthu6[5] == 5) {
                    thu6.setBackgroundColor(Color.MAGENTA);
                    tempthu6[5] = 6;
                } else if (tempthu6[6] == 6) {
                    thu6.setBackgroundColor(Color.CYAN);
                    tempthu6[6] = 7;
                } else {
                    thu6.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempthu6[i] = i;
                    }
                }
            }
        });

        final int[] tempthu7= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button thu7 = (Button) findViewById(R.id.thu7);
        thu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempthu7[0] == 0) {
                    thu7.setBackgroundColor(Color.RED);
                    tempthu7[0] = 1;
                } else if (tempthu7[1] == 1) {
                    thu7.setBackgroundColor(Color.YELLOW);
                    tempthu7[1] = 2;
                } else if (tempthu7[2] == 2) {
                    thu7.setBackgroundColor(Color.GREEN);
                    tempthu7[2] = 3;
                } else if (tempthu7[3] == 3) {
                    thu7.setBackgroundColor(Color.BLUE);
                    tempthu7[3] = 4;
                } else if (tempthu7[4] == 4) {
                    thu7.setBackgroundColor(Color.GRAY);
                    tempthu7[4] = 5;
                } else if (tempthu7[5] == 5) {
                    thu7.setBackgroundColor(Color.MAGENTA);
                    tempthu7[5] = 6;
                } else if (tempthu7[6] == 6) {
                    thu7.setBackgroundColor(Color.CYAN);
                    tempthu7[6] = 7;
                } else {
                    thu7.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempthu7[i] = i;
                    }
                }
            }
        });
//금요일
        final int[] tempfri1= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button fri1 = (Button) findViewById(R.id.fri1);
        fri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempfri1[0] == 0) {
                    fri1.setBackgroundColor(Color.RED);
                    tempfri1[0] = 1;
                } else if (tempfri1[1] == 1) {
                    fri1.setBackgroundColor(Color.YELLOW);
                    tempfri1[1] = 2;
                } else if (tempfri1[2] == 2) {
                    fri1.setBackgroundColor(Color.GREEN);
                    tempfri1[2] = 3;
                } else if (tempfri1[3] == 3) {
                    fri1.setBackgroundColor(Color.BLUE);
                    tempfri1[3] = 4;
                } else if (tempfri1[4] == 4) {
                    fri1.setBackgroundColor(Color.GRAY);
                    tempfri1[4] = 5;
                } else if (tempfri1[5] == 5) {
                    fri1.setBackgroundColor(Color.MAGENTA);
                    tempfri1[5] = 6;
                } else if (tempfri1[6] == 6) {
                    fri1.setBackgroundColor(Color.CYAN);
                    tempfri1[6] = 7;
                } else {
                    fri1.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempfri1[i] = i;
                    }
                }
            }
        });
        final int[] tempfri2= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button fri2 = (Button) findViewById(R.id.fri2);
        fri2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempfri2[0] == 0) {
                    fri2.setBackgroundColor(Color.RED);
                    tempfri2[0] = 1;
                } else if (tempfri2[1] == 1) {
                    fri2.setBackgroundColor(Color.YELLOW);
                    tempfri2[1] = 2;
                } else if (tempfri2[2] == 2) {
                    fri2.setBackgroundColor(Color.GREEN);
                    tempfri2[2] = 3;
                } else if (tempfri2[3] == 3) {
                    fri2.setBackgroundColor(Color.BLUE);
                    tempfri2[3] = 4;
                } else if (tempfri2[4] == 4) {
                    fri2.setBackgroundColor(Color.GRAY);
                    tempfri2[4] = 5;
                } else if (tempfri2[5] == 5) {
                    fri2.setBackgroundColor(Color.MAGENTA);
                    tempfri2[5] = 6;
                } else if (tempfri2[6] == 6) {
                    fri2.setBackgroundColor(Color.CYAN);
                    tempfri2[6] = 7;
                } else {
                    fri2.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempfri2[i] = i;
                    }
                }
            }
        });

        final int[] tempfri3= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button fri3 = (Button) findViewById(R.id.fri3);
        fri3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempfri3[0] == 0) {
                    fri3.setBackgroundColor(Color.RED);
                    tempfri3[0] = 1;
                } else if (tempfri3[1] == 1) {
                    fri3.setBackgroundColor(Color.YELLOW);
                    tempfri3[1] = 2;
                } else if (tempfri3[2] == 2) {
                    fri3.setBackgroundColor(Color.GREEN);
                    tempfri3[2] = 3;
                } else if (tempfri3[3] == 3) {
                    fri3.setBackgroundColor(Color.BLUE);
                    tempfri3[3] = 4;
                } else if (tempfri3[4] == 4) {
                    fri3.setBackgroundColor(Color.GRAY);
                    tempfri3[4] = 5;
                } else if (tempfri3[5] == 5) {
                    fri3.setBackgroundColor(Color.MAGENTA);
                    tempfri3[5] = 6;
                } else if (tempfri3[6] == 6) {
                    fri3.setBackgroundColor(Color.CYAN);
                    tempfri3[6] = 7;
                } else {
                    fri3.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempfri3[i] = i;
                    }
                }
            }
        });

        final int[] tempfri4= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button fri4 = (Button) findViewById(R.id.fri4);
        fri4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempfri4[0] == 0) {
                    fri4.setBackgroundColor(Color.RED);
                    tempfri4[0] = 1;
                } else if (tempfri4[1] == 1) {
                    fri4.setBackgroundColor(Color.YELLOW);
                    tempfri4[1] = 2;
                } else if (tempfri4[2] == 2) {
                    fri4.setBackgroundColor(Color.GREEN);
                    tempfri4[2] = 3;
                } else if (tempfri4[3] == 3) {
                    fri4.setBackgroundColor(Color.BLUE);
                    tempfri4[3] = 4;
                } else if (tempfri4[4] == 4) {
                    fri4.setBackgroundColor(Color.GRAY);
                    tempfri4[4] = 5;
                } else if (tempfri4[5] == 5) {
                    fri4.setBackgroundColor(Color.MAGENTA);
                    tempfri4[5] = 6;
                } else if (tempfri4[6] == 6) {
                    fri4.setBackgroundColor(Color.CYAN);
                    tempfri4[6] = 7;
                } else {
                    fri4.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempfri4[i] = i;
                    }
                }
            }
        });
        final int[] tempfri5= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button fri5 = (Button) findViewById(R.id.fri5);
        fri5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempfri5[0] == 0) {
                    fri5.setBackgroundColor(Color.RED);
                    tempfri5[0] = 1;
                } else if (tempfri5[1] == 1) {
                    fri5.setBackgroundColor(Color.YELLOW);
                    tempfri5[1] = 2;
                } else if (tempfri5[2] == 2) {
                    fri5.setBackgroundColor(Color.GREEN);
                    tempfri5[2] = 3;
                } else if (tempfri5[3] == 3) {
                    fri5.setBackgroundColor(Color.BLUE);
                    tempfri5[3] = 4;
                } else if (tempfri5[4] == 4) {
                    fri5.setBackgroundColor(Color.GRAY);
                    tempfri5[4] = 5;
                } else if (tempfri5[5] == 5) {
                    fri5.setBackgroundColor(Color.MAGENTA);
                    tempfri5[5] = 6;
                } else if (tempfri5[6] == 6) {
                    fri5.setBackgroundColor(Color.CYAN);
                    tempfri5[6] = 7;
                } else {
                    fri5.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempfri5[i] = i;
                    }
                }
            }
        });
        final int[] tempfri6= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button fri6 = (Button) findViewById(R.id.fri6);
        fri6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempfri6[0] == 0) {
                    fri6.setBackgroundColor(Color.RED);
                    tempfri6[0] = 1;
                } else if (tempfri6[1] == 1) {
                    fri6.setBackgroundColor(Color.YELLOW);
                    tempfri6[1] = 2;
                } else if (tempfri6[2] == 2) {
                    fri6.setBackgroundColor(Color.GREEN);
                    tempfri6[2] = 3;
                } else if (tempfri6[3] == 3) {
                    fri6.setBackgroundColor(Color.BLUE);
                    tempfri6[3] = 4;
                } else if (tempfri6[4] == 4) {
                    fri6.setBackgroundColor(Color.GRAY);
                    tempfri6[4] = 5;
                } else if (tempfri6[5] == 5) {
                    fri6.setBackgroundColor(Color.MAGENTA);
                    tempfri6[5] = 6;
                } else if (tempfri6[6] == 6) {
                    fri6.setBackgroundColor(Color.CYAN);
                    tempfri6[6] = 7;
                } else {
                    fri6.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempfri6[i] = i;
                    }
                }
            }
        });
        final int[] tempfri7= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button fri7 = (Button) findViewById(R.id.fri7);
        fri7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempfri7[0] == 0) {
                    fri7.setBackgroundColor(Color.RED);
                    tempfri7[0] = 1;
                } else if (tempfri7[1] == 1) {
                    fri7.setBackgroundColor(Color.YELLOW);
                    tempfri7[1] = 2;
                } else if (tempfri7[2] == 2) {
                    fri7.setBackgroundColor(Color.GREEN);
                    tempfri7[2] = 3;
                } else if (tempfri7[3] == 3) {
                    fri7.setBackgroundColor(Color.BLUE);
                    tempfri7[3] = 4;
                } else if (tempfri7[4] == 4) {
                    fri7.setBackgroundColor(Color.GRAY);
                    tempfri7[4] = 5;
                } else if (tempfri7[5] == 5) {
                    fri7.setBackgroundColor(Color.MAGENTA);
                    tempfri7[5] = 6;
                } else if (tempfri7[6] == 6) {
                    fri7.setBackgroundColor(Color.CYAN);
                    tempfri7[6] = 7;
                } else {
                    fri7.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempfri7[i] = i;
                    }
                }
            }
        });
        final int[] tempfri8= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button fri8 = (Button) findViewById(R.id.fri8);
        fri8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempfri8[0] == 0) {
                    fri8.setBackgroundColor(Color.RED);
                    tempfri8[0] = 1;
                } else if (tempfri8[1] == 1) {
                    fri8.setBackgroundColor(Color.YELLOW);
                    tempfri8[1] = 2;
                } else if (tempfri8[2] == 2) {
                    fri8.setBackgroundColor(Color.GREEN);
                    tempfri8[2] = 3;
                } else if (tempfri8[3] == 3) {
                    fri8.setBackgroundColor(Color.BLUE);
                    tempfri8[3] = 4;
                } else if (tempfri8[4] == 4) {
                    fri8.setBackgroundColor(Color.GRAY);
                    tempfri8[4] = 5;
                } else if (tempfri8[5] == 5) {
                    fri8.setBackgroundColor(Color.MAGENTA);
                    tempfri8[5] = 6;
                } else if (tempfri8[6] == 6) {
                    fri8.setBackgroundColor(Color.CYAN);
                    tempfri8[6] = 7;
                } else {
                    fri8.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempfri8[i] = i;
                    }
                }
            }
        });
        final int[] tempfri9= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button fri9 = (Button) findViewById(R.id.fri9);
        fri9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempfri9[0] == 0) {
                    fri9.setBackgroundColor(Color.RED);
                    tempfri9[0] = 1;
                } else if (tempfri9[1] == 1) {
                    fri9.setBackgroundColor(Color.YELLOW);
                    tempfri9[1] = 2;
                } else if (tempfri9[2] == 2) {
                    fri9.setBackgroundColor(Color.GREEN);
                    tempfri9[2] = 3;
                } else if (tempfri9[3] == 3) {
                    fri9.setBackgroundColor(Color.BLUE);
                    tempfri9[3] = 4;
                } else if (tempfri9[4] == 4) {
                    fri9.setBackgroundColor(Color.GRAY);
                    tempfri9[4] = 5;
                } else if (tempfri9[5] == 5) {
                    fri9.setBackgroundColor(Color.MAGENTA);
                    tempfri9[5] = 6;
                } else if (tempfri9[6] == 6) {
                    fri9.setBackgroundColor(Color.CYAN);
                    tempfri9[6] = 7;
                } else {
                    fri9.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempfri9[i] = i;
                    }
                }
            }
        });
        final int[] tempfri10= {0, 1, 2, 3, 4, 5, 6, 7};
        final Button fri10 = (Button) findViewById(R.id.fri10);
        fri10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempfri10[0] == 0) {
                    fri10.setBackgroundColor(Color.RED);
                    tempfri10[0] = 1;
                } else if (tempfri10[1] == 1) {
                    fri10.setBackgroundColor(Color.YELLOW);
                    tempfri10[1] = 2;
                } else if (tempfri10[2] == 2) {
                    fri10.setBackgroundColor(Color.GREEN);
                    tempfri10[2] = 3;
                } else if (tempfri10[3] == 3) {
                    fri10.setBackgroundColor(Color.BLUE);
                    tempfri10[3] = 4;
                } else if (tempfri10[4] == 4) {
                    fri10.setBackgroundColor(Color.GRAY);
                    tempfri10[4] = 5;
                } else if (tempfri10[5] == 5) {
                    fri10.setBackgroundColor(Color.MAGENTA);
                    tempfri10[5] = 6;
                } else if (tempfri10[6] == 6) {
                    fri10.setBackgroundColor(Color.CYAN);
                    tempfri10[6] = 7;
                } else {
                    fri10.setBackgroundColor(Color.WHITE);
                    for (int i = 0; i <= 7; i++) {
                        tempfri10[i] = i;
                    }
                }
            }
        });
        //끝
    }
}
