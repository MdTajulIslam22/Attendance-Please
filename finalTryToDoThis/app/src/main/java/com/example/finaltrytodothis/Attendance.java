package com.example.finaltrytodothis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class Attendance extends AppCompatActivity {
    RadioButton sub1, sub2, sub3, sub4, sub5, sub6, sub7;
    CheckBox somrat, noor, arifur, hafizur, tajul, mahmud, rafsan, ripon, sekhor, tariqul, nighat, rayhan, simul;
    TextView mailAddresses;
    StringBuilder allRoll = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);

        sub1 = (RadioButton) findViewById(R.id.radio1);
        sub2 = (RadioButton) findViewById(R.id.radio2);
        sub3 = (RadioButton) findViewById(R.id.radio3);
        sub4 = (RadioButton) findViewById(R.id.radio4);
        sub5 = (RadioButton) findViewById(R.id.radio5);
        sub6 = (RadioButton) findViewById(R.id.radio6);
        sub7 = (RadioButton) findViewById(R.id.radio7);

        somrat = findViewById(R.id.somrat);
        noor = findViewById(R.id.noor);
        arifur = findViewById(R.id.arifur);
        hafizur = findViewById(R.id.hafizur);
        tajul = findViewById(R.id.tajul);
        mahmud = findViewById(R.id.mahmud);
        rafsan = findViewById(R.id.rafsan);
        ripon = findViewById(R.id.ripon_video);
        sekhor = findViewById(R.id.sekhor);
        tariqul = findViewById(R.id.tariqul);
        nighat = findViewById(R.id.nighat);
        rayhan = findViewById(R.id.rayhan);
        simul = findViewById(R.id.simul);
    }

    public void process(View view){

        if (sub1.isChecked()){
            allRoll.append("Subject: " + "System Analysis & Design(66671)\n");
        }if (sub2.isChecked()){
            allRoll.append("Subject: " + "Network Administration & survay(66672)\n");
        }if (sub3.isChecked()){
            allRoll.append("Subject: " + "Apps Development Project(66673)\n");
        }if (sub4.isChecked()){
            allRoll.append("Subject: " + "E-commers & CMS(66674)\n");
        }if (sub5.isChecked()){
            allRoll.append("Subject: " + "Network & Data Center Operation(66675)\n");
        }if (sub6.isChecked()){
            allRoll.append("Subject: " + "Network Security System(66676)\n");
        }if (sub7.isChecked()){
            allRoll.append("Subject: " + "Enovation & Enterprenurship(65854)\n"); }


        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());
        allRoll.append("Date: " + currentDate + "\n\nToday's presented Rolls:\n");

        if (somrat.isChecked()){
            allRoll.append("A-959080\n");
        }if (noor.isChecked()){
            allRoll.append("A-959083\n");
        }if (arifur.isChecked()){
            allRoll.append("A-959085\n");
        }if (hafizur.isChecked()){
            allRoll.append("A-959087\n");
        }if (tajul.isChecked()){
            allRoll.append("A-959088\n");
        }if (mahmud.isChecked()){
            allRoll.append("A-959089\n");
        }if (rafsan.isChecked()){
            allRoll.append("A-959090\n");
        }if (ripon.isChecked()){
            allRoll.append("A-959099\n");
        }if (sekhor.isChecked()){
            allRoll.append("A-959101\n");
        }if (tariqul.isChecked()){
            allRoll.append("A-959102\n");
        }if (nighat.isChecked()){
            allRoll.append("A-959111\n");
        }if (rayhan.isChecked()){
            allRoll.append("A-959145\n");
        }if (simul.isChecked()){
            allRoll.append("A-959148\n");
        }

        Intent mailPaga = new Intent(Attendance.this, ProcessPage.class);
        mailPaga.putExtra("allrolls", (CharSequence) allRoll);
        startActivity(mailPaga);
    }
}