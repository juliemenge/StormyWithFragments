package teamtreehouse.com.stormy.ui;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Arrays;

import teamtreehouse.com.stormy.R;
import teamtreehouse.com.stormy.adapters.DayAdapter;
import teamtreehouse.com.stormy.adapters.HourAdapter;
import teamtreehouse.com.stormy.weather.Day;
import teamtreehouse.com.stormy.weather.Hour;

public class DualPaneFragment extends Fragment {

    private static final String HOURLY_FORECAST = "HOURLY_FORECAST" ;
    private static final String DAILY_FORECAST = "DAILY_FORECAST";
    private RecyclerView mRecyclerView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        //how to get arguments here
        //Bundle bundle = getArguments();
        //Parcelable[] hoursParcelable = bundle.getParcelableArray(MainActivity.HOURLY_FORECAST);

        View view = inflater.inflate(R.layout.fragment_dualpane, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        Bundle bundle = getArguments();
        Parcelable[] parcelables = bundle.getParcelableArray(MainActivity.HOURLY_FORECAST);
        Hour[] hours = (Hour[]) parcelables;

        HourAdapter adapter = new HourAdapter(getActivity(), hours);
        mRecyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(layoutManager);

        mRecyclerView.setHasFixedSize(true);

        /*
        final HourlyWeatherFragment hourlyWeatherFragment = new HourlyWeatherFragment();
        bundle.putParcelableArray(HOURLY_FORECAST, hoursParcelable);
        hourlyWeatherFragment.setArguments(bundle);
        */

        //maybe
        /*
        Bundle bundle = getArguments();
        Parcelable[] hoursParcelables = bundle.getParcelableArray(MainActivity.HOURLY_FORECAST);
        //Hour[] hours = (Hour[]) hoursParcelables;
        //Parcelable[] daysParcelables = bundle.getParcelableArray(MainActivity.DAILY_FORECAST);
        //Day[] days = (Day[]) daysParcelables;
        */



        //how to unpack bundle of two arrays?
        /*
        FragmentManager fragmentManager = getChildFragmentManager();

        HourlyWeatherFragment savedHourlyFragment = (HourlyWeatherFragment) fragmentManager.findFragmentByTag(HOURLY_FORECAST);
        if (savedHourlyFragment == null) {
            HourlyWeatherFragment hourlyWeatherFragment = new HourlyWeatherFragment();
            //how to get bundle arguments
            Parcelable[] hoursParcelable = bundle.getParcelableArray(MainActivity.HOURLY_FORECAST);
            //Hour[] hours = (Hour[]) hoursParcelable;

            fragmentManager.beginTransaction()
                    .add(R.id.leftPlaceholder, hourlyWeatherFragment, HOURLY_FORECAST)
                    .commit();
        }
        */


        /*
        DailyWeatherFragment savedDailyFragment = (DailyWeatherFragment) fragmentManager.findFragmentByTag(DAILY_FORECAST);
        if (savedDailyFragment == null) {
            DailyWeatherFragment dailyWeatherFragment = new DailyWeatherFragment();
            //how to get bundle arguments
            fragmentManager.beginTransaction()
                    .add(R.id.rightPlaceholder, dailyWeatherFragment, DAILY_FORECAST)
                    .commit();
        }
        */







        return view;
    }
}
