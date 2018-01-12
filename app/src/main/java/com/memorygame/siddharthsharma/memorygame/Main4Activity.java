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

public class Main4Activity extends AppCompatActivity {
    TextView tv_p1,tv_p2;
    ImageView iv_11,iv_12,iv_13,iv_14,iv_21,iv_22,iv_23,iv_24,iv_31,iv_32,iv_33,iv_34,iv_41,iv_42,iv_43,iv_44,iv_51,iv_52,iv_53,iv_54,iv_61,iv_62,iv_63,iv_64;

    int img101,img102,img103,img104,img105,img106,img107,img108,img109,img110,img111,img112,img201,img202,img203,img204,img205,img206,img207,img208,img209,img210,img211,img212;

    int firstcard,secondcard;
    int clickedfirst,clickedsecond;
    int cardnumver=1;
    int turn=1;
    int playerpoints=0,cpupoints=0;

    Integer[] cardsarray ={101,102,103,104,105,106,107,108,109,110,111,112,201,202,203,204,205,206,207,208,209,210,211,212};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        tv_p1=(TextView)findViewById(R.id.tv_p1 );
        tv_p2=(TextView)findViewById(R.id.tv_p2 );
        iv_11=(ImageView)findViewById(R.id.iv_11);
        iv_12=(ImageView)findViewById(R.id.iv_12);
        iv_13=(ImageView)findViewById(R.id.iv_13);
        iv_14=(ImageView)findViewById(R.id.iv_14);
        iv_21=(ImageView)findViewById(R.id.iv_21);
        iv_22=(ImageView)findViewById(R.id.iv_22);
        iv_23=(ImageView)findViewById(R.id.iv_23);
        iv_24=(ImageView)findViewById(R.id.iv_24);
        iv_31=(ImageView)findViewById(R.id.iv_31);
        iv_32=(ImageView)findViewById(R.id.iv_32);
        iv_33=(ImageView)findViewById(R.id.iv_33);
        iv_34=(ImageView)findViewById(R.id.iv_34);
        iv_41=(ImageView)findViewById(R.id.iv_41);
        iv_42=(ImageView)findViewById(R.id.iv_42);
        iv_43=(ImageView)findViewById(R.id.iv_43);
        iv_44=(ImageView)findViewById(R.id.iv_44);
        iv_51=(ImageView)findViewById(R.id.iv_51);
        iv_52=(ImageView)findViewById(R.id.iv_52);
        iv_53=(ImageView)findViewById(R.id.iv_53);
        iv_54=(ImageView)findViewById(R.id.iv_54);
        iv_61=(ImageView)findViewById(R.id.iv_61);
        iv_62=(ImageView)findViewById(R.id.iv_62);
        iv_63=(ImageView)findViewById(R.id.iv_63);
        iv_64=(ImageView)findViewById(R.id.iv_64);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");
        iv_41.setTag("12");
        iv_42.setTag("13");
        iv_43.setTag("14");
        iv_44.setTag("15");
        iv_51.setTag("16");
        iv_52.setTag("17");
        iv_53.setTag("18");
        iv_54.setTag("19");
        iv_61.setTag("20");
        iv_62.setTag("21");
        iv_63.setTag("22");
        iv_64.setTag("23");





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
        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_23,thecard);

            }
        });
        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_24,thecard);

            }
        });
        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_31,thecard);

            }
        });
        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_32,thecard);

            }
        });
        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_33,thecard);

            }
        });
        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_34,thecard);

            }
        });
        iv_41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_41,thecard);

            }
        });
        iv_42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_42,thecard);

            }
        });
        iv_43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_43,thecard);

            }
        });
        iv_44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_44,thecard);

            }
        });
        iv_51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_51,thecard);

            }
        });
        iv_52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_52,thecard);

            }
        });
        iv_53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_53,thecard);

            }
        });
        iv_54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_54,thecard);

            }
        });
        iv_61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_61,thecard);

            }
        });
        iv_62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_62,thecard);

            }
        });
        iv_63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_63,thecard);

            }
        });
        iv_64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard=Integer.parseInt((String) view.getTag());
                dostuff(iv_64,thecard);

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
        }else if(cardsarray[card]==107){
            iv.setImageResource(img107);
        }else if(cardsarray[card]==108){
            iv.setImageResource(img108);
        }else if(cardsarray[card]==109){
            iv.setImageResource(img109);
        }else if(cardsarray[card]==110){
            iv.setImageResource(img110);
        }else if(cardsarray[card]==111){
            iv.setImageResource(img111);
        }else if(cardsarray[card]==112){
            iv.setImageResource(img112);
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
        }else if(cardsarray[card]==207){
            iv.setImageResource(img207);
        }else if(cardsarray[card]==208){
            iv.setImageResource(img208);
        }else if(cardsarray[card]==209){
            iv.setImageResource(img209);
        }else if(cardsarray[card]==210){
            iv.setImageResource(img210);
        }else if(cardsarray[card]==211){
            iv.setImageResource(img211);
        }else if(cardsarray[card]==212){
            iv.setImageResource(img212);
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
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);
            iv_41.setEnabled(false);
            iv_42.setEnabled(false);
            iv_43.setEnabled(false);
            iv_44.setEnabled(false);
            iv_51.setEnabled(false);
            iv_52.setEnabled(false);
            iv_53.setEnabled(false);
            iv_54.setEnabled(false);
            iv_61.setEnabled(false);
            iv_62.setEnabled(false);
            iv_63.setEnabled(false);
            iv_64.setEnabled(false);

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
                iv_21.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==5){
                iv_22.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==6){
                iv_23.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==7){
                iv_24.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==8){
                iv_31.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==9){
                iv_32.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==10){
                iv_33.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==11){
                iv_34.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==12){
                iv_41.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==13){
                iv_42.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==14){
                iv_43.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==15){
                iv_44.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==16){
                iv_51.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==17){
                iv_52.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==18){
                iv_53.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==19){
                iv_54.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==20){
                iv_61.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==21){
                iv_62.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==22){
                iv_63.setVisibility(View.INVISIBLE);
            }else if (clickedfirst==23){
                iv_64.setVisibility(View.INVISIBLE);
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
                iv_21.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==5){
                iv_22.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==6){
                iv_23.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==7){
                iv_24.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==8){
                iv_31.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==9){
                iv_32.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==10){
                iv_33.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==11){
                iv_34.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==12){
                iv_41.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==13){
                iv_42.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==14){
                iv_43.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==15){
                iv_44.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==16){
                iv_51.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==17){
                iv_52.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==18){
                iv_53.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==19){
                iv_54.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==20){
                iv_61.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==21){
                iv_62.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==22){
                iv_63.setVisibility(View.INVISIBLE);
            }else if (clickedsecond==23){
                iv_64.setVisibility(View.INVISIBLE);
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
            iv_21.setImageResource(R.drawable.sm1);
            iv_22.setImageResource(R.drawable.sm1);
            iv_23.setImageResource(R.drawable.sm1);
            iv_24.setImageResource(R.drawable.sm1);
            iv_31.setImageResource(R.drawable.sm1);
            iv_32.setImageResource(R.drawable.sm1);
            iv_33.setImageResource(R.drawable.sm1);
            iv_34.setImageResource(R.drawable.sm1);
            iv_41.setImageResource(R.drawable.sm1);
            iv_42.setImageResource(R.drawable.sm1);
            iv_43.setImageResource(R.drawable.sm1);
            iv_44.setImageResource(R.drawable.sm1);
            iv_51.setImageResource(R.drawable.sm1);
            iv_52.setImageResource(R.drawable.sm1);
            iv_53.setImageResource(R.drawable.sm1);
            iv_54.setImageResource(R.drawable.sm1);
            iv_61.setImageResource(R.drawable.sm1);
            iv_62.setImageResource(R.drawable.sm1);
            iv_63.setImageResource(R.drawable.sm1);
            iv_64.setImageResource(R.drawable.sm1);


            if (turn==1){
                turn=2;
                tv_p1.setTextColor(Color.BLACK);
                tv_p2.setTextColor(Color.BLACK);
            }else if (turn==2){
                turn=1;
                tv_p2.setTextColor(Color.BLACK);
                tv_p1.setTextColor(Color.BLACK);
            }
        }
        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);
        iv_41.setEnabled(true);
        iv_42.setEnabled(true);
        iv_43.setEnabled(true);
        iv_44.setEnabled(true);
        iv_51.setEnabled(true);
        iv_52.setEnabled(true);
        iv_53.setEnabled(true);
        iv_54.setEnabled(true);
        iv_61.setEnabled(true);
        iv_62.setEnabled(true);
        iv_63.setEnabled(true);
        iv_64.setEnabled(true);

        checkEnd();

    }

    private void checkEnd(){
        if (iv_11.getVisibility()==View.INVISIBLE&&
                iv_12.getVisibility()==View.INVISIBLE&&
                iv_13.getVisibility()==View.INVISIBLE&&
                iv_14.getVisibility()==View.INVISIBLE&&
                iv_21.getVisibility()==View.INVISIBLE&&
                iv_22.getVisibility()==View.INVISIBLE&&
                iv_23.getVisibility()==View.INVISIBLE&&
                iv_24.getVisibility()==View.INVISIBLE&&
                iv_31.getVisibility()==View.INVISIBLE&&
                iv_32.getVisibility()==View.INVISIBLE&&
                iv_33.getVisibility()==View.INVISIBLE&&
                iv_34.getVisibility()==View.INVISIBLE&&
                iv_41.getVisibility()==View.INVISIBLE&&
                iv_42.getVisibility()==View.INVISIBLE&&
                iv_43.getVisibility()==View.INVISIBLE&&
                iv_44.getVisibility()==View.INVISIBLE&&
                iv_51.getVisibility()==View.INVISIBLE&&
                iv_52.getVisibility()==View.INVISIBLE&&
                iv_53.getVisibility()==View.INVISIBLE&&
                iv_54.getVisibility()==View.INVISIBLE&&
                iv_61.getVisibility()==View.INVISIBLE&&
                iv_62.getVisibility()==View.INVISIBLE&&
                iv_63.getVisibility()==View.INVISIBLE&&
                iv_64.getVisibility()==View.INVISIBLE){

            AlertDialog.Builder alertDilogBuilder=new AlertDialog.Builder(Main4Activity.this);
            alertDilogBuilder.setMessage("Gameover\nScore:"+playerpoints)
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent= new Intent(getApplicationContext(),Main4Activity.class);
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
        img107=R.drawable.animals_13;
        img108=R.drawable.animals_14;
        img109=R.drawable.animals_17;
        img110=R.drawable.animals_18;
        img111=R.drawable.animals_19;
        img112=R.drawable.animals_20;

        img201=R.drawable.animals_7;
        img202=R.drawable.animals_8;
        img203=R.drawable.animals_9;
        img204=R.drawable.animals_10;
        img205=R.drawable.animals_11;
        img206=R.drawable.animals_12;
        img207=R.drawable.animals_15;
        img208=R.drawable.animals_16;
        img209=R.drawable.animals_21;
        img210=R.drawable.animals_22;
        img211=R.drawable.animals_23;
        img212=R.drawable.animals_24;
    }


        }
