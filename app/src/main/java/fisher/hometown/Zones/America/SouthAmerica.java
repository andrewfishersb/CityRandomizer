package fisher.hometown.Zones.America;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import fisher.hometown.BaseActivity;
import fisher.hometown.R;

public class SouthAmerica extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.southAmericanCityName)
    TextView mSouthAmericanCityName;

    @Bind(R.id.argentina)
    Button mArgentina;

    @Bind(R.id.bolivia)
    Button mBolivia;

    @Bind(R.id.brazil)
    Button mBrazil;

    @Bind(R.id.chile)
    Button mChile;

    @Bind(R.id.colombia)
    Button mColombia;

    @Bind(R.id.ecuador)
    Button mEcuador;

    @Bind(R.id.paraguay)
    Button mParaguay;

    @Bind(R.id.peru)
    Button mPeru;

    @Bind(R.id.uruguay)
    Button mUruguay;

    @Bind(R.id.venezuela)
    Button mVenezuela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south_america);

        ButterKnife.bind(this);

        mArgentina.setOnClickListener(this);
        mBolivia.setOnClickListener(this);
        mBrazil.setOnClickListener(this);
        mChile.setOnClickListener(this);
        mColombia.setOnClickListener(this);
        mEcuador.setOnClickListener(this);
        mParaguay.setOnClickListener(this);
        mPeru.setOnClickListener(this);
        mUruguay.setOnClickListener(this);
        mVenezuela.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v == mArgentina){
            displayRandomCity(mSouthAmericanCityName,"argentina.txt");
        }else if(v == mBolivia){
            displayRandomCity(mSouthAmericanCityName,"bolivia.txt");
        }else if(v == mBrazil){
            displayRandomCity(mSouthAmericanCityName,"brazil.txt");
        }else if(v == mChile){
            displayRandomCity(mSouthAmericanCityName,"chile.txt");
        }else if(v == mColombia){
            displayRandomCity(mSouthAmericanCityName,"colombia.txt");
        }else if(v == mEcuador){
            displayRandomCity(mSouthAmericanCityName,"ecuador.txt");
        }else if(v == mParaguay){
            displayRandomCity(mSouthAmericanCityName,"paraguay.txt");
        }else if(v == mPeru){
            displayRandomCity(mSouthAmericanCityName,"peru.txt");
        }else if(v == mUruguay){
            displayRandomCity(mSouthAmericanCityName,"uruguay.txt");
        }else if(v == mVenezuela){
            displayRandomCity(mSouthAmericanCityName,"venezuela.txt");
        }

    }
}
