package com.example.adminjik;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.adminjik.fragment.FragmentActivity;
import com.example.adminjik.fragment.FragmentView;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends FragmentActivity {
    LinearLayout click_Addshahr;
    LinearLayout click_Addsherkat;
    LinearLayout click_Dasteha;
    LinearLayout click_Menu;
    LinearLayout click_Addkala;


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        onclick();

    }

    private void init() {
        click_Addshahr = (LinearLayout) findViewById(R.id.Main_Linear_Addshahr);
        click_Addsherkat = (LinearLayout) findViewById(R.id.Main_Linear_Addsherkat);
        click_Dasteha = (LinearLayout) findViewById(R.id.Main_Linear_Dasteha);
        click_Menu = (LinearLayout) findViewById(R.id.Main_Linear_Menu);
        click_Addkala = (LinearLayout) findViewById(R.id.Main_Linear_Addkala);
    }

    private void onclick (){
        click_Addshahr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Changepage(3);
            }
        });
        click_Addsherkat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Changepage(1);
            }
        });
        click_Addkala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Changepage(2);
            }
        });
    }

    private void Changepage(int page) {

        String tag = null;
        FragmentView fragment = null;

        switch (page) {
            case 1:
                tag = "sherkat";
                fragment = new Add_Sherkat();

                break;
            case 2:
                tag = "kala";
                fragment = new Add_Kala();

                break;
            case 3:
                tag = "shahr";
                fragment = new Add_shahr();
                break;
        }
        GetManager().OpenView(fragment, tag, false);

    }

}
