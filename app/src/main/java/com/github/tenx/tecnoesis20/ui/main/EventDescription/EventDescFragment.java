package com.github.tenx.tecnoesis20.ui.main.EventDescription;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tenx.tecnoesis20.R;
import com.github.tenx.tecnoesis20.Utils;
import com.github.tenx.tecnoesis20.data.models.ModuleBody;



import com.github.tenx.tecnoesis20.ui.module.ModuleActivity;
import com.github.tenx.tecnoesis20.ui.module.ModuleAdapter;
import com.github.tenx.tecnoesis20.ui.module.modulefrag.EventAdapter;
import com.github.tenx.tecnoesis20.ui.module.modulefrag.ModuleFragment;
import com.github.tenx.tecnoesis20.ui.module.modulefrag.ModuleViewModel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EventDescFragment extends Fragment {

    @BindView(R.id.frag_events_rv_eventlist)
    RecyclerView recyclerView;


    private EventDescViewModel edViewModel;

    private EventDescriptionAdapter eventDescriptionAdapter;


    public static EventDescFragment newInstance() {
        return new EventDescFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_eventdesc_list, container, false);
        ButterKnife.bind(this, v);


      try {
            Bundle args = getArguments();
            int index = args.getInt(EventDescActivity.PAGE_INDEX_KEY);
            ModuleBody testdata = Utils.getModules().get(index);
            initData(testdata, getActivity());


        } catch (NullPointerException e) {

            throw new Error("Did not receive page index in bundle!");
        }


        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
      //  edViewModel = ViewModelProviders.of(this).get(EventDescViewModel.class);
        // TODO: Use the ViewModel
    }
    private void initData(ModuleBody data,Context context)
    {
        eventDescriptionAdapter = new EventDescriptionAdapter( data  , context);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(eventDescriptionAdapter);

    }
}
