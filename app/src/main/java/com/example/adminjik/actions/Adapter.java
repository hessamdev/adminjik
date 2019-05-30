package com.example.adminjik.actions;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.example.adminjik.R;
import com.example.adminjik.model.Location_Adress;

import java.util.ArrayList;

public class Adapter {

    private Activity activity;

    static class Adapter_Location extends RecyclerView.Adapter<Adapter_Location.ViewHolder> implements Filterable {

        private ArrayList<Location_Adress> list;
        private ArrayList<Location_Adress> filter_list;
        private int type;
        private OnItemClickListener clickListener;


        public Adapter_Location(ArrayList<Location_Adress> list, int type, OnItemClickListener clickListener) {
            this.list = list;
            this.filter_list = list;
            this.type = type;
            this.clickListener = clickListener;
        }


        @Override
        public Filter getFilter() {
            return new Filter() {
                @Override
                protected FilterResults performFiltering(CharSequence constraint) {
                    String charstring = constraint.toString();

                    if (charstring.isEmpty()) {
                        filter_list = list;
                    } else {
                        ArrayList<Location_Adress> filteredlist = new ArrayList<>();
                        for (Location_Adress row : list) {
                            Log.i("Search", charstring);
                            if (!row.getOstan().equals("")) {
                                Log.i("Ostan", "yes");
                                if (row.getOstan().contains(charstring)) {
                                    filteredlist.add(row);
                                }
                            }
                            if (row.getShahr() != null) {
                                if (row.getShahr().contains(charstring)) {
                                    filteredlist.add(row);
                                }
                            }
                            if (row.getMahale() != null) {
                                if (row.getMahale().contains(charstring)) {
                                    filteredlist.add(row);
                                }
                            }

                        }
                        filter_list = filteredlist;
                    }
                    FilterResults filterResults = new FilterResults();
                    filterResults.values = filter_list;


                    return filterResults;
                }

                @Override
                protected void publishResults(CharSequence constraint, FilterResults results) {
                    filter_list = (ArrayList<Location_Adress>) results.values;
                    Log.i("notify", "yes");
                    notifyDataSetChanged();
                }
            };
        }

        public interface OnItemClickListener {
            void onItemClick(Location_Adress model);

        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.z_m_recycler_location, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            final Location_Adress locationAdress = list.get(position);

            switch (type) {
                case 0:
                    holder.titel.setText(locationAdress.getOstan());
                    break;
                case 1:
                    holder.titel.setText(locationAdress.getShahr());
                    break;
                case 2:
                    holder.titel.setText(locationAdress.getMahale());
                    break;
            }


            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickListener.onItemClick(locationAdress);
                }
            });


        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            TextView titel;

            public ViewHolder(View itemView) {
                super(itemView);
                titel = (TextView) itemView.findViewById(R.id.z_m_textview_location);
            }
        }

    }

}
