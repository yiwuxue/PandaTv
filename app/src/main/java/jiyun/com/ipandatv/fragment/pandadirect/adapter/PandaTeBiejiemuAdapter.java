package jiyun.com.ipandatv.fragment.pandadirect.adapter;

import android.content.Context;
import android.widget.ImageView;

import com.androidkun.adapter.BaseAdapter;
import com.androidkun.adapter.ViewHolder;
import com.bumptech.glide.Glide;

import java.util.List;

import jiyun.com.ipandatv.R;
import jiyun.com.ipandatv.fragment.pandadirect.bean.PandaTeBiejimuBean;

/**
 * Created by INS7566 on 2017/7/14.
 */

public class PandaTeBiejiemuAdapter extends BaseAdapter<PandaTeBiejimuBean.VideoBean> {

    public PandaTeBiejiemuAdapter(Context context, List<PandaTeBiejimuBean.VideoBean> datas) {
        super(context, R.layout.adapter_jcyk, datas);
    }

    @Override
    public void convert(ViewHolder holder, PandaTeBiejimuBean.VideoBean bean) {
        holder.setText(R.id.panda_oculture_item_sp_time, bean.getLen())
                .setText(R.id.panda_culture_item_title, bean.getT())
                .setText(R.id.panda_culture_item_time, bean.getPtime());
        ImageView imageView = holder.getView(R.id.panda_culture_item_image);
        Glide.with(context).load(bean.getImg()).into(imageView);

    }
}
