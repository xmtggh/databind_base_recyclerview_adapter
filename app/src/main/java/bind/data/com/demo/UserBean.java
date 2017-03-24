package bind.data.com.demo;


import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by ZQZN on 2017/3/23.
 */

public class UserBean extends BaseObservable {
    private String userName;
    private String passWord;

    public UserBean(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    @Bindable
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
        notifyPropertyChanged(bind.data.com.demo.BR.passWord);
    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(bind.data.com.demo.BR.userName);
    }
}
