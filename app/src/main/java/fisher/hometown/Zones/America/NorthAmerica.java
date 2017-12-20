package fisher.hometown.Zones.America;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import fisher.hometown.BaseActivity;
import fisher.hometown.R;

public class NorthAmerica extends BaseActivity implements View.OnClickListener {
    @Bind(R.id.northAmericanCityName)
    TextView mNorthAmericaCityName;

    @Bind(R.id.usa)
    Button mUSA;

    @Bind(R.id.canada)
    Button mCanada;

    @Bind(R.id.mexico)
    Button mMexico;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_america);

        ButterKnife.bind(this);

        mUSA.setOnClickListener(this);
        mCanada.setOnClickListener(this);
        mMexico.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        mNorthAmericaCityName.setText("");
        if (v == mUSA) {
            displayRandomCity(mNorthAmericaCityName, "usa.txt");
        } else if (v == mCanada) {
            displayRandomCity(mNorthAmericaCityName, "canada.txt");
        } else if (v == mMexico) {
            displayRandomCity(mNorthAmericaCityName, "mexico.txt");
        }
    }

}
