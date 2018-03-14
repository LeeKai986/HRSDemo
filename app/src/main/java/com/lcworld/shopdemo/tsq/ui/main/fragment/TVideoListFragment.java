package com.lcworld.shopdemo.tsq.ui.main.fragment;

import android.content.Context;
import android.view.View;

import com.lcworld.shopdemo.R;
import com.lcworld.shopdemo.base.BaseFragment;
import com.lcworld.shopdemo.tsq.ui.main.activity.T_MainActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 拓商圈-视频
 */
public class TVideoListFragment extends BaseFragment {

    Unbinder unbinder;
    private T_MainActivity activity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (T_MainActivity) context;
    }

    @Override
    protected int setContentView() {
        return R.layout.t_frag_main_video;
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