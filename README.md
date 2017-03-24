##使用
####step 1

在gradle.build中加入允许使用databing的库

``` python
android {

    dataBinding {
        enabled = true
    }
   
}

```

####step 2

直接在你所需要的adapter中继承AbRecyclerViewDBAdapter，重点来了。。


``` python

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


}

```


使用这个adapter，你只需要加入数据源，在onbindviewholder中绑定view就简简单单了，我还发现利用数据绑定写的RecyclerView的还能解决删除头条数据无法显示动画的问题，欢迎帮忙找bug！第一次分享！希望大家多多支持



