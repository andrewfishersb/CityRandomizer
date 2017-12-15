package fisher.hometown;

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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import butterknife.Bind;
import butterknife.ButterKnife;


public class OldMainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.australia)
    Button btnAustralia;

    @Bind(R.id.belgium)
    Button btnBelgium;

    @Bind(R.id.bolivia)
    Button btnBolivia;

    @Bind(R.id.bulgaria)
    Button btnBulgaria;

    @Bind(R.id.england)
    Button btnEngland;

    @Bind(R.id.finland)
    Button btnFinland;

    @Bind(R.id.india)
    Button btnIndia;

    @Bind(R.id.netherlands)
    Button btnNetherlands;

    @Bind(R.id.nigeria)
    Button btnNigeria;

    @Bind(R.id.northernIreland)
    Button btnNorthernIreland;

    @Bind(R.id.paraguay)
    Button btnParaguay;

    @Bind(R.id.peru)
    Button btnPeru;

    @Bind(R.id.russia)
    Button btnRussia;

    @Bind(R.id.serbia)
    Button btnSerbia;

    @Bind(R.id.uruguay)
    Button btnUruguay;

    private ArrayList<City> mCities;
    private LinkedHashMap<String, Integer> mCityMap;

    @Bind(R.id.cityName)
    TextView mCityName;
    private int mRange;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_old);

        ButterKnife.bind(this);

        btnAustralia.setOnClickListener(this);
        btnBelgium.setOnClickListener(this);
        btnBolivia.setOnClickListener(this);
        btnBulgaria.setOnClickListener(this);
        btnEngland.setOnClickListener(this);
        btnFinland.setOnClickListener(this);
        btnIndia.setOnClickListener(this);
        btnNetherlands.setOnClickListener(this);
        btnNigeria.setOnClickListener(this);
        btnNorthernIreland.setOnClickListener(this);
        btnParaguay.setOnClickListener(this);
        btnPeru.setOnClickListener(this);
        btnRussia.setOnClickListener(this);
        btnSerbia.setOnClickListener(this);
        btnUruguay.setOnClickListener(this);
    }

    public String randomizeHomeTown(LinkedHashMap<String, Integer> cities) {
        int generatedNumber = new Random().nextInt(this.mRange) + 1;
        int previousValue = 0;
        Log.d("GENERATEDNUMBER", generatedNumber + "");
        for (Map.Entry<String, Integer> city : cities.entrySet()) {
            if (generatedNumber > ((Integer) city.getValue()).intValue() || generatedNumber <= previousValue) {
                previousValue = ((Integer) city.getValue()).intValue();
            } else {
                Log.d("TESTCITY", ((String) city.getKey()) + " Value: " + city.getValue() + " Random: " + generatedNumber + " PrevValue: " + previousValue);
                return (String) city.getKey();
            }
        }
        return "None";
    }

    public LinkedHashMap<String, Integer> setCityRangeMap(ArrayList<City> cities) {
        LinkedHashMap<String, Integer> cityRangeMap = new LinkedHashMap();
        Iterator it = cities.iterator();
        while (it.hasNext()) {
            City currentCity = (City) it.next();
            this.mRange += currentCity.getPopulation();
            cityRangeMap.put(currentCity.getCityName(), Integer.valueOf(this.mRange));
            Log.d("AddTOMAP", currentCity.getCityName() + " " + currentCity.getPopulation() + " " + this.mRange);
        }
        return cityRangeMap;
    }

    public ArrayList<City> getAllCities(String fileName) throws IOException {
        ArrayList<City> allCities = new ArrayList();
        InputStream is = getAssets().open(fileName);

        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        while (true) {
            String line = reader.readLine();
            if (line != null) {
                String[] splitLine = line.split(",");
                allCities.add(new City(splitLine[0], Integer.parseInt(splitLine[1])));
            } else {
                try {
                    break;
                } catch (Throwable th) {
                }
            }
        }
        is.close();

        return allCities;
    }

    @Override
    public void onClick(View v) {

    }
}