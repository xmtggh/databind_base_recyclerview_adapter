package bind.data.com.demo;

import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import bind.data.com.demo.databinding.ActMainBinding;

public class MainActivity extends AppCompatActivity {

    ActMainBinding mainbinding;
    List<UserBean> list = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainbinding = DataBindingUtil.setContentView(MainActivity.this, R.layout.act_main);
        mainbinding.viewRecycler.setLayoutManager(new LinearLayoutManager(this));
        list.add(new UserBean("WT", "      ASDASD"));
        list.add(new UserBean("ASD", "      QWEQWE"));
        list.add(new UserBean("ERWERWE", "     214312312"));
        final RecAdapter adapter = new RecAdapter(MainActivity.this, list);
        mainbinding.viewRecycler.setAdapter(adapter);

    }

    public class Listener {
        public void onTextChange(CharSequence s) {
//            userBean.setUserName(s.toString());
        }

    }
}
