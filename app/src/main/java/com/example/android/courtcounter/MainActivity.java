package com.example.android.courtcounter;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    int scoreA = 0;
    int scoreB = 0;

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayA(scoreA);
        displayB(scoreB);
    }

    private void displayA(int number) {
        TextView t = (TextView) findViewById(R.id.teamAScore);
        t.setText("" + number);
    }

    private void displayB(int number) {
        TextView t = (TextView) findViewById(R.id.teamBScore);
        t.setText("" + number);
    }

    public void a3p(View view) {
        scoreA = scoreA + 3;
        displayA(scoreA);
    }

    public void a2p(View view) {
        scoreA = scoreA + 2;
        displayA(scoreA);
    }

    public void aFreeThrow(View view) {
        scoreA = scoreA + 1;
        displayA(scoreA);
    }

    public void b3p(View view) {
        scoreB = scoreB + 3;
        displayB(scoreB);
    }

    public void b2p(View view) {
        scoreB = scoreB + 2;
        displayB(scoreB);
    }

    public void bFreeThrow(View view) {
        scoreB = scoreB + 1;
        displayB(scoreB);
    }


    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.android.courtcounter/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.android.courtcounter/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
