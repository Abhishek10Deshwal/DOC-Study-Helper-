package com.example.studyhelper;

import androidx.appcompat.app.AppCompatActivity;


import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class noticebca extends AppCompatActivity {

    public static final String CHANNEl_ID="primarychannel";
    public static final int NOTIFICATION_Id=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticebca);
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O)
        {
            NotificationChannel channel=new NotificationChannel(CHANNEl_ID,"AD", NotificationManager.IMPORTANCE_DEFAULT);
            channel.setDescription("HELLO");
            NotificationManager notificationManager=getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }
    public void clickfornotice(View view){
        Intent intent= new Intent(this,Secondactivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent=PendingIntent.getActivities(this,NOTIFICATION_Id,new Intent[]{intent}, PendingIntent.FLAG_IMMUTABLE);

        NotificationCompat.Builder builder=new NotificationCompat.Builder(this,CHANNEl_ID)
                .setSmallIcon(R.drawable.dsh)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.drawable.dsh))
                .setContentTitle("DOC Study helper")
                .setContentText("fastly check BCA NOTICE ")
                .setContentIntent(pendingIntent)
                .setAutoCancel(true);
        NotificationManagerCompat notificationManager=NotificationManagerCompat.from(this);
        notificationManager.notify(NOTIFICATION_Id,builder.build());
    }
}