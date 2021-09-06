package amruth.in.tamil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father", "Appa", R.drawable.family_father));
        words.add(new Word("mother", "Amma", R.drawable.family_mother));
        words.add(new Word("son", "Magan", R.drawable.family_son));
        words.add(new Word("daughter", "Magal", R.drawable.family_daughter));
        words.add(new Word("older brother", "Anaa", R.drawable.family_older_brother));
        words.add(new Word("younger brother", "Thambi", R.drawable.family_younger_brother));
        words.add(new Word("older sister", "Akaa", R.drawable.family_older_sister));
        words.add(new Word("younger sister", "Thangachi", R.drawable.family_younger_sister));
        words.add(new Word("grandmother", "Patti", R.drawable.family_grandmother));
        words.add(new Word("grandfather", "Thatha", R.drawable.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
