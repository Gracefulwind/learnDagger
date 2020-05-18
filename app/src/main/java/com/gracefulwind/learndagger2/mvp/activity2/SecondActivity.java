package com.gracefulwind.learndagger2.mvp.activity2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.gracefulwind.learndagger2.MainPresenter;
import com.gracefulwind.learndagger2.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @ClassName: SecondActivity
 * @Author: Gracefulwind
 * @CreateDate: 2020/5/18 10:03
 * @Description: ---------------------------
 * @UpdateUser:
 * @UpdateDate: 2020/5/18 10:03
 * @UpdateRemark:
 * @Version: 1.0
 * @Email: 429344332@qq.com
 */

public class SecondActivity extends AppCompatActivity implements SecondContract.View {
//
//    @Inject
    SecondPresenter mPresenter;
    @BindView(R.id.as_btn_click1)
    Button asBtnClick1;
    @BindView(R.id.as_btn_click2)
    Button asBtnClick2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        DaggerMainComponent.builder()
//                .mainModule(new MainModule(this))
//                .build()
//                .inject(this);

        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.as_btn_click1, R.id.as_btn_click2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.as_btn_click1:
//                updateUI();
                break;
            case R.id.as_btn_click2:
//                jumpToActivity2();
                showSecond();
                break;
        }
    }

    @Override
    public void showSecond() {
        Toast.makeText(this, "Second Activity", Toast.LENGTH_SHORT).show();
    }


}
