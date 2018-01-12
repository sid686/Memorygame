package com.memorygame.siddharthsharma.memorygame;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class Main5Activity extends AppCompatActivity {

    TextView tv_p1,tv_p2;
    ImageView iv_11,iv_12,iv_13,iv_14,iv_15,iv_16,iv_17,iv_18,iv_19,iv_20,iv_21,iv_22;

    int img101,img102,img103,img104,img105,img106,img201,img202,img203,img204,img205,img206;

    int firstcard,secondcard;
    int clickedfirst,clickedsecond;
    int cardnumver=1;
    int turn=1;
    int playerpoints=0,cpupoints=0;

    Integer[] cardsarray ={101,102,103,104,105,106,201,202,203,204,205,206};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        tv_p1=(TextView)findViewById(R.id.tv_p1 );
        tv_p2=(TextView)findViewById(R.id.tv_p2 );
        iv_11=(ImageView)findViewById(R.id.iv_11);
        iv_12=(ImageView)findViewById(R.id.iv_12);
        iv_13=(ImageView)findViewById(R.id.iv_13);
        iv_14=(ImageView)findViewById(R.id.iv_14);
        iv_15=(ImageView)findViewById(R.id.iv_15);
        iv_16=(ImageView)findViewById(R.id.iv_16);
        iv_17=(ImageView)findViewById(R.id.iv_17);
        iv_18=(ImageView)findViewById(R.id.iv_18);
        iv_19=(ImageView)findViewById(R.id.iv_19);
        iv_20=(ImageView)findViewById(R.id.iv_20);
        iv_21=(ImageView)findViewById(R.id.iv_21);
        iv_22=(ImageView)findViewById(R.id.iv_22);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_15.setTag("4");
        iv_16.setTag("5");
        iv_17.setTag("6");
        iv_18.setTag("7");
        iv_19.setTag("8");
        iv_20.setTag("9");
        iv_21.setTag("10");
        iv_22.setTag("11");

        frontofcardofResources();

        Collections.shuffle(Arrays.asList(cardsarray));
        tv_p2.setTextColor(Color.GRAY);

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_11,thecard);

            }
        });
        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_12,thecard);

            }
        });
        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_13,thecard);

            }
        });
        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_14,thecard);

            }
        });
        iv_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_15,thecard);

            }
        });
        iv_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_16,thecard);

            }
        });
        iv_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_17,thecard);

            }
        });
        iv_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_18,thecard);

            }
        });
        iv_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_19,thecard);

            }
        });
        iv_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_20,thecard);

            }
        });
        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_21,thecard);

            }
        });
        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_22,thecard);

            }
        });
        tv_p2.setVisibility(View.INVISIBLE);

    }
    private void dostuff(ImageView iv, int card ){
        if(cardsarray[card]==101){
            iv.setImageResource(img101);
        }else if(cardsarray[card]==102){
            iv.setImageResource(img102);
        }else if(cardsarray[card]==103){
            iv.setImageResource(img103);
        }else if(cardsarray[card]==104){
            iv.setImageResource(img104);
        }else if(cardsarray[card]==105){
            iv.setImageResource(img105);
        }else if(cardsarray[card]==106){
            iv.setImageResource(img106);
        }else if(cardsarray[card]==201){
            iv.setImageResource(img201);
        }else if(cardsarray[card]==202){
            iv.setImageResource(img202);
        }else if(cardsarray[card]==203){
            iv.setImageResource(img203);
        }else if(cardsarray[card]==204){
            iv.setImageResource(img204);
        }else if(cardsarray[card]==205){
            iv.setImageResource(img205);
        }else if(cardsarray[card]==206){
            iv.setImageResource(img206);
        }
        if (cardnumver==1){
            firstcard=cardsarray[card];
            if (firstcard>200){
                firstcard=firstcard-100;
            }
            cardnumver=2;
            clickedfirst=card;
            iv.setEnabled(false);

        }else if (cardnumver==2){
            secondcard=cardsarray[card];
            if (secondcard>200){
                secondcard=secondcard-100;
            }
            cardnumver=1;
            clickedsecond=card;
            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_15.setEnabled(false);
            iv_16.setEnabled(false);
            iv_17.setEnabled(false);
            iv_18.setEnabled(false);
            iv_19.setEnabled(false);
            iv_20.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);

            Handler handler =new Handler();
            handler.postDelayed(new Runnable(){
                @Override
                public void run(){
                    calculate();
                }
            },1000);


        }
    }
    private void calculate(){
        if (firstcard==secondcard){
            if (clickedfirst==0){
                iv_11.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==1){
                iv_12.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==2){
                iv_13.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==3){
                iv_14.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==4){
                iv_15.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==5){
                iv_16.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==6){
                iv_17.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==7){
                iv_18.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==8){
                iv_19.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==9){
                iv_20.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==10){
                iv_21.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==11){
                iv_22.setVisibility(View.INVISIBLE);
            }
            if (clickedsecond==0){
                iv_11.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==1){
                iv_12.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==2){
                iv_13.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==3){
                iv_14.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==4){
                iv_15.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==5){
                iv_16.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==6){
                iv_17.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==7){
                iv_18.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==8){
                iv_19.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==9){
                iv_20.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==10){
                iv_21.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==11){
                iv_22.setVisibility(View.INVISIBLE);
            }

            if (turn==1){
                playerpoints++;
                tv_p1.setText("Score:"+playerpoints );
            }else if (turn==2){
                playerpoints++;
                tv_p1.setText("Score:"+playerpoints );
            }

        } else {
            iv_11.setImageResource(R.drawable.sm1);
            iv_12.setImageResource(R.drawable.sm1);
            iv_13.setImageResource(R.drawable.sm1);
            iv_14.setImageResource(R.drawable.sm1);
            iv_15.setImageResource(R.drawable.sm1);
            iv_16.setImageResource(R.drawable.sm1);
            iv_17.setImageResource(R.drawable.sm1);
            iv_18.setImageResource(R.drawable.sm1);
            iv_19.setImageResource(R.drawable.sm1);
            iv_20.setImageResource(R.drawable.sm1);
            iv_21.setImageResource(R.drawable.sm1);
            iv_22.setImageResource(R.drawable.sm1);

            if (turn==1){
                turn=2;
                tv_p1.setTextColor(Color.BLACK);
                tv_p2.setTextColor(Color.BLACK);
            }else if (turn==2){
                turn=1;
                tv_p2.setTextColor(Color.GRAY);
                tv_p1.setTextColor(Color.BLACK);
            }
        }
        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_15.setEnabled(true);
        iv_16.setEnabled(true);
        iv_17.setEnabled(true);
        iv_18.setEnabled(true);
        iv_19.setEnabled(true);
        iv_20.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);

        checkEnd();

    }

    private void checkEnd(){
        if (iv_11.getVisibility()==View.INVISIBLE&&
                iv_12.getVisibility()==View.INVISIBLE&&
                iv_13.getVisibility()==View.INVISIBLE&&
                iv_14.getVisibility()==View.INVISIBLE&&
                iv_15.getVisibility()==View.INVISIBLE&&
                iv_16.getVisibility()==View.INVISIBLE&&
                iv_17.getVisibility()==View.INVISIBLE&&
                iv_18.getVisibility()==View.INVISIBLE&&
                iv_19.getVisibility()==View.INVISIBLE&&
                iv_20.getVisibility()==View.INVISIBLE&&
                iv_21.getVisibility()==View.INVISIBLE&&
                iv_22.getVisibility()==View.INVISIBLE){

            AlertDialog.Builder alertDilogBuilder=new AlertDialog.Builder(Main5Activity.this);
            alertDilogBuilder.setMessage("Gameover\nScore:"+playerpoints)
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent= new Intent(getApplicationContext(),Main5Activity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    })
            ;
            AlertDialog alertDialog=alertDilogBuilder.create();
            alertDialog.show();

        }

    }
    private void frontofcardofResources(){
        img101=R.drawable.animals_1;
        img102=R.drawable.animals_2;
        img103=R.drawable.animals_3;
        img104=R.drawable.animals_4;
        img105=R.drawable.animals_5;
        img106=R.drawable.animals_6;
        img201=R.drawable.animals_7;
        img202=R.drawable.animals_8;
        img203=R.drawable.animals_9;
        img204=R.drawable.animals_10;
        img205=R.drawable.animals_11;
        img206=R.drawable.animals_12;
    }
}
