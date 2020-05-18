package com.gracefulwind.learndagger2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.gracefulwind.learndagger2.mvp.activity2.SecondActivity;
import com.gracefulwind.learndagger2.mvp.activity3.ThirdActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainContract.View {


    @Inject
    MainPresenter mPresenter;
    @BindView(R.id.am_btn_click1)
    Button amBtnClick1;
    @BindView(R.id.am_btn_click2)
    Button amBtnClick2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerMainComponent.builder()
                .mainModule(new MainModule(this))
                .build()
                .inject(this);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @Override
    public void updateUI() {
        System.out.println("==============");
        System.out.println("==============");
        System.out.println("==============");
    }

    @OnClick({R.id.am_btn_click1, R.id.am_btn_click2, R.id.am_btn_click3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.am_btn_click1:
                updateUI();
                break;
            case R.id.am_btn_click2:
                jumpToActivity2();
                break;
                case R.id.am_btn_click3:
                jumpToActivity3();
                break;
        }
    }

    private void jumpToActivity2() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    private void jumpToActivity3() {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}
