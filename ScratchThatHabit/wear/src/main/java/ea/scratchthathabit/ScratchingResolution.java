package ea.scratchthathabit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/**
 * Created by Simon Bonzon on 4/18/2016.
 */
public class ScratchingResolution extends ScratchingAlert {

    private Button mYes;
    private Button mNo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scratching_resolution);
        mYes = (Button) findViewById(R.id.yes);
        mNo = (Button) findViewById(R.id.no);
        mYes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendWearIntent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(sendWearIntent);
            }
        });
        mNo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendWearIntent = new Intent(getBaseContext(), ScratchingSolution.class);
                startActivity(sendWearIntent);
            }
        });
    }
}
