package fisher.hometown.Zones;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import fisher.hometown.BaseActivity;
import fisher.hometown.R;

public class AsiaActivity extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.asiaCityName)
    TextView mAsiaCityName;

    @Bind(R.id.japan)
    Button mJapan;

    @Bind(R.id.china)
    Button mChina;

    @Bind(R.id.korea)
    Button mKorea;

    @Bind(R.id.saudiArabia)
    Button mSaudiArabia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asia);

        ButterKnife.bind(this);

        mJapan.setOnClickListener(this);
        mChina.setOnClickListener(this);
        mKorea.setOnClickListener(this);
        mSaudiArabia.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v == mJapan) {
            displayRandomCity(mAsiaCityName,"japan.txt");
        } else if (v == mChina) {
            displayRandomCity(mAsiaCityName,"china.txt");
        } else if (v == mKorea) {
            displayRandomCity(mAsiaCityName,"south-korea.txt");
        } else if (v == mSaudiArabia) {
            displayRandomCity(mAsiaCityName,"saudi-arabia.txt");
        }
    }
}
