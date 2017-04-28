package sg.edu.rp.c346.demoimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ivDay1 = (ImageView) findViewById(R.id.imageView1);
        ImageView ivDay2 = (ImageView) findViewById(R.id.imageView2);
        ImageView ivDay3 = (ImageView) findViewById(R.id.imageView3);
        ImageView ivDay4 = (ImageView) findViewById(R.id.imageView4);
        ImageView ivDay5 = (ImageView) findViewById(R.id.imageView5);



        //Set the images from the file drawable .png
        ivDay1.setImageResource(R.drawable.day1);
        ivDay2.setImageResource(R.drawable.day2);
        ivDay3.setImageResource(R.drawable.day3);
        ivDay4.setImageResource(R.drawable.day4);
        ivDay5.setImageResource(R.drawable.day5);

    }
}
