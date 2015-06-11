package net.rayray.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.content.Context;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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

    public void spotifyToast(View view) {
        // Do something when the spotify button is clicked
        doMyToast("This will launch my Spotify App!");
    }

    public void scoresToast(View view) {
        // Do something when the scores button is clicked
        doMyToast("This will launch my Scores App!");
    }

    public void libraryToast(View view) {
        // Do something when the library button is clicked
        doMyToast("This will launch my Library App!");
    }

    public void bibToast(View view) {
        // Do something when the build it bigger button is clicked
        doMyToast("This will launch my Build It Bigger App!");
    }

    public void xyzToast(View view) {
        // Do something when the xyz reader button is clicked
        doMyToast("This will launch my XYZ Reader App!");
    }

    public void capstoneToast(View view) {
        // Do something when the capstone button is clicked
        doMyToast("This will launch my Capstone App!");
    }

    private void doMyToast(String toastString) {
        // Display a Toast with toastString
        Context context = getApplicationContext();
        CharSequence text = toastString;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
