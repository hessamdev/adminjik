package com.example.adminjik;


import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.adminjik.actions.Dialog;
import com.example.adminjik.fragment.FragmentView;
import com.example.adminjik.model.Location_Adress;

import java.util.ArrayList;

public class Add_shahr extends FragmentView {

    private TextView Add_ostan,Add_shahr,Add_mahale,setostan,setostan_m,setshahr;
    private LinearLayout linear_ostan,linear_shahr,linear_mahale;
    private Dialog alaert;
    @Override
    public void OnCreate() {
        View view = View.inflate(Activity,R.layout.home_safheasli_ui,null);
        alaert=new Dialog(Activity);

        init(view);


        ViewMain=view;
    }

    private void init(View view){
        Add_ostan=(TextView)view.findViewById(R.id.City_Textview_Addostan);
        linear_ostan=(LinearLayout) view.findViewById(R.id.City_Linear_Addostan);
        Add_ostan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (linear_ostan.getVisibility() == View.GONE){
                linear_ostan.setVisibility(View.VISIBLE);
                }else {
                    linear_ostan.setVisibility(View.GONE);
                }
            }
        });

        Add_shahr=(TextView)view.findViewById(R.id.City_Textview_Addshahr);
        linear_shahr=(LinearLayout) view.findViewById(R.id.City_Linear_Addshahr);
        setostan=(TextView)view.findViewById(R.id.City_Textview_Setostan) ;
        Add_shahr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (linear_shahr.getVisibility() == View.GONE){
                    linear_shahr.setVisibility(View.VISIBLE);
                }else {
                    linear_shahr.setVisibility(View.GONE);
                }
            }
        });
        final ArrayList<Location_Adress> listostan=new ArrayList<>();
        listostan.add(new Location_Adress("0","0","تهران","",""));
        listostan.add(new Location_Adress("0","0","البرز","",""));
        listostan.add(new Location_Adress("0","0","مشهد","",""));
        listostan.add(new Location_Adress("0","0","اصفهان","",""));
        setostan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alaert.create_AlertDialog(listostan,0);
            }
        });

        Add_mahale=(TextView)view.findViewById(R.id.City_Textview_Addmahale);
        linear_mahale=(LinearLayout) view.findViewById(R.id.City_Linear_Addmahale);
        setostan_m=(TextView)view.findViewById(R.id.City_Textview_Setostan_m) ;
        setshahr=(TextView)view.findViewById(R.id.City_Textview_Setshahr) ;
        Add_mahale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (linear_mahale.getVisibility() == View.GONE){
                    linear_mahale.setVisibility(View.VISIBLE);
                }else {
                    linear_mahale.setVisibility(View.GONE);
                }
            }
        });
        final ArrayList<Location_Adress> listshahr=new ArrayList<>();
        listshahr.add(new Location_Adress("0","0","مهرشهر","",""));
        listshahr.add(new Location_Adress("0","0","کیانمهر","",""));
        listshahr.add(new Location_Adress("0","0","حصارک","",""));
        listshahr.add(new Location_Adress("0","0","عطیمیه","",""));
        setostan_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alaert.create_AlertDialog(listostan,0);
            }
        });
        setshahr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alaert.create_AlertDialog(listshahr,0);
            }
        });


    }


}
