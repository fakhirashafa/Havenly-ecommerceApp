package com.example.havenlyfashion;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListHistoryAdapter extends RecyclerView.Adapter<ListHistoryAdapter.ListViewHolder> {

    private ArrayList<History> listHistory;

    public ListHistoryAdapter(ArrayList<History> list) {
        this.listHistory = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.history, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        History history = listHistory.get(position);
        holder.imgPhoto.setImageResource(history.getPhoto());
        holder.tvName.setText(history.getName());
        holder.tvPrice.setText(history.getPrice());
        holder.tvInvoice.setText(history.getInvoice());

    }

    @Override
    public int getItemCount() {
        return listHistory.size();
    }


    static class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvPrice, tvInvoice;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item);
            tvInvoice = itemView.findViewById(R.id.tv_invoice);
            tvName = itemView.findViewById(R.id.tv_nama);
            tvPrice = itemView.findViewById(R.id.tv_harga);

        }
    }
}
