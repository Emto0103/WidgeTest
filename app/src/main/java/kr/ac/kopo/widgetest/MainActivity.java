package kr.ac.kopo.widgetest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enabled_clickable_test);

//        rg = findViewById(R.id.rg);
//
//        Button button = findViewById(R.id.rb_button);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String result = "";
//
//                if(rg.getCheckedRadioButtonId() == R.id.rb_male)
//                    result = getResources().getString(R.string.male);
//                else
//                    result = getResources().getString(R.string.female);
//
//                Toast toast = Toast.makeText(getApplicationContext(), result+"를 선택하였습니다.", Toast.LENGTH_LONG);
//                toast.show();
//
//            }
//        });
    }
}