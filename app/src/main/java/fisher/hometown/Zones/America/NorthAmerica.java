package fisher.hometown.Zones.America;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import butterknife.Bind;
import butterknife.ButterKnife;
import fisher.hometown.City;
import fisher.hometown.R;

public class NorthAmerica extends AppCompatActivity implements View.OnClickListener{
    @Bind(R.id.northAmericanCityName)
    TextView mNorthAmericaCityName;

    @Bind(R.id.usa)
    Button mUSA;

    @Bind(R.id.canada)
    Button mCanada;

    @Bind(R.id.mexico)
    Button mMexico;

    private int mRange;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_america);

        ButterKnife.bind(this);

        mUSA.setOnClickListener(this);
        mCanada.setOnClickListener(this);
        mMexico.setOnClickListener(this);

        mRange= 0;
    }

    @Override
    public void onClick(View v) {
        mNorthAmericaCityName.setText("");
        if(v == mUSA){
            try {
                ArrayList<City> usaCities = getClickedCountriesCities("usa.txt");
                LinkedHashMap<String,Integer> cityRange = setCityRangeMap(usaCities);
                String randomizedCity = randomizeHomeTown(cityRange);
                mNorthAmericaCityName.setText(randomizedCity);
            } catch (IOException e) {
                e.printStackTrace();
            }
            mRange= 0;
        }else if(v == mCanada){
            try {
                ArrayList<City> canadianCities = getClickedCountriesCities("canada.txt");
                LinkedHashMap<String,Integer> cityRange = setCityRangeMap(canadianCities);
                String randomizedCity = randomizeHomeTown(cityRange);
                mNorthAmericaCityName.setText(randomizedCity);
            } catch (IOException e) {
                e.printStackTrace();
            }
            mRange= 0;
        }else if (v == mMexico){
            try {
                ArrayList<City> mexicanCities = getClickedCountriesCities("mexico.txt");
                LinkedHashMap<String,Integer> cityRange = setCityRangeMap(mexicanCities);
                String randomizedCity = randomizeHomeTown(cityRange);
                mNorthAmericaCityName.setText(randomizedCity);
            } catch (IOException e) {
                e.printStackTrace();
            }
            mRange= 0;
        }
    }



    //1) Get Cities
    public ArrayList<City> getClickedCountriesCities(String filename) throws IOException {
        ArrayList<City> allCities = new ArrayList<>();

        InputStream is = getAssets().open(filename);

        BufferedReader reader = new BufferedReader(new InputStreamReader((is)));

        String line = reader.readLine();

        while(line != null){

            String[] splitLine = line.split(",");
            allCities.add(new City(splitLine[0],Integer.parseInt(splitLine[1])));

            line = reader.readLine();

        }

        is.close();

        return allCities;
    }

    //2) Set Range
    public LinkedHashMap<String,Integer> setCityRangeMap(ArrayList<City> cities){

        LinkedHashMap<String,Integer> cityRangeMap = new LinkedHashMap<>();

        for (City currentCity : cities) {
            mRange += currentCity.getPopulation();
            cityRangeMap.put(currentCity.getCityName(),mRange);
            Log.d("AddTOMAP", currentCity.getCityName() + " " + currentCity.getPopulation() + " " + mRange);
        }

        return cityRangeMap;
    }

    //3)Select a random city
    public String randomizeHomeTown(LinkedHashMap<String,Integer> cities){
        int generatedNumber = new Random().nextInt(mRange)+1;
        int previousValue = 0;

        for(Map.Entry<String, Integer> city : cities.entrySet()){
            if(generatedNumber > city.getValue() || generatedNumber <= previousValue){
                previousValue = city.getValue();
            }else{
                Log.d("TESTCITY",  city.getKey() + " Value: " + city.getValue() + " Random: " + generatedNumber + " PrevValue: " + previousValue);

                return city.getKey();
            }

        }

        return "None";
    }


}
