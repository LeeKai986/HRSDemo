package com.lcworld.shopdemo.ybg.fragment;

import android.content.Context;
import android.view.View;

import com.lcworld.shopdemo.R;
import com.lcworld.shopdemo.base.BaseFragment;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


/**
 *
 */
public class SYBGthreeFragment extends BaseFragment {

    Unbinder unbinder;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    protected int setContentView() {
        return R.layout.s_frag_ybgmain_three;
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


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }


}
