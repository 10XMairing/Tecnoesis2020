package com.github.tenx.tecnoesis20.ui.main.about;

import android.content.Context;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.github.tenx.tecnoesis20.R;

import java.util.ArrayList;

public class SponsorAdapter extends RecyclerView.Adapter<SponsorAdapter.SponsorViewHolder> {
    private ArrayList<String> mImageUrl = new ArrayList<>();
    private ArrayList<String> mSponsorName = new ArrayList<>();
    private ArrayList<String> mWebsiteUrl = new ArrayList<>();
    private ArrayList<String> mFacebookUrl = new ArrayList<>();
    private Context mContext;

    public SponsorAdapter(Context mContext, ArrayList<String> mImageUrl, ArrayList<String> mSponsorName, ArrayList<String> mWebsiteUrl, ArrayList<String> mFacebookUrl ) {
        this.mImageUrl = mImageUrl;
        this.mSponsorName = mSponsorName;
        this.mWebsiteUrl = mWebsiteUrl;
        this.mFacebookUrl = mFacebookUrl;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public SponsorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_sponsor,parent,false);
        SponsorViewHolder holder = new SponsorViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull SponsorViewHolder holder, int position) {
        Glide.with(mContext)
                .asBitmap()
                .load(mImageUrl.get(position))
                .into(holder.sponsorImage);
        holder.sponsorName.setText(mSponsorName.get(position));
        holder.websiteUrl.setText(mWebsiteUrl.get(position));
        holder.facebookUrl.setText(mFacebookUrl.get(position));
        holder.sponsorCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(holder.expandableView.getVisibility() == View.GONE ){
                    TransitionManager.beginDelayedTransition(holder.sponsorCard,new AutoTransition());
                    holder.expandableView.setVisibility(View.VISIBLE);
                }
                else{
                    TransitionManager.beginDelayedTransition(holder.sponsorCard,new AutoTransition());
                    holder.expandableView.setVisibility(View.GONE);
                }
            }
        });
        holder.sponsorImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(holder.expandableView.getVisibility() == View.GONE ){
                    TransitionManager.beginDelayedTransition(holder.sponsorCard,new AutoTransition());
                    holder.expandableView.setVisibility(View.VISIBLE);
                }
                else{
                    TransitionManager.beginDelayedTransition(holder.sponsorCard,new AutoTransition());
                    holder.expandableView.setVisibility(View.GONE);
                }
            }
        });
        holder.sponsorName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(holder.expandableView.getVisibility() == View.GONE ){
                    TransitionManager.beginDelayedTransition(holder.sponsorCard,new AutoTransition());
                    holder.expandableView.setVisibility(View.VISIBLE);
                }
                else{
                    TransitionManager.beginDelayedTransition(holder.sponsorCard,new AutoTransition());
                    holder.expandableView.setVisibility(View.GONE);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mSponsorName.size();
    }

    public class SponsorViewHolder extends RecyclerView.ViewHolder{
        ImageView sponsorImage;
        TextView sponsorName;
        TextView websiteUrl;
        TextView facebookUrl;
        CardView sponsorCard;
        ConstraintLayout expandableView;

        public SponsorViewHolder(@NonNull View itemView) {
            super(itemView);
            sponsorImage = itemView.findViewById(R.id.card_sponsor_img_sponsor);
            sponsorName = itemView.findViewById(R.id.card_sponsor_tv_sponsorName);
            websiteUrl = itemView.findViewById(R.id.card_sponsor_tv_websiteUrl);
            facebookUrl = itemView.findViewById(R.id.card_sponsor_tv_facebookUrl);
            sponsorCard = itemView.findViewById(R.id.card_sponsor_cv_sponsorCard);
            expandableView = itemView.findViewById(R.id.card_team_constraint_expandableView);
        }
    }
}
