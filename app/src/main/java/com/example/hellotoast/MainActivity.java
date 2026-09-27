/*RAJA KHUBAB HAYAT 5G
        COMPITO:
        Implementare l'app contatore in Android con incremento e decremento*/

package com.example.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private int mCount= 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mShowCount = findViewById(R.id.show_count);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
        }

        public void countUp(View view) {
            mCount++;
            mShowCount.setText(Integer.toString(mCount));
        }
         public void countDown(View view) {
        mCount --;
        mShowCount.setText(Integer.toString(mCount));
    }
public void resetCount(View view){
        mCount=0;
        mShowCount.setText(Integer.toString(mCount));
}

}



