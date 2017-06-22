package bro.git.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addSth();
    }

    private void addSth() {
        Log.d("MainActivity", "feature-1提交");
        Log.d("MainActivity", "feature-4提交");


    }
}
