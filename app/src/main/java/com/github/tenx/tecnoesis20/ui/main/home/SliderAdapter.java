package com.github.tenx.tecnoesis20.ui.main.home;

        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

        import com.bumptech.glide.Glide;
        import com.github.tenx.tecnoesis20.R;
        import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.SliderAdapterVH> {

    private Context context;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_imageslider_item, null);
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, int position) {

        switch (position) {
            case 0:
                 Glide.with(viewHolder.itemView)
                        .load("https://scontent.fgau1-1.fna.fbcdn.net/v/t1.0-9/80107818_2113829175386327_8294067927204757504_o.jpg?_nc_cat=100&_nc_ohc=HeYIP8nerr8AQlohyO7Da5Dv0HagWGXQzGC4NSHZvpuCZIbohzuWtrHwg&_nc_ht=scontent.fgau1-1.fna&oh=865a0e85ae6e23ffc9d2274736422155&oe=5EA9FA37")
                        .into(viewHolder.imageViewBackground);
                break;
            case 1:
                 Glide.with(viewHolder.itemView)
                        .load("https://scontent.fgau1-1.fna.fbcdn.net/v/t1.0-9/s960x960/80983288_2109972109105367_4720645881278234624_o.jpg?_nc_cat=108&_nc_ohc=SRySvxUNgfMAQmMcJFphxuw2e-v6u-2H-Nqu11BD9eWypyyyDpxF-ApMA&_nc_ht=scontent.fgau1-1.fna&oh=407f310637100a16b02b6da401892c7d&oe=5E74A79C")
                        .into(viewHolder.imageViewBackground);
                break;
            case 2:
                 Glide.with(viewHolder.itemView)
                        .load("https://scontent.fgau1-1.fna.fbcdn.net/v/t1.0-9/79467877_2083252038444041_978828230783926272_o.jpg?_nc_cat=109&_nc_ohc=gg6ks4I5yEIAQllQPkJzaXt9tsMCkf8jqk86Wm3AGPMnT4hud0rXD0ffQ&_nc_ht=scontent.fgau1-1.fna&oh=887d53d599c9830f25bd0dbd8d73be2c&oe=5E6A9006")
                        .into(viewHolder.imageViewBackground);
                break;
            default:
                Glide.with(viewHolder.itemView)
                        .load("https://scontent.fgau1-1.fna.fbcdn.net/v/t1.0-9/79592834_2106185699484008_685113769805742080_o.jpg?_nc_cat=109&_nc_ohc=0BuCIFI7YrYAQkPMtyV3Vb3z8ojTnSG5wXPy3EbOQY6_xGqL8mBv0XdqQ&_nc_ht=scontent.fgau1-1.fna&oh=c3999587d48c88e1501e2ae6e41406c8&oe=5EAE3385")
                        .into(viewHolder.imageViewBackground);
                break;

        }

    }
    @Override
    public int getCount() {
        //slider view count could be dynamic size
        return 4;
    }

    class SliderAdapterVH extends SliderViewAdapter.ViewHolder {

        View itemView;
        ImageView imageViewBackground;
        TextView textViewDescription;

        public SliderAdapterVH(View itemView) {
            super(itemView);
            imageViewBackground = itemView.findViewById(R.id.imageView);

            this.itemView = itemView;
        }
    }
}