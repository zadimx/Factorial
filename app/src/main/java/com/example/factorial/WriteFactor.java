package com.example.factorial;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.math.BigInteger;

public class WriteFactor extends AppCompatActivity {
    static long tt = 0;
    static String result;
    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_factor);
        textView = findViewById(R.id.resultFactor);
        progressBar = findViewById(R.id.progress);
        String ss = getIntent().getStringExtra("wwww");
        tt = Long.parseLong(ss);
        progressBar.setVisibility(View.VISIBLE);
        new Treads().execute();
        textView.setMovementMethod(new ScrollingMovementMethod());
    }



    class Treads extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            result = getFactorial(tt)+"";
            return null;
        }

        @Override
        protected void onPostExecute(Void integer) {
            super.onPostExecute(integer);
            progressBar.setVisibility(View.GONE);
            textView.setText(result);
        }
    }

    public BigInteger getFactorial(long f) {
        BigInteger result = BigInteger.ONE;
        for (long i = 1; i <= f; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
