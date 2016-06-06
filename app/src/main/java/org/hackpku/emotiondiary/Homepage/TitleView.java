package org.hackpku.emotiondiary.Homepage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.*;
import android.widget.*;

import org.hackpku.emotiondiary.R;
import org.hackpku.emotiondiary.Stats.ICalendarView;
import org.hackpku.emotiondiary.Stats.StatsActivity;
import org.hackpku.emotiondiary.Stats.StatsView;

/**
 * Created by Liu Zhengyuan on 2016/5/30.
 */
public class TitleView extends FrameLayout {
    private Button btnCamera;
    private Button btnTimeline;
    private TextView titleText;
    private Activity HomePageActivity;
    private ICalendarView calendarView;


    public TitleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title, this);
        titleText = (TextView) findViewById(R.id.title_text);
        btnCamera = (Button) findViewById(R.id.button_camera);
        btnTimeline=(Button)findViewById(R.id.button_timeline);

        btnCamera.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO 相机按钮点击事件，呼出相机
            }
        });

        btnTimeline.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //调出心情统计页面
               Intent intent = new Intent();
              intent.setClass(HomePageActivity,StatsActivity.class);
              HomePageActivity.startActivity(intent);
              calendarView.onStatsView();
            }
        });

    }

}