package fisher.hometown;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class BaseActivity extends AppCompatActivity {

    protected int mRange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        mRange = 0;

        Log.d("TESTTEST","CREATED");
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
