package fisher.hometown.Zones.Europe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import fisher.hometown.BaseActivity;
import fisher.hometown.R;

public class CentralEurope extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.centralEuropeanCityName)
    TextView mCentralCityName;

    @Bind(R.id.austria)
    Button mAustria;

    @Bind(R.id.belgium)
    Button mBelgium;

    @Bind(R.id.france)
    Button mFrance;

    @Bind(R.id.germany)
    Button mGermany;

    @Bind(R.id.netherlands)
    Button mNetherlands;

    @Bind(R.id.switzerland)
    Button mSwitzerland;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central_europe);

        ButterKnife.bind(this);

        mAustria.setOnClickListener(this);
        mBelgium.setOnClickListener(this);
        mFrance.setOnClickListener(this);
        mGermany.setOnClickListener(this);
        mNetherlands.setOnClickListener(this);
        mSwitzerland.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mAustria){
            displayRandomCity(mCentralCityName,"austria.txt");
        }else if(v == mBelgium){
            displayRandomCity(mCentralCityName,"belgium.txt");
        }else if(v == mFrance){
            displayRandomCity(mCentralCityName,"france.txt");
        }else if(v == mGermany){
            displayRandomCity(mCentralCityName,"germany.txt");
        }else if(v == mNetherlands){
            displayRandomCity(mCentralCityName,"netherlands.txt");
        }else if(v == mSwitzerland){
            displayRandomCity(mCentralCityName,"switzerland.txt");
        }
    }
}
