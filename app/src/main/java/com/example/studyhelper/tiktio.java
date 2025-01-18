package com.example.studyhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public class tiktio extends AppCompatActivity {

        LinearLayout winTab;
        boolean gameActive=true;
        int active=0;
        int [] gameState={2,2,2,2,2,2,2,2,2};
        int [][] winPositions=  {{0,1,2},{3,4,5},{6,7,8},
                {0,3,6},{1,4,7},{2,5,8},
                {0,4,8},{2,4,6}};

        public void playerTap(View view){
            ImageView img= (ImageView) view;
            int tappedImage=Integer.parseInt(img.getTag().toString());

            if (gameState[tappedImage]==2){
                gameState[tappedImage]=active;
                img.setTranslationY(-1000f);
                if (active==0){
                    gameActive=false;
                    img.setImageResource(R.drawable.x);
                    active=1;
                    TextView status=findViewById(R.id.status);
                    status.setText("O's Turn - Tap To Play");
                }
                else if(active==1) {
                    gameActive=false;
                    img.setImageResource(R.drawable.o);
                    active=0;
                    TextView status=findViewById(R.id.status);
                    status.setText("X's Turn - Tap To Play");

                }


                img.animate().translationYBy(1000f).setDuration(300);
            }
            // Check if any Player has won
            for (int[] winPosition: winPositions){
                if (gameState[winPosition[0]] == gameState[winPosition[1]]
                        && gameState[winPosition[1]] == gameState[winPosition[2]]
                        && gameState[winPosition[0]]!=2){
                    // Somebody has won! - Find Out Who!
                    String winnerStr;
                    gameActive =false;
                    if (gameState[winPosition[0]]==0){
                        winnerStr ="X has won";
                        winTab.setEnabled(false);
                    }
                    else {
                        winnerStr="O has won";
                        winTab.setEnabled(false);
                    }
                    TextView status=findViewById(R.id.status);
                    status.setText(winnerStr);

                }
            }
        }

        public void reset(View view){
            winTab.setEnabled(true);
            if (!gameActive){
                gameActive=true;
                active=0;
                for (int i=0;i<gameState.length;i++){
                    gameState[i]=2;
                }

                ((ImageView)findViewById(R.id.imageView0)).setImageResource(0);
                ((ImageView)findViewById(R.id.imageView1)).setImageResource(0);
                ((ImageView)findViewById(R.id.imageView2)).setImageResource(0);
                ((ImageView)findViewById(R.id.imageView3)).setImageResource(0);
                ((ImageView)findViewById(R.id.imageView4)).setImageResource(0);
                ((ImageView)findViewById(R.id.imageView5)).setImageResource(0);
                ((ImageView)findViewById(R.id.imageView6)).setImageResource(0);
                ((ImageView)findViewById(R.id.imageView7)).setImageResource(0);
                ((ImageView)findViewById(R.id.imageView8)).setImageResource(0);

                TextView status=findViewById(R.id.status);
                status.setText("X's Turn - Tap To Play");
            }

        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiktio);
        winTab=(LinearLayout) findViewById(R.id.layoutTik);
    }
}