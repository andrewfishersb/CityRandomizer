package fisher.hometown.Zones.Europe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import fisher.hometown.BaseActivity;
import fisher.hometown.R;

public class NorthernEurope extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.northernEuropeanCityName)
    TextView mNorthernCityName;

    @Bind(R.id.denmark)
    Button mDenmark;

    @Bind(R.id.england)
    Button mEngland;

    @Bind(R.id.finland)
    Button mFinland;

    @Bind(R.id.ireland)
    Button mIreland;

    @Bind(R.id.northernIreland)
    Button mNorthernIreland;

    @Bind(R.id.norway)
    Button mNorway;

    @Bind(R.id.russia)
    Button mRussia;

    @Bind(R.id.scotland)
    Button mScotland;

    @Bind(R.id.sweden)
    Button mSweden;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_northern_europe);

        ButterKnife.bind(this);

         mDenmark.setOnClickListener(this);
         mEngland.setOnClickListener(this);
         mFinland.setOnClickListener(this);
         mIreland.setOnClickListener(this);
         mNorthernIreland.setOnClickListener(this);
         mNorway.setOnClickListener(this);
         mRussia.setOnClickListener(this);
         mScotland.setOnClickListener(this);
         mSweden.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == mDenmark){
            displayRandomCity(mNorthernCityName,"denmark.txt");
        }else if(v == mEngland){
            displayRandomCity(mNorthernCityName,"england.txt");
        }else if(v == mFinland){
            displayRandomCity(mNorthernCityName,"finland.txt");
        }else if(v == mIreland){
            displayRandomCity(mNorthernCityName,"ireland.txt");
        }else if(v == mNorthernIreland){
            displayRandomCity(mNorthernCityName,"northern-ireland.txt");
        }else if(v == mNorway){
            displayRandomCity(mNorthernCityName,"norway.txt");
        }else if(v == mRussia){
            displayRandomCity(mNorthernCityName,"russia.txt");
        }else if(v == mScotland){
            displayRandomCity(mNorthernCityName,"scotland.txt");
        }else if(v == mSweden){
            displayRandomCity(mNorthernCityName,"sweden.txt");
        }

    }
}
