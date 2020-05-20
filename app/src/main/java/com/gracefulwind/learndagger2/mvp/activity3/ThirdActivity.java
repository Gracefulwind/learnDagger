package com.gracefulwind.learndagger2.mvp.activity3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.gracefulwind.learndagger2.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @ClassName: ThirdActivity
 * @Author: Gracefulwind
 * @CreateDate: 2020/5/18 15:09
 * @Description: ---------------------------
 * @UpdateUser:
 * @UpdateDate: 2020/5/18 15:09
 * @UpdateRemark:
 * @Version: 1.0
 * @Email: 429344332@qq.com
 */

public class ThirdActivity extends AppCompatActivity implements ThirdContract.View {

    @BindView(R.id.at_btn_click1)
    Button atBtnClick1;
    @BindView(R.id.at_btn_click2)
    Button atBtnClick2;

    @Inject
    ThirdPresenter presenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerThirdComponent.builder()
               /* //如果不加这句，就会使用默认的无参构造生成Module
                //用了Builder后这个默认方法名就不存在了。
                .thirdModule(new ThirdModule("from activity"))*/
                .getThirdView(this)
                .getThirdModel(new ThirdModel("from dagger inject"))
                .build()
//                .getView().showThird();
                .inject(this);
        setContentView(R.layout.activity_third);
        ButterKnife.bind(this);
    }

    @Override
    public void showThird() {
        Toast.makeText(this, "this is Third!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public String getData() {
        return "get data";
    }


    @OnClick({R.id.at_btn_click1, R.id.at_btn_click2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.at_btn_click1:
                System.out.println("click 1");
                break;
            case R.id.at_btn_click2:
                System.out.println("click 2");
                break;
        }
    }

    public String getFrom(){
        return "from activity main";
    }
}
