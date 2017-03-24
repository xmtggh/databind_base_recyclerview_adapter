package bind.data.com.demo;

import android.content.Context;
import android.view.ViewGroup;


import java.util.List;

/**
 * Created by ZQZN on 2017/3/24.
 */

public class RecAdapter extends AbRecyclerViewDBAdapter<UserBean> {
    public RecAdapter(Context context, List<UserBean> list) {
        super(context, list);
    }

    @Override
    public BindingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BindingViewHolder(inflate(R.layout.item_main_rcy,parent));
    }

    @Override
    public void onBindViewHolder(BindingViewHolder holder, int position) {
        holder.getBinding().setVariable(bind.data.com.demo.BR.item, getItem(position));
    }
}
