package teamtreehouse.com.stormy.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import java.util.Arrays;

import butterknife.ButterKnife;
import butterknife.InjectView;
import teamtreehouse.com.stormy.R;
import teamtreehouse.com.stormy.adapters.HourAdapter;
import teamtreehouse.com.stormy.weather.Hour;

public class HourlyWeatherFragment extends Fragment {

    private Hour[] mHours;
    RecyclerView mRecyclerView;

    //@InjectView(R.id.recyclerView) RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hourly_weather, container, false);

        //ButterKnife.inject(getActivity());
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        Bundle bundle = getArguments();
        Parcelable[] parcelables = bundle.getParcelableArray(MainActivity.HOURLY_FORECAST);
        mHours = (Hour[]) parcelables;

        //mHours = Arrays.copyOf(parcelables, parcelables.length, Hour[].class);

        HourAdapter adapter = new HourAdapter(getActivity(), mHours);
        mRecyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(layoutManager);

        mRecyclerView.setHasFixedSize(true);

        return view;
    }
}
