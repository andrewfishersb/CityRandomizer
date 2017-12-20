package fisher.hometown.Zones;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import fisher.hometown.BaseActivity;
import fisher.hometown.R;

public class Oceania extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.oceaniaCityName)
    TextView mOceaniaCityTextView;

    @Bind(R.id.australia)
    Button mAustraliaBtn;

    @Bind(R.id.newZealand) Button mNewZealandBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oceania);

        ButterKnife.bind(this);

        mAustraliaBtn.setOnClickListener(this);
        mNewZealandBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mAustraliaBtn){
            displayRandomCity(mOceaniaCityTextView, "australia.txt");
        }else if(v == mNewZealandBtn){
            displayRandomCity(mOceaniaCityTextView, "new-zealand.txt");
        }
    }
}
