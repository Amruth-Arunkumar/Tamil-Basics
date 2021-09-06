package amruth.in.tamil;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNumbersList(View view) {
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }

    public void openColorsList(View view) {
        Intent b = new Intent(this, ColorsActivity.class);
        startActivity(b);
    }

    public void openFamilyList(View view) {
        Intent c = new Intent(this, FamilyMembersActivity.class);
        startActivity(c);
    }

    public void openPhrasesList(View view) {
        Intent a = new Intent(this, PhrasesActivity.class);
        startActivity(a);
    }
}
