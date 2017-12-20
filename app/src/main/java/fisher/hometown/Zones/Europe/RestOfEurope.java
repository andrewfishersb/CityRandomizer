package fisher.hometown.Zones.Europe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import fisher.hometown.BaseActivity;
import fisher.hometown.R;

public class RestOfEurope extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.restOfEuropeCityName)
    TextView mRestCityNames;

    @Bind(R.id.slovenia)
    Button mSlovenia;

    @Bind(R.id.slovakia)
    Button mSlovakia;

    @Bind(R.id.serbia)
    Button mSerbia;

    @Bind(R.id.romania)
    Button mRomania;

    @Bind(R.id.poland)
    Button mPoland;

    @Bind(R.id.czechRepublic)
    Button mCzechRepublic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest_of_europe);

        ButterKnife.bind(this);

         mSlovenia.setOnClickListener(this);
         mSlovakia.setOnClickListener(this);
         mSerbia.setOnClickListener(this);
         mRomania.setOnClickListener(this);
         mPoland.setOnClickListener(this);
         mCzechRepublic.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == mSlovenia){
            displayRandomCity(mRestCityNames,"slovenia.txt");
        }else if(v == mSlovakia){
            displayRandomCity(mRestCityNames,"slovakia.txt");
        }else if(v == mSerbia){
            displayRandomCity(mRestCityNames,"serbia.txt");
        }else if(v == mRomania){
            displayRandomCity(mRestCityNames,"romania.txt");
        }else if(v == mPoland){
            displayRandomCity(mRestCityNames,"poland.txt");
        }else if(v == mCzechRepublic){
            displayRandomCity(mRestCityNames, "czech-republic.txt");
        }
    }
}
