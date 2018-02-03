package viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by eidoshack on 2/3/18.
 */

public class ItemTopicsViewHolder extends RecyclerView.ViewHolder {

    public ItemTopicsViewHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);
    }

}
