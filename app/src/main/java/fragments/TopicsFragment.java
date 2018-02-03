package fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import adapters.TopicsAdapter;
import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.tunlinaung.tedclone.R;

/**
 * Created by eidoshack on 2/3/18.
 */

public class TopicsFragment extends Fragment {

    @BindView(R.id.rv_ted_by_topics)
    RecyclerView rvTedByTopics;

    private TopicsAdapter topicsAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_topics, container, false);

        ButterKnife.bind(this, view);

        topicsAdapter = new TopicsAdapter();
        rvTedByTopics.setAdapter(topicsAdapter);
        rvTedByTopics.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, true));

        return view;
    }
}
