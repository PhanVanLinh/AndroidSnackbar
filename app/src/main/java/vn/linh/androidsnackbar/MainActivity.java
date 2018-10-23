package vn.linh.androidsnackbar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_show_snake_bar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSnakeBar();
            }
        });
    }

    private void showSnakeBar() {
        Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content),
                "No Internet Connection " + (++count), Snackbar.LENGTH_LONG);
        setSnakeTextColor(snackbar, Color.RED);
        setSnakeBackground(snackbar, Color.GREEN);
        snackbar.show();
    }

    private void setSnakeTextColor(Snackbar snackbar, int color) {
        TextView tv = snackbar.getView().findViewById(android.support.design.R.id.snackbar_text);
        tv.setTextColor(color);
    }

    private void setSnakeBackground(Snackbar snackbar, int color) {
        snackbar.getView().setBackgroundColor(color);
    }
}
