package com.github.tenx.tecnoesis20.ui.main.schedule;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.github.tenx.tecnoesis20.R;

import java.util.List;
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    Context mContext;
    List<Day> mData;

    public RecyclerViewAdapter(Context mContext, List<Day> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_schedule, parent, false);
        return new MyViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.btn_event.setText(mData.get(position).getEvent_name());
        holder.btn_venue.setText(mData.get(position).getEvent_venue());
        holder.tv_day.setText(mData.get(position).getEvent_day());
        holder.tv_timing.setText(mData.get(position).getEvent_timing());

    }

    @Override
    public int getItemCount() {

        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        private Button btn_event;
        private Button btn_venue;
        private TextView tv_day;
        private TextView tv_timing;
        public View view;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_day=(TextView)itemView.findViewById(R.id.tv_day);
            btn_event=(Button) itemView.findViewById(R.id.btn_event);
            btn_venue=(Button) itemView.findViewById(R.id.btn_venue);
            tv_timing=(TextView)itemView.findViewById(R.id.tv_timing);
            view=itemView;
            view.setOnClickListener(new View.OnClickListener()
            {
                @Override public void onClick(View itemView)
                {
                    Toast.makeText(itemView.getContext(), "item Clicked!", Toast.LENGTH_SHORT).show();
                }

            });

        }
    }
}