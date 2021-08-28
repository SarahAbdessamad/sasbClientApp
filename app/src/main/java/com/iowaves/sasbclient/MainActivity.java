package com.iowaves.sasbclient;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.CharArrayWriter;

public class MainActivity extends AppCompatActivity {
    String s1 = "http://";

    TextView a,b,c,d;
    Button b1 ;
    FirebaseDatabase dataset = FirebaseDatabase.getInstance();
    DatabaseReference reff = dataset.getReference("sasb");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(TextView) findViewById(R.id.enter);
        b=(TextView) findViewById(R.id.enter1);
        c=(TextView) findViewById(R.id.enter2);
        d=(TextView) findViewById(R.id.enter3);

        Button b1 = findViewById(R.id.button1);
        EditText inputText = (EditText) findViewById(R.id.adress);

        //WebView wv1 = findViewById(R.id.webview);
        String build_number = Build.FINGERPRINT;
        User id = new User("123", "123", "123", "123");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //sb.append(s1);
                //FirebaseApp.initializeApp(ctx);


                reff= FirebaseDatabase.getInstance().getReference().child("User");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String userName=dataSnapshot.child("userName").getValue().toString();
                        String firstName=dataSnapshot.child("firstName").getValue().toString();
                        String lastName=dataSnapshot.child("lastName").getValue().toString();
                        String publicIp=dataSnapshot.child("publicIp").getValue().toString();

                        a.setText(userName);
                        b.setText(firstName);
                        c.setText(lastName);
                        d.setText(publicIp);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

/*               if (!inputText.getText().toString().equals(null)) {
                    //sb.setLength(0);

                    StringBuilder sb = new StringBuilder();
                    sb.append(s1);
                    sb.append(inputText.getText().toString());

                    Toast toast = Toast.makeText(getApplicationContext(),
                            sb, Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER | Gravity.CENTER_HORIZONTAL, 0, 0);
                    toast.show();


                    System.out.println(sb.toString());
                    //wv1.getSettings().setJavaScriptEnabled(true);
                    //wv1.getSettings().setAllowContentAccess(true);
                    //wv1.getSettings().getDatabaseEnabled();
                    //wv1.loadUrl(sb.toString());

                }
            }*/
            }
        });
    }
    }
