package org.hackpku.emotiondiary.Homepage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.hackpku.emotiondiary.MainApplication;
import org.hackpku.emotiondiary.R;
import org.hackpku.emotiondiary.Stats.StatsActivity;

/**
 * Created by Liu Zhengyuan on 2016/5/30.
 */
public class TitleView extends FrameLayout {
    private Button btnTimeline;
    private RelativeLayout layout;
    private TextView titleText;
    private Activity HomePageActivity;


    public TitleView(final Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title, this);
        titleText = (TextView) findViewById(R.id.title_text);
        btnTimeline=(Button)findViewById(R.id.button_timeline);
        layout=(RelativeLayout)findViewById(R.id.layout);

        int color;
        double smiling = ((MainApplication)((Activity)context).getApplication()).getSmiling();
        if (smiling < 33) color = getResources().getColor(R.color.themeColorBlue);
        else if (smiling > 66) color = getResources().getColor(R.color.themeColorOrange);
        else color = getResources().getColor(R.color.themeColorYellow);
        layout.setBackgroundColor(color);

        btnTimeline.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //调出心情统计页面
                Intent intent = new Intent();
                intent.setClass(context,StatsActivity.class);
                context.startActivity(intent);
            }
        });

    }

}