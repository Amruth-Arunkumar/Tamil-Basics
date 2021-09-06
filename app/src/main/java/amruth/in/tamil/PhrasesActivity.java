package amruth.in.tamil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("hello", "Vanakkam"));
        words.add(new Word("bye", "Varukiren"));
        words.add(new Word("please", "Thayavu Sethu"));
        words.add(new Word("thank you", "Nandri"));
        words.add(new Word("what is your name?", "Ungal peyar enna?"));
        words.add(new Word("My name is ___", "Yen peyar ___"));
        words.add(new Word("yes", "Aam"));
        words.add(new Word("no", "Illai"));
        words.add(new Word("how are you?", "Neengal Eppadi Irukeenga?"));
        words.add(new Word("sorry", "Mannikkavum"));
        words.add(new Word("how do you say ___ in tamil?", "Tamil il ___ eppadi solvathu?"));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
