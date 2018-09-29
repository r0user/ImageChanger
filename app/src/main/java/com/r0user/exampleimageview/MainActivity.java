package com.r0user.exampleimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void imageClick(View view) {

        ImageView image = findViewById(R.id.imageView5);
        image.setImageResource((R.drawable.second));
    }

  /* public void onClickButton (View view){
        ImageView image = findViewById(R.id.imageView4);
        image.setImageResource(R.drawable.second);
 }
    }
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
