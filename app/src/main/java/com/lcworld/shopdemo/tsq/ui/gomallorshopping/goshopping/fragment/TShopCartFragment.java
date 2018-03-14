package com.lcworld.shopdemo.tsq.ui.gomallorshopping.goshopping.fragment;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lcworld.shopdemo.R;
import com.lcworld.shopdemo.base.BaseFragment;
import com.lcworld.shopdemo.tsq.ui.gomallorshopping.goshopping.activity.T_ShopMainActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


/**
 * 拓商圈-商店-购物车
 */
public class TShopCartFragment extends BaseFragment {

    Unbinder unbinder;
    @BindView(R.id.tv_guanli)
    TextView tvGuanli;
    @BindView(R.id.iv_all)
    ImageView ivAll;
    @BindView(R.id.ll_all)
    LinearLayout llAll;
    @BindView(R.id.tv_zongong)
    TextView tvZongong;
    @BindView(R.id.tv_money)
    TextView tvMoney;
    @BindView(R.id.ll_1)
    LinearLayout ll1;
    @BindView(R.id.iv_all2)
    ImageView ivAll2;
    @BindView(R.id.ll_2)
    LinearLayout ll2;
    private T_ShopMainActivity activity;
    private int editStatus = 0;
    private boolean allSelect = false;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (T_ShopMainActivity) context;
    }

    @Override
    protected int setContentView() {
        return R.layout.t_frag_shopmain_cart;
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


    @OnClick({R.id.ll_back, R.id.tv_guanli, R.id.ll_all, R.id.tv_settlement, R.id.ll_all2, R.id.tv_fenxiang, R.id.tv_choucang, R.id.tv_shanchu})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_back:
                getActivity().finish();
                break;
            case R.id.tv_guanli://管理
                if (editStatus == 0) {//非编辑状态 转 编辑状态
                    editStatus = 1;
                    ll1.setVisibility(View.GONE);
                    ll2.setVisibility(View.VISIBLE);
                    tvGuanli.setText("完成");
                } else {//编辑状态 转 非编辑状态
                    editStatus = 0;
                    ll1.setVisibility(View.VISIBLE);
                    ll2.setVisibility(View.GONE);
                    tvGuanli.setText("管理");
                }
                break;
            case R.id.ll_all://全选
                break;
            case R.id.tv_settlement://结算
                break;
            case R.id.ll_all2://全选
                if (allSelect) {//取消全选
                    allSelect = false;
                } else {//全选
                    allSelect = true;
                }
                break;
            case R.id.tv_fenxiang:
                break;
            case R.id.tv_choucang:
                break;
            case R.id.tv_shanchu://删除
                break;
        }
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

}
