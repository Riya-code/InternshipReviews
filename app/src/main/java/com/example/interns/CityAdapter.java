package com.example.interns;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.ViewHolder> {

    private ArrayList<CityInfo> dataList = new ArrayList<>();

    public CityAdapter(ArrayList<CityInfo> dataList){
        this.dataList = dataList;


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listview, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.studInfo.setText(dataList.get(i).getStudinfo());
        viewHolder.details.setText(dataList.get(i).getDet());

    }

    @Override
    public int getItemCount() {
        return dataList.size();  //this is null
    }

    protected class ViewHolder extends RecyclerView.ViewHolder{
        TextView details ;
        TextView studInfo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            details = itemView.findViewById(R.id.detail);
            studInfo = itemView.findViewById(R.id.stud);


        }
    }
}
