package fisher.hometown.Zones.Europe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import fisher.hometown.BaseActivity;
import fisher.hometown.R;

public class SouthernEurope extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.southernEuropeCityName)
    TextView mSouthernEuropeCityName;

    @Bind(R.id.italy)
    Button mItaly;

    @Bind(R.id.portugal)
    Button mPortugal;

    @Bind(R.id.turkey)
    Button mTurkey;

    @Bind(R.id.spain)
    Button mSpain;

    @Bind(R.id.croatia)
    Button mCroatia;

    @Bind(R.id.greece)
    Button mGreece;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_southern_europe);

        ButterKnife.bind(this);

        mItaly.setOnClickListener(this);
        mPortugal.setOnClickListener(this);
        mTurkey.setOnClickListener(this);
        mSpain.setOnClickListener(this);
        mCroatia.setOnClickListener(this);
        mGreece.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == mItaly) {
            displayRandomCity(mSouthernEuropeCityName,"italy.txt");
        } else if (v == mPortugal) {
            displayRandomCity(mSouthernEuropeCityName,"portugal.txt");
        } else if (v == mTurkey) {
            displayRandomCity(mSouthernEuropeCityName,"turkey.txt");
        } else if (v == mSpain) {
            displayRandomCity(mSouthernEuropeCityName,"spain.txt");
        } else if (v == mCroatia) {
            displayRandomCity(mSouthernEuropeCityName,"croatia.txt");
        } else if (v == mGreece) {
            displayRandomCity(mSouthernEuropeCityName,"greece.txt");
        }
    }
}
