package fisher.hometown;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import fisher.hometown.Zones.AfricaActivity;
import fisher.hometown.Zones.America.NorthAmerica;
import fisher.hometown.Zones.America.SouthAmerica;
import fisher.hometown.Zones.AsiaActivity;
import fisher.hometown.Zones.Europe.CentralEurope;
import fisher.hometown.Zones.Europe.NorthernEurope;
import fisher.hometown.Zones.Europe.RestOfEurope;
import fisher.hometown.Zones.Europe.SouthernEurope;
import fisher.hometown.Zones.Oceania;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.northernEurope)
    Button mNorthernEurope;
    @Bind(R.id.southernEurope)
    Button mSouthernEurope;
    @Bind(R.id.centralEurope)
    Button mCentralEurope;
    @Bind(R.id.restOfEurope)
    Button mRestOfEurope;
    @Bind(R.id.northAmerica)
    Button mNorthAmerica;
    @Bind(R.id.southAmerica)
    Button mSouthAmerica;
    @Bind(R.id.africa)
    Button mAfrica;
    @Bind(R.id.asia)
    Button mAsia;
    @Bind(R.id.oceania)
    Button mOceania;
    @Bind(R.id.other)
    Button mOther;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mNorthernEurope.setOnClickListener(this);
        mSouthernEurope.setOnClickListener(this);
        mCentralEurope.setOnClickListener(this);
        mRestOfEurope.setOnClickListener(this);
        mNorthAmerica.setOnClickListener(this);
        mSouthAmerica.setOnClickListener(this);
        mAfrica.setOnClickListener(this);
        mAsia.setOnClickListener(this);
        mOceania.setOnClickListener(this);
        mOther.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if (v == mNorthernEurope) {
            intent = new Intent(this, NorthernEurope.class);

        } else if (v == mSouthernEurope) {
            intent = new Intent(this, SouthernEurope.class);

        } else if (v == mCentralEurope) {
            intent = new Intent(this, CentralEurope.class);

        } else if (v == mRestOfEurope) {
            intent = new Intent(this, RestOfEurope.class);

        } else if (v == mNorthAmerica) {
            intent = new Intent(this, NorthAmerica.class);

        } else if (v == mSouthAmerica) {
            intent = new Intent(this, SouthAmerica.class);

        } else if (v == mAfrica) {
            intent = new Intent(this, AfricaActivity.class);

        } else if (v == mAsia) {
            intent = new Intent(this, AsiaActivity.class);

        } else if (v == mOceania) {
            intent = new Intent(this, Oceania.class);

        } else if (v == mOther) {
            Toast.makeText(this, "TBD", Toast.LENGTH_SHORT).show();
            intent = new Intent();
        }else{
            intent = new Intent();
        }


        startActivity(intent);
    }



}
