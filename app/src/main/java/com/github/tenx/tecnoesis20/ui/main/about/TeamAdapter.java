package com.github.tenx.tecnoesis20.ui.main.about;

import android.content.Context;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.github.tenx.tecnoesis20.R;

import java.util.ArrayList;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.TeamViewHolder> {
    private ArrayList<String> mImageUrl = new ArrayList<>();
    private ArrayList<String> mTeamName = new ArrayList<>();
    private ArrayList<ArrayList<String>> mLeaderImageUrl = new ArrayList<>();
    private ArrayList<ArrayList<String>> mLeaderName = new ArrayList<>();
    private ArrayList<ArrayList<String>> mMemberImageUrl = new ArrayList<>();
    private ArrayList<ArrayList<String>> mMemberName = new ArrayList<>();
    private Context mContext;

    public TeamAdapter(Context mContext, ArrayList<String> mImageUrl, ArrayList<String> mTeamName, ArrayList<ArrayList<String>> mLeaderImageUrl, ArrayList<ArrayList<String>> mLeaderName, ArrayList<ArrayList<String>> mMemberImageUrl, ArrayList<ArrayList<String>> mMemberName) {
        this.mImageUrl = mImageUrl;
        this.mTeamName = mTeamName;
        this.mLeaderImageUrl = mLeaderImageUrl;
        this.mLeaderName = mLeaderName;
        this.mMemberImageUrl = mMemberImageUrl;
        this.mMemberName = mMemberName;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_team,parent,false);
        TeamViewHolder holder = new TeamViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull TeamViewHolder holder, int position) {
        Glide.with(mContext)
                .asBitmap()
                .load(mImageUrl.get(position))
                .into(holder.teamImage);
        holder.teamName.setText(mTeamName.get(position));
        holder.leader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(holder.leadersExpandableView.getVisibility() == View.GONE ){
                    TransitionManager.beginDelayedTransition(holder.teamCard,new AutoTransition());
                    holder.leadersExpandableView.setVisibility(View.VISIBLE);
                }
                else{
                    TransitionManager.beginDelayedTransition(holder.teamCard,new AutoTransition());
                    holder.leadersExpandableView.setVisibility(View.GONE);
                }
                LeaderOrMemberAdapter adapter = new LeaderOrMemberAdapter(mContext,mLeaderImageUrl.get(position),mLeaderName.get(position));
                holder.leadersRecyclerView.setAdapter(adapter);
                holder.leadersRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
            }
        });
        holder.member.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(holder.membersExpandableView.getVisibility() == View.GONE ){
                    TransitionManager.beginDelayedTransition(holder.teamCard,new AutoTransition());
                    holder.membersExpandableView.setVisibility(View.VISIBLE);
                }
                else{
                    TransitionManager.beginDelayedTransition(holder.teamCard,new AutoTransition());
                    holder.membersExpandableView.setVisibility(View.GONE);
                }
                LeaderOrMemberAdapter adapter = new LeaderOrMemberAdapter(mContext,mMemberImageUrl.get(position),mMemberName.get(position));
                holder.membersRecyclerView.setAdapter(adapter);
                holder.membersRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mTeamName.size();
    }

    public class TeamViewHolder extends RecyclerView.ViewHolder{
        ImageView teamImage;
        TextView teamName;
        TextView leader;
        TextView member;
        RecyclerView leadersRecyclerView;
        RecyclerView membersRecyclerView;
        ConstraintLayout leadersExpandableView;
        ConstraintLayout membersExpandableView;
        CardView teamCard;


        public TeamViewHolder(@NonNull View itemView) {
            super(itemView);
            teamImage = itemView.findViewById(R.id.card_team_img_poster);
            teamName = itemView.findViewById(R.id.card_team_tv_teamName);
            leader = itemView.findViewById(R.id.card_team_tv_leaders);
            member = itemView.findViewById(R.id.card_team_tv_members);
            leadersRecyclerView = itemView.findViewById(R.id.card_team_rv_leaders);
            membersRecyclerView = itemView.findViewById(R.id.card_team_rv_members);
            leadersExpandableView = itemView.findViewById(R.id.list_leader_constraint_expandableView);
            membersExpandableView = itemView.findViewById(R.id.list_member_constraint_expandableView);
            teamCard = itemView.findViewById(R.id.card_team_cv_teamCard);
        }
    }

}
