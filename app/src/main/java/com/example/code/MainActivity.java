package com.example.code;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Vibrator vibrator;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String O = "truck";

        EditText e = findViewById(R.id.Enter);

        TextView Empty1 = findViewById(R.id.Empty1);
        TextView Empty2 = findViewById(R.id.Empty2);
        TextView Empty3 = findViewById(R.id.Empty3);
        TextView Empty4 = findViewById(R.id.Empty4);
        TextView Empty5 = findViewById(R.id.Empty5);


        e.setOnKeyListener(new View.OnKeyListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                switch (i){
                    case KeyEvent.KEYCODE_ENTER:
                        Editable l = e.getText();
                        int size = l.length() - 1;
                        size++;
                        if(size != 5){
                            vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                            vibrator.vibrate(1000);
                            Toast t = Toast.makeText(getApplicationContext(),"5글자만 입력해 주십시오.", Toast.LENGTH_LONG);
                            t.show();
                            System.out.println(size);
                            e.setText("");
                        }else{
                           String answer = l.toString();
                           char[] answerchar = answer.toCharArray();
                           char[] Ochar = O.toCharArray();

                            System.out.println(answer);
                           e.setText("");

                            //gray

                            for(int j = 0; j < 5; j ++){
                                String s = String.valueOf(answerchar[j]);
                                if(!O.contains(s)){
                                    if(j == 0){
                                        Empty1.setBackgroundColor(Color.parseColor("#808080"));
                                        Empty1.setText(s);
                                    }else if(j == 1){
                                        Empty2.setBackgroundColor(Color.parseColor("#808080"));
                                        Empty2.setText(s);
                                    }else if(j == 2){
                                        Empty3.setBackgroundColor(Color.parseColor("#808080"));
                                        Empty3.setText(s);
                                    }else if(j == 3){
                                        Empty4.setBackgroundColor(Color.parseColor("#808080"));
                                        Empty4.setText(s);
                                    }else if(j == 4){
                                        Empty5.setBackgroundColor(Color.parseColor("#808080"));
                                        Empty5.setText(s);
                                    }
                                }
                            }



                           //yellow
                           for(int j = 0; j < 5; j++){
                               if(answerchar[0] == Ochar[j] || answerchar[0] - 'A' == Ochar[j]) {
                                   Empty1.setBackgroundColor(Color.parseColor("#FFFF00"));
                                   String s = String.valueOf(answerchar[0]);
                                   Empty1.setText(s);

                               }
                               if(answerchar[1] == Ochar[j] || answerchar[1] - 'A' == Ochar[j]) {
                                   Empty2.setBackgroundColor(Color.parseColor("#FFFF00"));
                                   String s = String.valueOf(answerchar[1]);
                                   Empty2.setText(s);


                               }
                               if(answerchar[2] == Ochar[j] || answerchar[2] - 'A' == Ochar[j]) {
                                   Empty3.setBackgroundColor(Color.parseColor("#FFFF00"));
                                   String s = String.valueOf(answerchar[2]);
                                   Empty3.setText(s);


                               }
                               if(answerchar[3] == Ochar[j] || answerchar[3] - 'A' == Ochar[j]) {
                                   Empty4.setBackgroundColor(Color.parseColor("#FFFF00"));
                                   String s = String.valueOf(answerchar[3]);
                                   Empty4.setText(s);

                               }
                               if(answerchar[4] == Ochar[j] || answerchar[4] - 'A' == Ochar[j]) {
                                   Empty5.setBackgroundColor(Color.parseColor("#FFFF00"));
                                   String s = String.valueOf(answerchar[4]);
                                   Empty5.setText(s);


                               }
                           }

                           //Green
                            if(answerchar[0] == Ochar[0] || answerchar[0] - 'A' == Ochar[0]) {
                                Empty1.setBackgroundColor(Color.parseColor("#7CFC00"));
                                String s = String.valueOf(answerchar[0]);
                                Empty1.setText(s);


                            }
                            if(answerchar[1] == Ochar[1] || answerchar[1] - 'A' == Ochar[1]) {
                                Empty2.setBackgroundColor(Color.parseColor("#7CFC00"));
                                String s = String.valueOf(answerchar[1]);
                                Empty2.setText(s);

                            }
                            if(answerchar[2] == Ochar[2] || answerchar[2] - 'A' == Ochar[2]) {
                                Empty3.setBackgroundColor(Color.parseColor("#7CFC00"));
                                String s = String.valueOf(answerchar[2]);
                                Empty3.setText(s);

                            }
                            if(answerchar[3] == Ochar[3] || answerchar[3] - 'A' == Ochar[3]) {
                                Empty4.setBackgroundColor(Color.parseColor("#7CFC00"));
                                String s = String.valueOf(answerchar[3]);
                                Empty4.setText(s);

                            }
                            if(answerchar[4] == Ochar[4] || answerchar[4] - 'A' == Ochar[4]) {
                                Empty5.setBackgroundColor(Color.parseColor("#7CFC00"));
                                String s = String.valueOf(answerchar[4]);
                                Empty5.setText(s);

                            }



                        }
                break;
                }
                return true;
            }
        });
    }
}
