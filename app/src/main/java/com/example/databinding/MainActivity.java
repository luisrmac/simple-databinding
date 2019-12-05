package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity_TAG";
    //    private TextView nameTV;
//    private TextView emailTV;
    private User user;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User();
        user.setName("John");
        user.setEmail("Smith");
        binding.setUser(user);

//        nameTV = findViewById(R.id.userName);
//        emailTV = findViewById(R.id.userEmail);

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void updateUser(View view) {
        Log.d(TAG, "updateUser: called");
        user.setName("Uncle");
        user.setEmail("Bob");
    }

    //    private void updateTextViews() {
//        nameTV.setText(user.getName());
//        emailTV.setText(user.getEmail());
//    }
}