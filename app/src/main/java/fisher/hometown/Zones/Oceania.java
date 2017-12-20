package fisher.hometown.Zones;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import butterknife.Bind;
import butterknife.ButterKnife;
import fisher.hometown.BaseActivity;
import fisher.hometown.City;
import fisher.hometown.R;

public class Oceania extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.oceaniaCityName)
    TextView mOceaniaCityTextView;

    @Bind(R.id.australia)
    Button mAustraliaBtn;

    @Bind(R.id.newZealand) Button mNewZealandBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oceania);

        ButterKnife.bind(this);

        mAustraliaBtn.setOnClickListener(this);
        mNewZealandBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mAustraliaBtn){
            try {
                ArrayList<City> australianCities = getClickedCountriesCities("australia.txt");
                LinkedHashMap<String,Integer> cityRange = setCityRangeMap(australianCities);
                String randomizedCity = randomizeHomeTown(cityRange);
                mOceaniaCityTextView.setText(randomizedCity);
            } catch (IOException e) {
                e.printStackTrace();
            }
            mRange= 0;
        }else if(v == mNewZealandBtn){
            try {
                ArrayList<City> nzCities = getClickedCountriesCities("new-zealand.txt");
                LinkedHashMap<String,Integer> cityRange = setCityRangeMap(nzCities);
                String randomizedCity = randomizeHomeTown(cityRange);
                mOceaniaCityTextView.setText(randomizedCity);
            } catch (IOException e) {
                e.printStackTrace();
            }
            mRange= 0;
        }
    }
}
