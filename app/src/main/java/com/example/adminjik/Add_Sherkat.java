package com.example.adminjik;

import android.view.View;
import android.widget.ImageView;



import com.example.adminjik.fragment.FragmentView;

public class Add_Sherkat extends FragmentView {



    @Override
    public void OnCreate() {
        View view = View.inflate(Activity, R.layout.addsherkat, null);
        ImageView imageView =(ImageView)view.findViewById(R.id.img_profile) ;
        ViewMain = view;
    }

}

