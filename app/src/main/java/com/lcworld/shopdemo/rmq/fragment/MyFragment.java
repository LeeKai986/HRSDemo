package com.lcworld.shopdemo.rmq.fragment;

import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import com.lcworld.shopdemo.R;
import com.lcworld.shopdemo.base.AppConfig;
import com.lcworld.shopdemo.base.BaseFragment;
import com.lcworld.shopdemo.base.SelectMorePop_my;
import com.lcworld.shopdemo.base.SettingBean;
import com.lcworld.shopdemo.base.UIManager;
import com.lcworld.shopdemo.pt.activity.T_PTMainActivity;
import com.lcworld.shopdemo.rmq.activity.ChangeChatModeAct;
import com.lcworld.shopdemo.rmq.activity.MainActivity;
import com.lcworld.shopdemo.rmq.adapter.GvSettingAdapter;
import com.lcworld.shopdemo.stq.CYDActivity;
import com.lcworld.shopdemo.stq.S_MainActivity;
import com.lcworld.shopdemo.tsq.ui.main.activity.T_MainActivity;
import com.lcworld.shopdemo.ybg.activity.T_YBGMainActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 创建：duke
 * 日期： 2017/4/14
 * 注释：我的
 * 版本： 1.0.0
 */
public class MyFragment extends BaseFragment {

    //    @BindView(R.id.iv_right_01)
//    ImageView ivRight01;
//    @BindView(R.id.ll_search)
//    LinearLayout llSearch;
//    @BindView(R.id.actionbar)
//    Actionbar actionbar;
    @BindView(R.id.gv_00)
    GridView gv_00;
    @BindView(R.id.gv_01)
    GridView gv_01;
    @BindView(R.id.gv_02)
    GridView gv_02;
    @BindView(R.id.iv_top)
    ImageView ivTop;
//    @BindView(R.id.tv_yjhj_count)
//    TextView tv_yjhj_count;

    private GvSettingAdapter adapter00, adapter01, adapter02;
    private ArrayList<SettingBean> mList00 = new ArrayList<>();
    private ArrayList<SettingBean> mList01 = new ArrayList<>();
    private ArrayList<SettingBean> mList02 = new ArrayList<>();


    @Override
    protected int setContentView() {
        return R.layout.fragment_my;
    }

    @Override
    protected boolean setActionBarView() {
        return false;
    }

