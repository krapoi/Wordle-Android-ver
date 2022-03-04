package com.example.code;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Editable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Vibrator vibrator;
    public String O = "truck";

    public static int count = 1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);


        EditText e = findViewById(R.id.Enter);

        TextView Empty1 = findViewById(R.id.Empty1);
        TextView Empty2 = findViewById(R.id.Empty2);
        TextView Empty3 = findViewById(R.id.Empty3);
        TextView Empty4 = findViewById(R.id.Empty4);
        TextView Empty5 = findViewById(R.id.Empty5);

        LinearLayout linearLayout = findViewById(R.id.linear2);
        LinearLayout linearLayout1 = findViewById(R.id.linear3);
        LinearLayout linearLayout2 = findViewById(R.id.linear4);
        LinearLayout linearLayout3 = findViewById(R.id.linear5);

        e.setOnKeyListener(new View.OnKeyListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                switch (i){
                    case KeyEvent.KEYCODE_ENTER:
                        Editable l = e.getText();
                        int size = l.length() - 1;
                        size++;
                        System.out.println("입력전 카운트 : " + count);
                        if(size != 5){
                            vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                            vibrator.vibrate(1000);
                            Toast t = Toast.makeText(getApplicationContext(),"5글자만 입력해 주십시오.", Toast.LENGTH_LONG);
                            t.show();
                            System.out.println(size);
                            e.setText("");
                        }
                        else{
                            String answer = l.toString();
                            char[] answerchar = answer.toCharArray();
                            char[] Ochar = O.toCharArray();
                            if(count == 1) {
                                System.out.println(answer);
                                e.setText("");

                                //gray
                                for (int j = 0; j < 5; j++) {
                                    String s = String.valueOf(answerchar[j]);
                                    if (!O.contains(s)) {
                                        if (j == 0) {
                                            Empty1.setBackgroundColor(Color.parseColor("#808080"));
                                            Empty1.setText(s);
                                        } else if (j == 1) {
                                            Empty2.setBackgroundColor(Color.parseColor("#808080"));
                                            Empty2.setText(s);
                                        } else if (j == 2) {
                                            Empty3.setBackgroundColor(Color.parseColor("#808080"));
                                            Empty3.setText(s);
                                        } else if (j == 3) {
                                            Empty4.setBackgroundColor(Color.parseColor("#808080"));
                                            Empty4.setText(s);
                                        } else {
                                            Empty5.setBackgroundColor(Color.parseColor("#808080"));
                                            Empty5.setText(s);
                                        }
                                    }
                                }

                                //yellow
                                for (int j = 0; j < 5; j++) {
                                    if (answerchar[0] == Ochar[j] || answerchar[0] - 'A' == Ochar[j]) {
                                        Empty1.setBackgroundColor(Color.parseColor("#FFFF00"));
                                        String s = String.valueOf(answerchar[0]);
                                        Empty1.setText(s);

                                    }
                                    if (answerchar[1] == Ochar[j] || answerchar[1] - 'A' == Ochar[j]) {
                                        Empty2.setBackgroundColor(Color.parseColor("#FFFF00"));
                                        String s = String.valueOf(answerchar[1]);
                                        Empty2.setText(s);


                                    }
                                    if (answerchar[2] == Ochar[j] || answerchar[2] - 'A' == Ochar[j]) {
                                        Empty3.setBackgroundColor(Color.parseColor("#FFFF00"));
                                        String s = String.valueOf(answerchar[2]);
                                        Empty3.setText(s);


                                    }
                                    if (answerchar[3] == Ochar[j] || answerchar[3] - 'A' == Ochar[j]) {
                                        Empty4.setBackgroundColor(Color.parseColor("#FFFF00"));
                                        String s = String.valueOf(answerchar[3]);
                                        Empty4.setText(s);

                                    }
                                    if (answerchar[4] == Ochar[j] || answerchar[4] - 'A' == Ochar[j]) {
                                        Empty5.setBackgroundColor(Color.parseColor("#FFFF00"));
                                        String s = String.valueOf(answerchar[4]);
                                        Empty5.setText(s);


                                    }
                                }

                                //Green
                                if (answerchar[0] == Ochar[0] || answerchar[0] - 'A' == Ochar[0]) {
                                    Empty1.setBackgroundColor(Color.parseColor("#7CFC00"));
                                    String s = String.valueOf(answerchar[0]);
                                    Empty1.setText(s);


                                }
                                if (answerchar[1] == Ochar[1] || answerchar[1] - 'A' == Ochar[1]) {
                                    Empty2.setBackgroundColor(Color.parseColor("#7CFC00"));
                                    String s = String.valueOf(answerchar[1]);
                                    Empty2.setText(s);

                                }
                                if (answerchar[2] == Ochar[2] || answerchar[2] - 'A' == Ochar[2]) {
                                    Empty3.setBackgroundColor(Color.parseColor("#7CFC00"));
                                    String s = String.valueOf(answerchar[2]);
                                    Empty3.setText(s);

                                }
                                if (answerchar[3] == Ochar[3] || answerchar[3] - 'A' == Ochar[3]) {
                                    Empty4.setBackgroundColor(Color.parseColor("#7CFC00"));
                                    String s = String.valueOf(answerchar[3]);
                                    Empty4.setText(s);

                                }
                                if (answerchar[4] == Ochar[4] || answerchar[4] - 'A' == Ochar[4]) {
                                    Empty5.setBackgroundColor(Color.parseColor("#7CFC00"));
                                    String s = String.valueOf(answerchar[4]);
                                    Empty5.setText(s);

                                }
                                System.out.println("첫번쨰 입력 카운트 : " + count);
                                count++;
                            }else if(count == 2){
                                e.setText("");
                                System.out.println(answer);
                                for(int j = 0; j < 5; j++){
                                    String s = String.valueOf(answerchar[j]);
                                    TextView textView = MakeTextView(s,71,300,Ochar,j);
                                    linearLayout.addView(textView);
                                }
                                count++;
                            }else if(count == 3){
                                e.setText("");
                                System.out.println(answer);
                                for(int j = 0; j < 5; j++){
                                    String s = String.valueOf(answerchar[j]);
                                    TextView textView = MakeTextView(s,71,60,Ochar,j);
                                    linearLayout1.addView(textView);
                                }
                                count++;
                            }else if(count == 4){
                                e.setText("");
                                System.out.println(answer);
                                for(int j = 0; j < 5; j++){
                                    String s = String.valueOf(answerchar[j]);
                                    TextView textView = MakeTextView(s,71,60,Ochar,j);
                                    linearLayout2.addView(textView);
                                }
                                count++;
                            }else if (count == 5){
                                e.setText("");
                                System.out.println(answer);
                                for(int j = 0; j < 5; j++){
                                    String s = String.valueOf(answerchar[j]);
                                    TextView textView = MakeTextView(s,71,60,Ochar,j);
                                    linearLayout3.addView(textView);
                                }
                                count++;
                            }else if(count == 6){
                                e.setText("");
                                if(answer.equals(O)){
                                    System.out.println("성공");
                                }else {
                                    System.out.println("실패");
                                }
                            }


                        }
                break;
                }
                return true;
            }
        });
    }

    public TextView MakeTextView(String Text,int leftmargin, int topmargin, char[] Oe,int texttrans){
        TextView t1 = new TextView(getApplicationContext());

        t1.setText(Text);
        t1.setWidth(130);
        t1.setHeight(130);
        t1.setGravity(Gravity.CENTER_VERTICAL| Gravity.CENTER_HORIZONTAL);
        t1.setTextSize(30);
        t1.setTypeface(null, Typeface.BOLD);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(leftmargin,topmargin,0,0);
        t1.setLayoutParams(params);
        t1.setBackgroundResource(R.drawable.background);

        ChangeColorgray(t1,Text);
        ChangeColoryellow(t1,Text,Oe);
        ChangeColorgreen(t1,Text,Oe,texttrans);

        return t1;
    }

    public boolean ChangeColorgray(TextView textView, String Text){
        if (!O.contains(Text)){
            textView.setBackgroundColor(Color.parseColor("#808080"));
            return true;
        }
        return false;
    }


    public boolean ChangeColoryellow(TextView textView,String text, char[] Oe){
        char T = text.charAt(0);
        if (O.contains(text)) {
            for (int j = 0; j < 5; j++)
                if (T != Oe[j]) {
                    textView.setBackgroundColor(Color.parseColor("#FFFF00"));
                    return true;
                }
        }
        return false;
    }

    public boolean ChangeColorgreen(TextView textView, String text,char[] Oe,int angker){
        char T = text.charAt(0);
        if(T == Oe[angker]){
            textView.setBackgroundColor(Color.parseColor("#7CFC00"));
            return true;
        }
        return false;
    }

    public void ChangeSuccessActivity(){

    }
}
