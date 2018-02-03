package adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import viewholders.ItemTopicsViewHolder;
import xyz.tunlinaung.tedclone.R;

/**
 * Created by eidoshack on 2/3/18.
 */

public class TopicsAdapter extends RecyclerView.Adapter<ItemTopicsViewHolder> {
    @Override
    public ItemTopicsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View topicItem = LayoutInflater.from(parent.getContext())
                      .inflate(R.layout.item_topics, parent, false);

        ItemTopicsViewHolder viewHolder = new ItemTopicsViewHolder(topicItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ItemTopicsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
