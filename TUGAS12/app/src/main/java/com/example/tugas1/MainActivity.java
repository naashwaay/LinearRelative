package com.example.tugas1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.appcompat.widget.SwitchCompat;


public class MainActivity extends AppCompatActivity {

    private Button tab1, tab2, tab3;
    private LinearLayout homeTab, profileTab, settingsTab;
    private SwitchCompat switchNotifications, switchDarkmode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons
        tab1 = findViewById(R.id.tab1);
        tab2 = findViewById(R.id.tab2);
        tab3 = findViewById(R.id.tab3);

        // Initialize tab content areas
        homeTab = findViewById(R.id.home_tab);
        profileTab = findViewById(R.id.profile_tab);
        settingsTab = findViewById(R.id.settings_tab);

        // Initialize switches
        switchNotifications = findViewById(R.id.switch_notifications);
        switchDarkmode = findViewById(R.id.switch_darkmode);

        // Set initial active tab
        setActiveTab(tab1, homeTab);

        // Set click listeners for tabs
        tab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveTab(tab1, homeTab);
            }
        });

        tab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveTab(tab2, profileTab);
            }
        });

        tab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveTab(tab3, settingsTab);
            }
        });
    }

    private void setActiveTab(Button activeButton, LinearLayout activeTab) {
        // Reset all buttons
        resetAllTabs();

        // Set active button style
        activeButton.setTextColor(getResources().getColor(android.R.color.white));
        activeButton.setBackgroundTintList(ContextCompat.getColorStateList(this, android.R.color.holo_blue_dark));

        // Hide all tabs
        homeTab.setVisibility(View.GONE);
        profileTab.setVisibility(View.GONE);
        settingsTab.setVisibility(View.GONE);

        // Show active tab
        activeTab.setVisibility(View.VISIBLE);
    }

    private void resetAllTabs() {
        // Reset all button styles
        tab1.setTextColor(getResources().getColor(android.R.color.black));
        tab2.setTextColor(getResources().getColor(android.R.color.black));
        tab3.setTextColor(getResources().getColor(android.R.color.black));

        tab1.setBackgroundTintList(ContextCompat.getColorStateList(this, android.R.color.white));
        tab2.setBackgroundTintList(ContextCompat.getColorStateList(this, android.R.color.white));
        tab3.setBackgroundTintList(ContextCompat.getColorStateList(this, android.R.color.white));
    }

    // Handle button click in home tab
    public void onHomeButtonClick(View view) {
        Toast.makeText(this, "Home button clicked!", Toast.LENGTH_SHORT).show();
    }
}