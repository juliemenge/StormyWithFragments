package teamtreehouse.com.stormy.ui;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import teamtreehouse.com.stormy.R;
import teamtreehouse.com.stormy.adapters.HourAdapter;
import teamtreehouse.com.stormy.weather.Current;
import teamtreehouse.com.stormy.weather.Day;
import teamtreehouse.com.stormy.weather.Hour;

public class TabletFragment extends Fragment {

    private Hour[] mHours;


    private static final String CURRENT_WEATHER = "current_fragment";
    private final String HOURLY_WEATHER = "hourly_fragment";
    private static final String DAILY_WEATHER = "daily_fragment";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tablet_layout, container, false);


        return view;
    }
}
