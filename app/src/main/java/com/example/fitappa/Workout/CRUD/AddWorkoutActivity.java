package com.example.fitappa.Workout.CRUD;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.example.fitappa.R;
import com.example.fitappa.Workout.StartWorkoutActivity;

import java.util.Objects;

/**
 * This class is a view class meant to open the activity_create_workout xml, which allows users to create Workouts
 * and add them to Routines
 *
 * The method in the class allows for the creation of multiple Workouts
 *
 * The documentation in this class give a specification on what the methods do
 *
 * @author Abdullah
 * @since 0.3
 */

public class AddWorkoutActivity extends AppCompatActivity implements AddWorkoutPresenter.View {
    private AddWorkoutPresenter presenter;
    /**
     * This method is called when the activity starts.
     *
     * @param savedInstanceState contains the data it was most recently supplied with by onSaveInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_workout);
        this.presenter = new AddWorkoutPresenter(this, getIntent().getSerializableExtra("routine"));
    }


    @Override
    public void updateAppBarTitle(String title) {
        Objects.requireNonNull(getSupportActionBar()).setTitle(title);
    }

    @Override
    public void setupAddWorkoutButton() {
        Button addWorkoutBtn = findViewById(R.id.CreateWorkoutBtn2);
        EditText workoutNameField = findViewById(R.id.WorkoutNameField);
        addWorkoutBtn.setOnClickListener(
                v -> presenter.addWorkoutTemplate(workoutNameField.getText().toString()));
    }

    @Override
    public void exitPage() {
        startActivity(new Intent(this, StartWorkoutActivity.class));

    }


}