package com.lcworld.shopdemo.stq.merchants;

import android.content.Context;
import android.view.View;

import com.lcworld.shopdemo.R;
import com.lcworld.shopdemo.base.BaseFragment;
import com.lcworld.shopdemo.stq.S_MainActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


/**
 * 社团圈-商家模块
 */
public class MerchantFragment extends BaseFragment {


    Unbinder unbinder;
    private S_MainActivity activity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (S_MainActivity) context;
    }

    @Override
    protected int setContentView() {
        return R.layout.s_frag_merchant;
    }

    @Override
    protected boolean setActionBarView() {
        return false;
    }


    @Override
    protected void initView(View view) {
        unbinder = ButterKnife.bind(this, view);
    }

    @Override
    protected void initData() {
    }


    @Override
    protected void setListener() {

    }

    @OnClick({R.id.iv1})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv1:
                break;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

}
