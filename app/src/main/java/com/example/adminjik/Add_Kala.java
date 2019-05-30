package com.example.adminjik;

import android.view.View;

import com.example.adminjik.fragment.FragmentView;

public class Add_Kala extends FragmentView {
    @Override
    public void OnCreate() {
        View view= View.inflate(Activity,R.layout.add_kala,null);

        ViewMain = view;
    }
}
