package org.usfirst.frc.team4131.scoutingapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SubmitActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        int number = Integer.valueOf(intent.getStringExtra(MainActivity.TEAM_NUMBER));
        String teamName = intent.getStringExtra(MainActivity.TEAM_NAME);
        String robotName = intent.getStringExtra(MainActivity.ROBOT_NAME);
        String text = "Team " + number + " (" + teamName + ")";
        if(robotName!=null && robotName.length()>0) text = text.concat(": " + robotName);
        TextView view = new TextView(this);
        view.setTextSize(30);
        view.setText(text);
        setContentView(view);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void goHome(View view){
        startActivity(new Intent(this, MainActivity.class));
    }
}
