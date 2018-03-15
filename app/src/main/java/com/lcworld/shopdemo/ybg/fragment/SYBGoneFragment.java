package com.lcworld.shopdemo.ybg.fragment;

import android.content.Context;
import android.view.View;

import com.lcworld.shopdemo.R;
import com.lcworld.shopdemo.base.AppConfig;
import com.lcworld.shopdemo.base.BaseFragment;
import com.lcworld.shopdemo.base.UIManager;
import com.lcworld.shopdemo.rmq.activity.MainActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


/**
 * 商会-资讯
 */
public class SYBGoneFragment extends BaseFragment {

    Unbinder unbinder;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    protected int setContentView() {
        return R.layout.s_frag_ybgmain_o;
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

    @OnClick({R.id.ll_back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_back:
                AppConfig.getInstance().setMainType(0);
                UIManager.turnToAct(getActivity(), MainActivity.class);
                getActivity().finish();
                break;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }


}
