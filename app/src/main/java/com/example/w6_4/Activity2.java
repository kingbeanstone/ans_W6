package com.example.w6_4;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {
    Button button1;
    Button button2;

    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        //객체.
        fragment1= new Fragment1();
        fragment2= new Fragment2();
        fragment3= new Fragment3();



        //매니저.  첫 화면 설정!!!!
        FragmentManager fragmentManager=getSupportFragmentManager();

        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.frameLayout1, fragment1);  ///1번 프레임레이아웃.fragment1으로 첫 화면 설정.
        fragmentTransaction.add(R.id.frameLayout2, fragment3); // 2번 프레임레이아웃 . fragment3으로 첫 화면 설정.
        fragmentTransaction.commit();


//        fragmentManager= getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment2).commit();

        button1= (Button) findViewById(R.id.frag_button1);
        button2= (Button) findViewById(R.id.frag_button2);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                // 프래그먼트매니저를 통해 사용
                Fragment1 fragment1= new Fragment1(); // 객체 생성
                transaction.replace(R.id.frameLayout1, fragment1); //layout, 교체될 layout
                transaction.commit(); //commit으로 저장 하지 않으면 화면 전환이 되지 않음

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                // 프래그먼트매니저를 통해 사용
                Fragment2 fragment2= new Fragment2(); // 객체 생성
                transaction.replace(R.id.frameLayout1, fragment2); //layout, 교체될 layout
                transaction.commit(); //commit으로 저장 하지 않으면 화면 전환이 되지 않음


            }
        });












    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // 액션 바에 메뉴 아이템 추가
        getMenuInflater().inflate(R.menu.menu_2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // 클릭한 목록 아이템 ID
        int id = item.getItemId();

        // 클릭한 목록 아이템 ID별 이동할 액티비티
        if (id == R.id.action_settings1) {
            Intent it = new Intent(this, Activity1.class);
            startActivity(it);

            return true;
        } else if (id == R.id.action_settings3) {
            Intent it = new Intent(this, Activity3.class);
            startActivity(it);

            return true;
        }

        return super.onOptionsItemSelected(item);


    }



}