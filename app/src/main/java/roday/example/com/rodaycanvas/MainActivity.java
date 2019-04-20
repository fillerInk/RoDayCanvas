package roday.example.com.rodaycanvas;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.rm.freedrawview.FreeDrawSerializableState;
import com.rm.freedrawview.FreeDrawView;

public class MainActivity extends AppCompatActivity {

    FreeDrawView freeDrawView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        freeDrawView = findViewById(R.id.drawId);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            /*case R.id.normal:
                paintView.normal();
                return true;
            case R.id.emboss:
                paintView.emboss();
                return true;
            case R.id.blur:
                paintView.blur();
                return true;*/
            case R.id.clear:
                freeDrawView.clearDraw();
                return true;
            case R.id.save:
                // We can take the current state and store it, and can retrieve it later on for
                // reconstructing the image drawn.
                // this can be store din DB, along with some token, so that the location
                // and altitude can determine which saved state to load.
                FreeDrawSerializableState state = freeDrawView.getCurrentViewStateAsSerializable();


        }

        return super.onOptionsItemSelected(item);
    }
}
