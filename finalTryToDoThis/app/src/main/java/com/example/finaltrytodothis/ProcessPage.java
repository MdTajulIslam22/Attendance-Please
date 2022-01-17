package com.example.finaltrytodothis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ProcessPage extends AppCompatActivity {
    TextView attentedRoll;
    Button copyRoll;
    String rolls;
    String roll;

    String subject = "CMT-7th Attendance Today.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_page);

        attentedRoll = (TextView) findViewById(R.id.present_roll);
        copyRoll = (Button) findViewById(R.id.copy_all);
        rolls = getIntent().getExtras().getString("allrolls");
        attentedRoll.setText("" + rolls);

        copyRoll = (Button) findViewById(R.id.copy_all);
        copyRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData rollData = ClipData.newPlainText("textView", rolls);
                clipboard.setPrimaryClip(rollData);

                Toast.makeText(ProcessPage.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void sendMail(View view){

        Intent intent = new Intent(Intent.ACTION_SEND);
//        intent.putExtra(Intent.EXTRA_EMAIL, address);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, rolls);

        intent.setType("message/rfc822");
        startActivity(intent);
    }
}