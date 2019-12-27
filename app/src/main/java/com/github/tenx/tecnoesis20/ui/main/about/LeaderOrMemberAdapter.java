package com.github.tenx.tecnoesis20.ui.main.about;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.github.tenx.tecnoesis20.R;

import java.util.ArrayList;

public class LeaderOrMemberAdapter extends RecyclerView.Adapter<LeaderOrMemberAdapter.LeaderOrMemberViewHolder> {
    private ArrayList<String> mImageUrl = new ArrayList<>();
    private ArrayList<String> mLeaderOrMemberName = new ArrayList<>();
    private Context mContext;

    public LeaderOrMemberAdapter(Context mContext, ArrayList<String> mImageUrl, ArrayList<String> mLeaderOrMemberName) {
        this.mImageUrl = mImageUrl;
        this.mLeaderOrMemberName = mLeaderOrMemberName;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public LeaderOrMemberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_leader,parent,false);
        LeaderOrMemberViewHolder holder = new LeaderOrMemberViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull LeaderOrMemberViewHolder holder, int position) {
        Glide.with(mContext)
                .asBitmap()
                .load(mImageUrl.get(position))
                .into(holder.leaderOrMemberImage);
        holder.leaderOrMemberName.setText(mLeaderOrMemberName.get(position));
    }

    @Override
    public int getItemCount() {
        return mLeaderOrMemberName.size();
    }

    public class LeaderOrMemberViewHolder extends RecyclerView.ViewHolder{
        ImageView leaderOrMemberImage;
        TextView leaderOrMemberName;

        public LeaderOrMemberViewHolder(@NonNull View itemView) {
            super(itemView);
            leaderOrMemberImage = itemView.findViewById(R.id.card_item_img_leader);
            leaderOrMemberName = itemView.findViewById(R.id.card_item_tv_leaderName);
        }
    }
}