    @Override
    protected void initView(View view) {
        ButterKnife.bind(this, view);
        final ImageView ivmore = (ImageView) view.findViewById(R.id.ivmore);
        ivmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //弹出功能pop
                new SelectMorePop_my(getActivity(), new SelectMorePop_my.SelectCallBack() {
                    @Override
                    public void onSelected(int more_type) {
                        switch (more_type) {
                            case 5:
                                UIManager.turnToAct(getActivity(), ChangeChatModeAct.class);
                                break;
                            default:
                                break;
                        }
                    }
                }).showAsDropDown(ivmore, 0, 0);
            }
        });
    }


    @Override
    protected void initData() {
        //00gv主页面
        //默认是0人脉聊天  1拓商圈   2社团圈   3移动办公
        switch (AppConfig.getInstance().getMainType()) {
            case 0:
                mList00.add(new SettingBean(R.mipmap.icon_my_new_stq, "社团圈"));
                mList00.add(new SettingBean(R.mipmap.icon_my_new_ybg, "移办公"));
                mList00.add(new SettingBean(R.mipmap.icon_my_new_tsq, "拓商圈"));
                ivTop.setImageResource(R.mipmap.wd_db);
                break;
            case 1:
                mList00.add(new SettingBean(R.mipmap.icon_my_new_stq, "社团圈"));
                mList00.add(new SettingBean(R.mipmap.icon_my_new_rmq, "人脉圈"));
                mList00.add(new SettingBean(R.mipmap.icon_my_new_ybg, "移办公"));
                ivTop.setImageResource(R.mipmap.tsqmy01);
                break;
            case 2:
                mList00.add(new SettingBean(R.mipmap.icon_my_new_tsq, "拓商圈"));
                mList00.add(new SettingBean(R.mipmap.icon_my_new_rmq, "人脉圈"));
                mList00.add(new SettingBean(R.mipmap.icon_my_new_ybg, "移办公"));
                ivTop.setImageResource(R.mipmap.stqmy01);
                break;
            case 3:
                mList00.add(new SettingBean(R.mipmap.icon_my_new_stq, "社团圈"));
                mList00.add(new SettingBean(R.mipmap.icon_my_new_rmq, "人脉圈"));
                mList00.add(new SettingBean(R.mipmap.icon_my_new_tsq, "拓商圈"));
                ivTop.setImageResource(R.mipmap.ybgmy001);
                break;

            default:
                break;
        }
        adapter00 = new GvSettingAdapter(getActivity());
        adapter00.setItemList(mList00);
        gv_00.setAdapter(adapter00);
        switch (AppConfig.getInstance().getMainType()) {
            //默认是0人脉聊天  1拓商圈   2社团圈
            case 0:
                mList02.add(new SettingBean(R.mipmap.my_share, "分享"));//分享
//                mList02.add(new SettingBean(R.mipmap.icon_my_new_zp, "招聘"));
                break;
            case 1:
                mList02.add(new SettingBean(R.mipmap.icon_my_new_cyd, "创业店"));
                break;
            case 2:
                mList02.add(new SettingBean(R.mipmap.icon_my_new_cyd, "创业店"));
                break;
            case 3:
                mList02.add(new SettingBean(R.mipmap.icon_my_new_gzt, "工作台"));
                break;

            default:
                break;
        }
        //01gv
        mList01.add(new SettingBean(R.mipmap.icon_my_new_dd, "订单"));
        mList01.add(new SettingBean(R.mipmap.icon_my_new_gwc, "购物车"));
        mList01.add(new SettingBean(R.mipmap.icon_my_new_sc, "收藏"));
        mList01.add(new SettingBean(R.mipmap.icon_my_new_yjhj, "一键呼叫"));
        mList01.add(new SettingBean(R.mipmap.icon_my_new_kb, "卡包"));
        mList01.add(new SettingBean(R.mipmap.icon_my_new_gz, "关注"));
        adapter01 = new GvSettingAdapter(getActivity());
        adapter01.setItemList(mList01);
        gv_01.setAdapter(adapter01);

        //02gv
        mList02.add(new SettingBean(R.mipmap.icon_my_new_xxzx, "信息中心"));
        mList02.add(new SettingBean(R.mipmap.icon_my_new_dzb, "地址簿"));
        mList02.add(new SettingBean(R.mipmap.icon_my_new_sz, "设置"));
        mList02.add(new SettingBean(R.mipmap.icon_my_new_zj, "足迹"));
        mList02.add(new SettingBean(R.mipmap.icon_my_new_yj, "邮件"));
        mList02.add(new SettingBean(R.mipmap.abouthrs, "关于互融商"));
        // mList02.add(new SettingBean(R.mipmap.icon_my_new_gzt, "工作台"));
        // mList02.add(new SettingBean(R.mipmap.icon_my_new_zs, "招商"));
        // mList02.add(new SettingBean(R.mipmap.icon_my_new_cyd, "创业店"));
        adapter02 = new GvSettingAdapter(getActivity());
        adapter02.setItemList(mList02);
        gv_02.setAdapter(adapter02);
    }


    @Override
    protected void setListener() {
        //默认是0人脉聊天  1拓商圈   2社团圈   3移动办公

        gv_00.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (mList00.get(position).name) {
                    case "人脉圈":
                        AppConfig.getInstance().setMainType(0);
                        UIManager.turnToAct(getActivity(), MainActivity.class);
                        getActivity().finish();
                        break;
                    case "拓商圈":
                        AppConfig.getInstance().setMainType(1);
                        UIManager.turnToAct(getActivity(), T_MainActivity.class);
                        getActivity().finish();
                        break;
                    case "社团圈":
                        AppConfig.getInstance().setMainType(2);
                        UIManager.turnToAct(getActivity(), S_MainActivity.class);
                        getActivity().finish();
                        break;
                    case "移办公":
                        AppConfig.getInstance().setMainType(3);
                        UIManager.turnToAct(getActivity(), T_PTMainActivity.class);
                        getActivity().finish();
                        break;
                    default:
                        break;
                }
            }
        });
        gv_01.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 2:
                        //收藏
//                        UIManager.turnToAct(getActivity(), MyCollectAct.class);
                        break;
                    default:
                        break;
                }

            }
        });
        gv_02.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        //创业店
                        if (AppConfig.getInstance().getMainType() == 1 || AppConfig.getInstance().getMainType() == 2) {
                            UIManager.turnToAct(getActivity(), CYDActivity.class);
                        } else if (AppConfig.getInstance().getMainType() == 3) {
                            UIManager.turnToAct(getActivity(), T_YBGMainActivity.class);
                        }
                        break;
                    case 6:
                        //设置
//                        UIManager.turnToAct(getActivity(), RmSettingAct.class);
                        break;
                    case 7:
                        //一键呼叫
//                        UIManager.turnToAct(getActivity(), YJHJCameraActivity.class);
                        break;

                    default:
                        break;
                }

            }
        });

    }


}
