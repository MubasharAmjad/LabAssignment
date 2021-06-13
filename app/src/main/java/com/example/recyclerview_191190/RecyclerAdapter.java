package com.example.recyclerview_191190;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<CountryData> countryDataList;
    private   Context context;

    public RecyclerAdapter(List<CountryData> countryDataList, Context context) {
        this.countryDataList = countryDataList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recyclerview_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
        CountryData countryData = countryDataList.get(position);

        holder.textView_code.setText("Country code: "+countryData.getCode());
        holder.textView_name.setText("Name: "+countryData.getName());
        holder.textView_language.setText("Language: "+countryData.getLanguage());
    }

    @Override
    public int getItemCount() {
        return countryDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textView_code, textView_name, textView_language;
        ImageView del;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView_code = itemView.findViewById(R.id.tv_code);
            textView_name = itemView.findViewById(R.id.tv_name);
            textView_language = itemView.findViewById(R.id.tv_language);
            del = itemView.findViewById(R.id.deleteicon);


        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countryDataList.remove(getAdapterPosition());
                notifyItemRemoved(getAdapterPosition());
            }
        });
        }

        @Override
        public void onClick(View v) {

        }
    }
}
