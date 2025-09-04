package com.example.relative;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declare UI components
    private TextView titleTextView;
    private ImageView profileImageView;
    private TextView nameTextView;
    private TextView emailTextView;
    private Button continueButton;
    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // This links to your XML layout

        // Initialize UI components
        initializeViews();

        // Set up click listeners
        setupClickListeners();

        // You can also set data programmatically
        setUserData("Nashwa Putri Ayesha", "jane.smith@example.com");
    }

    private void initializeViews() {
        titleTextView = findViewById(R.id.title);
        profileImageView = findViewById(R.id.profile_image);
        nameTextView = findViewById(R.id.name);
        continueButton = findViewById(R.id.button);
        logoutButton = findViewById(R.id.logout_button);
    }

    private void setupClickListeners() {
        // Continue button click listener
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Continue button clicked!", Toast.LENGTH_SHORT).show();
                // Add your continue logic here
            }
        });

        // Logout button click listener
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Logout button clicked!", Toast.LENGTH_SHORT).show();
                // Add your logout logic here
            }
        });

        // Profile image click listener (optional)
        profileImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Profile image clicked!", Toast.LENGTH_SHORT).show();
                // Add profile image click logic here
            }
        });
//LOGOUT
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Berhasil logout!", Toast.LENGTH_SHORT).show();
                finish(); // keluar dari MainActivity
            }
        });

    }


    // Method to set user data programmatically
    public void setUserData(String name, String email) {
        nameTextView.setText(name);
    }

    // Method to change profile image programmatically
    public void setProfileImage(int drawableResourceId) {
        profileImageView.setImageResource(drawableResourceId);
    }

    // Method to update title
    public void setTitleText(String newTitle) {
        titleTextView.setText(newTitle);
    }

    // Example of handling button states
    public void setContinueButtonEnabled(boolean enabled) {
        continueButton.setEnabled(enabled);
        continueButton.setAlpha(enabled ? 1.0f : 0.5f);
    }
}