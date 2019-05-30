package com.example.adminjik.actions;

import android.app.Activity;
import android.app.AlertDialog;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.adminjik.R;
import com.example.adminjik.model.Location_Adress;

import java.util.ArrayList;

public class Dialog {

    private Activity activity ;
    private ArrayList<Location_Adress> list_Ostan, list_Shahr, list_Mahale;


    public Dialog(Activity activity) {
        this.activity = activity;
    }


    public void create_AlertDialog(final ArrayList<Location_Adress> list, final int type) {
        final Location_Adress location_adress;
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(activity);
        final AlertDialog dialog = alertDialog.create();
        View convertview = LayoutInflater.from(activity).inflate(R.layout.z_m_alert_adress, null);
        dialog.setView(convertview);
        final RecyclerView recyclerView = (RecyclerView) convertview.findViewById(R.id.z_m_Recycler_alert);
        EditText search = (EditText) convertview.findViewById(R.id.z_m_alertAdres_Edittext_search);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false));
        recyclerView.addItemDecoration(new DividerItemDecoration(activity, DividerItemDecoration.VERTICAL));
        final Adapter.Adapter_Location adapter_location = new Adapter.Adapter_Location(list, type, new Adapter.Adapter_Location.OnItemClickListener() {
            @Override
            public void onItemClick(Location_Adress location) {
//                switch (type) {
//                    case 0:
//                        dialog.setTitle("استان");
////                        Toast.makeText(Activity, "" + model.getId() + "listshahr = " + (list(list_Shahr, model.getId(), intshahr)).size(), Toast.LENGTH_SHORT).show();
//                        Log.i("id  -shahr size - shahr", model.getId() + " - " + (list(list_Shahr, model.getId(), intshahr)).size() + " - " + model.getShahr());
//                        ostan.setText(model.getOstan());
//                        shahr.setText("شهر");
//                        mahale.setText("محله");
//                        id_OStan = model.getId();
//                        create_AlertDialog(list(list_Shahr, model.getId(), intshahr), intshahr);
//                        dialog.dismiss();
//                        break;
//                    case 1:
//                        dialog.setTitle("شهر");
////                        Toast.makeText(Activity, model.getShahr() + "  Salam" + model.getId(), Toast.LENGTH_SHORT).show();
//                        shahr.setText(model.getShahr());
//                        mahale.setText("محله");
//                        id_Shahr = model.getId();
//                        create_AlertDialog(list(list_Mahale, model.getId(), intmahale), intmahale);
//                        dialog.dismiss();
//                        break;
//                    case 2:
//                        dialog.setTitle("محله");
//                        id_Mahale = model.getId();
////                        Toast.makeText(Activity, "Mahale id =" + model.getId(), Toast.LENGTH_SHORT).show();
//                        mahale.setText(model.getMahale());
//                        dialog.dismiss();
//                        break;
//                }
            }
        });

                recyclerView.setAdapter(adapter_location);
        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adapter_location.getFilter().filter(s);
            }


            @Override
            public void afterTextChanged(Editable s) {
                ArrayList<Location_Adress> filter = new ArrayList<>();

                Adapter.Adapter_Location adapterfilter = new Adapter.Adapter_Location(filter, type, new Adapter.Adapter_Location.OnItemClickListener() {


                    @Override
                    public void onItemClick(Location_Adress model) {
//                        switch (type) {
//                            case 0:
//                                dialog.setTitle("استان");
//                                Toast.makeText(activity, "" + model.getId() + "listshahr = " + (list(list_Shahr, model.getId(), intshahr)).size(), Toast.LENGTH_SHORT).show();
//                                Log.i("id  -shahr size - shahr", model.getId() + " - " + (list(list_Shahr, model.getId(), intshahr)).size() + " - " + model.getShahr());
//                                ostan.setText(model.getOstan());
//                                shahr.setText("شهر");
//                                mahale.setText("محله");
//                                id_OStan = model.getId();
//                                create_AlertDialog(list(list_Shahr, model.getId(), intshahr), intshahr);
//                                dialog.dismiss();
//                                break;
//                            case 1:
//                                dialog.setTitle("شهر");
//                                Toast.makeText(Activity, model.getShahr() + "  Salam" + model.getId(), Toast.LENGTH_SHORT).show();
//                                shahr.setText(model.getShahr());
//                                mahale.setText("محله");
//                                id_Shahr = model.getId();
//                                create_AlertDialog(list(list_Mahale, model.getId(), intmahale), intmahale);
//                                dialog.dismiss();
//                                break;
//                            case 2:
//                                dialog.setTitle("محله");
//                                id_Mahale = model.getId();
//                                Toast.makeText(Activity, "Mahale id =" + model.getId(), Toast.LENGTH_SHORT).show();
//                                mahale.setText(model.getMahale());
//                                dialog.dismiss();
//                                break;
//                        }
                    }
                    });

                recyclerView.setAdapter(adapterfilter);

            }
        });

        dialog.show();
    }

}
