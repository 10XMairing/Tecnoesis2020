package com.github.tenx.tecnoesis20.ui.main.EventDescription;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.github.tenx.tecnoesis20.R;
import com.github.tenx.tecnoesis20.data.models.ModuleBody;
import com.github.tenx.tecnoesis20.ui.module.modulefrag.EventAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

    public class EventDescriptionAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int TYPE_HEADER = 110;
    private static final int TYPE_ITEM=111;


    private List<ModuleBody.EventBody> eventdetails;
    private Context context;
    private  ModuleBody moduleBody;


    public EventDescriptionAdapter(ModuleBody moduleBody, Context context)
    {
        this.eventdetails = moduleBody.getEventList();
        this.moduleBody = moduleBody;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View v;
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_eventdesc_list, parent, false);
            return new EventDescriptionAdapter.CustomViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (position == 0)
        {
            EventDescriptionAdapter.CustomViewHolder itemholder = (EventDescriptionAdapter.CustomViewHolder) holder;
            itemholder.iv_tv_eventdescription.setText(eventdetails.get(position).getDescription());
            itemholder.iv_tv_eventheadline.setText(eventdetails.get(position).getName());
            itemholder.iv_tv_eventrules.setText(eventdetails.get(position).getRules());
            itemholder.iv_tv_eventprize.setText(eventdetails.get(position).getPrize());
            itemholder.iv_btn_register.setText(eventdetails.get(position).getRegisterLink());
            Glide.with(context).load(moduleBody.getImage()).into(itemholder.iv_img_eventimage);
        }
    }
    @NonNull
    @Override
    public int getItemCount() {
        return eventdetails.size();
    }
    @Override
    public int getItemViewType(int position) {

            if(position==0)

            return TYPE_HEADER;
            else
                return TYPE_ITEM;
    }
    class CustomViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.frag_events_btn_eventimage)
        ImageView iv_img_eventimage;
        @BindView(R.id.fragment_events_tv_eventheadline)
        TextView iv_tv_eventheadline;
        @BindView(R.id.frag_events_tv_eventdes)
        TextView iv_tv_eventdescription;
        @BindView(R.id.frag_events_tv_eventrules)
        TextView iv_tv_eventrules;
        @BindView(R.id.frag_events_tv_eventprize)
        TextView iv_tv_eventprize;
        @BindView(R.id.frag_events_tv_register)
        TextView iv_btn_register;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}


