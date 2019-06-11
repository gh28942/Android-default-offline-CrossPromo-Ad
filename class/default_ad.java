package your.package.name.here;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

/**
 * by GerH, 11.06.2019
 */
public class default_ad extends AppCompatActivity {

    String ad_url = "http://bit.ly/fitClock";

    //Useful for choosing colors for the gradient background: https://www.sessions.edu/color-calculator/

    public void hideStuff(){
        ActionBar AB = getSupportActionBar();
        android.app.ActionBar AB11 = getActionBar();
        if (AB != null) {
            AB.hide();
        }
        if (AB11 != null) {
            AB11.hide();
        }
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } else {
            View decorView = getWindow().getDecorView();
            // Hide the status bar.
            int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
            decorView.setSystemUiVisibility(uiOptions);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.default_ad);

        hideStuff();

        //make entire view clickable (by using an invisible button that covers the entire screen)
        Button buttonInvisibleDefaultAd = findViewById(R.id.buttonInvisibleDefaultAd);
        buttonInvisibleDefaultAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse(ad_url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
                finish();
            }
        });
    }
}
